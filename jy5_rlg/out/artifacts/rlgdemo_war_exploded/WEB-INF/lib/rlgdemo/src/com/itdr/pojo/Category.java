package com.itdr.pojo;

public class Category {
    private Integer categoryid;
    private String categoryname;
    private String status;
    private Integer parentid;

//    @Override
//    public String toString() {
//        return "Category{" +
//                "categoryid=" + categoryid +
//                ", categoryname='" + categoryname + '\'' +
//                ", status='" + status + '\'' +
//                ", parentid=" + parentid +
//                '}';
//    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer catagoryid) {
        this.categoryid = catagoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String catagoryname) {
        this.categoryname = catagoryname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
