package com.itdr.pojo;

public class Users {
    private Integer id;
    private String uname;
    private String psd;
    private String tel;
    private Integer type = 0;
    private Integer stats = 0;
    private Integer supers = 0;

//    @Override
//    public String toString() {
//        return "Users{" +
//                "id=" + id +
//                ", uname='" + uname + '\'' +
//                ", psd='" + psd + '\'' +
//                ", tel='" + tel + '\'' +
//                ", type=" + type +
//                ", stats=" + stats +
//                ", supers=" + supers +
//                '}';
//    }

    public Integer getSupers() {
        return supers;
    }

    public void setSupers(Integer supers) {
        this.supers = supers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStats() {
        return stats;
    }

    public void setStats(Integer stats) {
        this.stats = stats;
    }
}
