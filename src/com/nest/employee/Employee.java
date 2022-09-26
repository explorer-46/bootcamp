package com.nest.employee;


import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int choice;
        String empName;
        ArrayList<String> emp=new ArrayList<>();
        while (true){

            System.out.println("Select your choice");
            System.out.println("1.ADD");
            System.out.println("2.View");
            System.out.println("3.Exit");
            Scanner sc= new Scanner(System.in);
            choice=sc.nextInt();


            switch(choice)
            {
                case 1:
                    System.out.println("Add the employees");
                    empName=sc.next();
                    emp.add(empName);

                    break;
                case 2:
                    if(emp.size()==0)
                    {
                        System.out.println("no Employe name");
                    }
                    else {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.exit(0);

            }
        }
    }
}
