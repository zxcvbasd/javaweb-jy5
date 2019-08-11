package com.itdr.pojo;

public class Order {
    private Integer orderno;
    private Double payment;
    private Integer paymenttype;
    private String paymenttypedesc;
    private Integer postage;
    private Integer status;
    private String statusdesc;
    private String paymenttime;
    private String orderitemvolist;
    private String imagehost;
    private Integer shippingid;
    private String shippingvo;

//    @Override
//    public String toString() {
//        return "Order{" +
//                "orderno=" + orderno +
//                ", payment=" + payment +
//                ", paymenttype=" + paymenttype +
//                ", paymenttypedesc='" + paymenttypedesc + '\'' +
//                ", postage=" + postage +
//                ", status=" + status +
//                ", statusdesc='" + statusdesc + '\'' +
//                ", paymenttime='" + paymenttime + '\'' +
//                ", orderitemvolist='" + orderitemvolist + '\'' +
//                ", imagehost='" + imagehost + '\'' +
//                ", shippingid='" + shippingid + '\'' +
//                ", shippingvo='" + shippingvo + '\'' +
//                '}';
//    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Integer getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getPaymenttypedesc() {
        return paymenttypedesc;
    }

    public void setPaymenttypedesc(String paymenttypedesc) {
        this.paymenttypedesc = paymenttypedesc;
    }

    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc;
    }

    public String getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(String paymenttime) {
        this.paymenttime = paymenttime;
    }

    public String getOrderitemvolist() {
        return orderitemvolist;
    }

    public void setOrderitemvolist(String orderitemvolist) {
        this.orderitemvolist = orderitemvolist;
    }

    public String getImagehost() {
        return imagehost;
    }

    public void setImagehost(String imagehost) {
        this.imagehost = imagehost;
    }

    public Integer getShippingid() {
        return shippingid;
    }

    public void setShippingid(Integer shippingid) {
        this.shippingid = shippingid;
    }

    public String getShippingvo() {
        return shippingvo;
    }

    public void setShippingvo(String shippingvo) {
        this.shippingvo = shippingvo;
    }
}
