package org.example;

import com.Banking.repositories.CustomerDAO;
import com.Banking.util.DBCon;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        CustomerDAO Cobj = new CustomerDAO();
        while (true) {
            System.out.println("\n 1: display customer 2: insert customer 3:update customer by id 4:delete by id 5:exit");
            System.out.println("enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: Cobj.getAll();
                    break;
                case 2:  Cobj.InsertCustomer();
                         Cobj.getAll();
                        break;
                case 3: Cobj.UpdateById();
                        break;
                case 4: Cobj.DeleteById();
                        break;
                case 5: System.exit(0);break;
            }
        }




    }
}