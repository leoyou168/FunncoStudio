package com.funnco.funnco.bean;

import java.util.List;

/**
 * 用于返回的带有letter的预约客户集合
 * Created by user on 2015/6/17.
 * @author Shawn
 */
public class MyCustomerDParent {

    private String date;
    private List<MyCustomerD> list;
    private String tip;
    private String week;
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public List<MyCustomerD> getList() {
        return list;
    }

    public void setList(List<MyCustomerD> list) {
        this.list = list;
    }

    public MyCustomerDParent(String date, String tip, String week, List<MyCustomerD> list) {
        this.date = date;
        this.tip = tip;
        this.week = week;
        this.list = list;
    }

    public MyCustomerDParent() {
    }

    @Override
    public String toString() {
        return "MyCustomerDParent{" +
                "date='" + date + '\'' +
                ", tip='" + tip + '\'' +
                ", week='" + week + '\'' +
                ", list=" + list +
                '}';
    }
}
