package entity;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String privsid;
    private String privsname;
    private String privslevel;
    private String privsfatherid;
    private String privsurl;
    private String privsstatus;
    @Override
    public String toString() {
        return "Menu privsname=" + privsname + ", privslevel=" + privslevel
                + ", privsfatherid=" + privsfatherid + ", privsurl=" + privsurl + ", privsstatus=" + privsstatus
                + ", menu=" + menu + "]";
    }

    private List<Menu> menu=new ArrayList<Menu>();
    public Menu() {

    }
    public Menu(String privsid, String privsname, String privslevel, String privsfatherid, String privsurl,
                String privsstatus) {
        super();
        this.privsid = privsid;
        this.privsname = privsname;
        this.privslevel = privslevel;
        this.privsfatherid = privsfatherid;
        this.privsurl = privsurl;
        this.privsstatus = privsstatus;

    }


    public List<Menu> getMenu() {
        return menu;
    }
    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }
    public String getprivsid() {
        return privsid;
    }
    public void setprivsid(String privsid) {
        this.privsid = privsid;
    }

    public String getPrivsname() {
        return privsname;
    }
    public void setPrivsname(String privsname) {
        this.privsname = privsname;
    }
    public String getPrivslevel() {
        return privslevel;
    }
    public void setPrivslevel(String privslevel) {
        this.privslevel = privslevel;
    }
    public String getPrivsfatherid() {
        return privsfatherid;
    }
    public void setPrivsfatherid(String privsfatherid) {
        this.privsfatherid = privsfatherid;
    }
    public String getPrivsurl() {
        return privsurl;
    }
    public void setPrivsurl(String privsurl) {
        this.privsurl = privsurl;
    }
    public String getPrivsstatus() {
        return privsstatus;
    }
    public void setPrivsstatus(String privsstatus) {
        this.privsstatus = privsstatus;
    }


}
