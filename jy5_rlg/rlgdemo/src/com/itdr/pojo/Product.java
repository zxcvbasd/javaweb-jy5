package com.itdr.pojo;

import java.math.BigDecimal;

public class Product {
    private Integer id;
    private String pname;
    private Integer categoryid;
    private String subtitle;
    private String mainimage;
    private Integer status;
    private Double price;

//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", pname='" + pname + '\'' +
//                ", categoryid=" + categoryid +
//                ", subtitle='" + subtitle + '\'' +
//                ", mainimage='" + mainimage + '\'' +
//                ", status=" + status +
//                ", price=" + price +
//                '}';
//    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMainimage() {
        return mainimage;
    }

    public void setMainimage(String mainimage) {
        this.mainimage = mainimage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
