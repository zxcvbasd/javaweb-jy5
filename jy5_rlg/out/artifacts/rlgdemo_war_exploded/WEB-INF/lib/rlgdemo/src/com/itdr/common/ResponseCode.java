package com.itdr.common;

public class ResponseCode<T> {
    private Integer status;
    private T date;
    private String mag;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    //成功的时候只要返回状态码和成功获取的数据就可以了
    public static<T> ResponseCode successRS(Integer status,T data){
        ResponseCode rs = new ResponseCode();
        rs.setStatus(status);
        rs.setDate(data);
        return rs;
    }

    public static<T> ResponseCode successRS(T data){
        ResponseCode rs = new ResponseCode();
        rs.setStatus(0);
        rs.setDate(data);
        return rs;
    }
    //失败的时候只要返回状态码和失败的信息就可以了
    public static<T> ResponseCode defeatedRS(Integer status,String mag){
        ResponseCode rs = new ResponseCode();
        rs.setStatus(status);
        rs.setMag(mag);
        return rs;
    }

//    @Override
//    public String toString() {
//        return "ResponseCode{" +
//                "status=" + status +
//                ", date=" + date +
//                ", mag='" + mag + '\'' +
//                '}';
//    }
}
