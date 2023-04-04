package com.Banking.entities;

import com.Banking.repositories.CustomerDAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Customer
{
    private  int cid;
    private String cname;
    private String address;
    private long phone;
    private String gender;
    private LocalDate Datecreated;


    public Customer(int cid, String cname, String address, long phone, String gender, LocalDate datecreated) {
        this.cid = cid;
        this.cname = cname;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.Datecreated = datecreated;
    }
    public Customer(){

    }

    @Override
    public String toString() {
        return "\n Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", gender='" + gender + '\'' +
                ", Datecreated=" + Datecreated +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDatecreated() {
        return Datecreated;
    }

    public void setDatecreated() {
        this.Datecreated = LocalDate.now();
    }
}
