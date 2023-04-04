package com.Banking.service;

import com.Banking.entities.Customer;

import java.util.Scanner;

public class CustomerService {
    Scanner sc=new Scanner(System.in);

    public Customer add()
    {
        Customer c1=new Customer();
        System.out.println("enter Customer ID");
        c1.setCid(sc.nextInt());
        System.out.println("enter Customer name");
        c1.setCname(sc.next());
        System.out.println("enter Customer address");
        c1.setAddress(sc.next());
        System.out.println("enter Customer phone");
        c1.setPhone(sc.nextLong());
        System.out.println("enter Customer gender");
        c1.setGender(sc.next());
        c1.setDatecreated();

        return c1;
    }
    public Customer updateById()
    {
        Customer c2=new Customer();
        System.out.println("enter Customer name");
        c2.setCname(sc.next());
        System.out.println("enter Customer address");
        c2.setAddress(sc.next());
        System.out.println("enter Customer phone");
        c2.setPhone(sc.nextLong());
        System.out.println("enter Customer gender");
        c2.setGender(sc.next());
        c2.setDatecreated();

        return c2;
    }
}
