package com.nest.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class hotelBill {
    public static void main(String[] args) {
        int qty,choice,total=0;
        ArrayList<String> item=new ArrayList<>();
        ArrayList<Integer> quantity=new ArrayList<>();
        while(true){
            System.out.println("choose the items");
            System.out.println("1.Coffee--15/-");
            System.out.println("2.Shake--60/-");
            System.out.println("3.Biriyani--110/-");
            System.out.println("4.Alfaham--140/-");
            System.out.println("5.Bill");
            System.out.println("6.Exit");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.println("Enter the Quantity");
                    qty= sc.nextInt();
                    item.add("coffee");
                    quantity.add(qty);
                    total=(15*qty)+total;
                    break;

                case 2:
                    System.out.println("Enter the Quantity");
                    qty= sc.nextInt();
                    item.add("Shake");
                    quantity.add(qty);
                    total=(60*qty)+total;
                    break;

                case 3:
                    System.out.println("Enter the Quantity");
                    qty= sc.nextInt();
                    item.add("Biriyani");
                    quantity.add(qty);
                    total=(110*qty)+total;
                    break;

                case 4:
                    System.out.println("Enter the Quantity");
                    qty= sc.nextInt();
                    item.add("Alfaham");
                    quantity.add(qty);
                    total=(140*qty)+total;
                    break;

                case 5:
                    System.out.println("\tBILL");
                    System.out.println("***************");
                    for(int i=0;i<=item.size()-1;i++)
                    {
                        System.out.println("ITEM NAME:"+item.get(i)+"\tQTY:"+quantity.get(i));

                    }
                    System.out.println("Total money you want to pay is \t"+total);
                    break;

                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
