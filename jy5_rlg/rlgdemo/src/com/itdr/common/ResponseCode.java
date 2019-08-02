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

    @Override
    public String toString() {
        return "ResponseCode{" +
                "status=" + status +
                ", date=" + date +
                ", mag='" + mag + '\'' +
                '}';
    }
}
