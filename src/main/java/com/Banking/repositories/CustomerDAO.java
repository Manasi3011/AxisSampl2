package com.Banking.repositories;

import com.Banking.entities.Customer;
import com.Banking.service.CustomerService;
import com.Banking.service.Icustomer;
import com.Banking.util.DBCon;

import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Date;

public class CustomerDAO implements Icustomer {

    Scanner sc=new Scanner(System.in);
    Connection con;
    ResultSet rs;
    Customer c;
    String Query="";
    CustomerService CustServiceobj=new CustomerService();
    {
        try {
            con = DBCon.getConection();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAll()
    {
        ArrayList<Customer> custList=new ArrayList<Customer>();
        try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery("select * from customer");

            while (rs.next()) {
                int cid = rs.getInt(1);
                String cname = rs.getString(2);
                String address = rs.getString(3);
                long phone = rs.getLong(4);
                String gender = rs.getString(5);
                Date createdDate=rs.getDate(6);

                c = new Customer();
                c.setCid(cid);
                c.setCname(cname);
                c.setAddress(address);
                c.setPhone(phone);
                c.setGender(gender);
                c.setDatecreated();
                //c.setDatecreated(createdDate);

                custList.add(c);


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //print arraylist
        System.out.println(custList);


    }

    public void InsertCustomer(){


        c=CustServiceobj.add();
        try {
            Query="insert into customer values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(Query);
            stmt.setInt(1, c.getCid());
            stmt.setString(2, c.getCname());
            stmt.setString(3, c.getAddress());
            stmt.setLong(4,c.getPhone());
            stmt.setString(5,c.getGender());
            stmt.setDate(6, java.sql.Date.valueOf(c.getDatecreated()));

            int i = stmt.executeUpdate();
            if(i>0)
                System.out.println(i + " records inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void UpdateById()
    {
        System.out.println("enter ID you want to update");
        int cid=sc.nextInt();
        try {
            Statement stmt1 = con.createStatement();
            Query="select * from customer where cid="+cid;
            rs = stmt1.executeQuery(Query);
            if(rs==null)
                System.out.println("Customer id does not Exist");
            else {
                Customer c1 = CustServiceobj.updateById();
                Query="update customer set cname=?,address=?,Phone=?,gender=?,DateCreated=? where cid=?";
                PreparedStatement stmt = con.prepareStatement(Query);
                stmt.setString(1, c1.getCname());
                stmt.setString(2, c1.getAddress());
                stmt.setLong(3,c1.getPhone());
                stmt.setString(4,c1.getGender());
                stmt.setDate(5, java.sql.Date.valueOf(c1.getDatecreated()));
                stmt.setInt(6, cid);
                int i = stmt.executeUpdate();
                if(i>0)
                    System.out.println(i + " records inserted");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void DeleteById()
    {
        System.out.println("enter ID you want to delete");
        int cid=sc.nextInt();
        try {
            Statement stmt1 = con.createStatement();
            Query="select * from customer where cid="+cid;
            rs = stmt1.executeQuery(Query);
            if(rs==null)
                System.out.println("Customer id does not Exist");
            else {
                Query="delete from customer where cid=?";
                PreparedStatement stmt = con.prepareStatement(Query);
                stmt.setInt(1, cid);
                int i = stmt.executeUpdate();
                if(i>0)
                    System.out.println(i + " records deleted");
            }
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }







}
