package com.itdr.pojo;

public class Supervise {
    private Integer gid;
    private String sname;
    private Integer status = 0;

//    @Override
//    public String toString() {
//        return "Supervise{" +
//                "gid=" + gid +
//                ", sname='" + sname + '\'' +
//                ", status=" + status +
//                '}';
//    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
