package util;

import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Dbutil {
	/**
	 * ������ɾ�Ĳ�
	 */
	private static Properties properties=new Properties();
	private static ThreadLocal<Connection> Local=new ThreadLocal<Connection>();
	static {
		try {
			properties.load(Dbutil.class.getClassLoader().getResourceAsStream("db.properties"));
			System.out.println("���óɹ�");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ�");
			System.out.println(properties.getProperty("url"));
		}catch (ClassNotFoundException e) {
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}
	}
	public static Connection openConnection() {
		Connection conn =Local.get();

		try {
			if(conn==null||conn.isClosed()) {
				conn=DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),properties.getProperty("password"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * DML sql update
	 */
	public static int update(String sql,Object...params) {
		Connection  conn= openConnection();
		int row=0;
		PreparedStatement pst=null;
		try {
			pst=conn.prepareStatement(sql);
			if(params!=null) {
				for(int i=0;i<params.length;i++) {
					try {
						pst.setObject(i+1, params[i]);
					} catch (SQLException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				System.out.println(pst);
				row=pst.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		finally {
			if(pst!=null) {
				try {
					pst.close();
				}catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}

			}
		}
		return row;
	}
	/**
	 *
	 * @param sql DQL query
	 * @param params
	 * @return
	 */
	public static List<Map<String,Object>> query(String sql,Object...params){
		Connection  conn= openConnection();
		List<Map<String,Object>> list=null;
		ResultSet rs=null;
		PreparedStatement pst=null;
		try {
			pst=conn.prepareStatement(sql);
			if(params!=null) {
				for(int i=0;i<params.length;i++) {
					try {
						pst.setObject(i+1, params[i]);
					} catch (SQLException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				rs=pst.executeQuery();//ִ�в�ѯ
				ResultSetMetaData rsmd=rs.getMetaData();//���Ԫ���ݣ�������У�
				int count =rsmd.getColumnCount();
				list=new ArrayList<Map<String,Object>>();
				while(rs.next()) {
					Map<String,Object> hashmap=new HashMap<String,Object>();
					for(int i=0;i<count;i++) {
						hashmap.put(rsmd.getColumnLabel(i+1), rs.getObject(i+1));
					}
					list.add(hashmap);
				}
			}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			throw new RuntimeException("ִ��dml����");
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			if(pst!=null) {
				try {
					pst.close();
				} catch (SQLException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	public static void  close() {
		Connection conn=Local.get();
		if(conn!=null) {
			try {
				conn.close();
				Local.remove();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
} 
