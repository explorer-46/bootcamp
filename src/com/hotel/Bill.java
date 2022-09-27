package com.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        int qty, choice, total = 0, ch,c;
        Fooditems fd = new Fooditems(10, 20, 110, 140);
        Fooditems dy = new Fooditems(15, 60, 130, 150);
        ArrayList<String> item = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        while (true) {
            System.out.println("Select your case");
            System.out.println("1.Normal case");
            System.out.println("2.Takeway");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();

            switch(choice) {

                case 1:
                    while (true) {
                        System.out.println("choose the items");
                        System.out.println("1.Coffee Price=" + fd.getCoffee());
                        System.out.println("2.Shake price=" + fd.getShake());
                        System.out.println("3.Biriyani price" + fd.getBiriyani());
                        System.out.println("4.Alfaham price=" + fd.getAlfaham());
                        System.out.println("5.Bill");
                        System.out.println("6.Exit");
                        ch = sc.nextInt();

                        switch (ch) {
                            case 1:

                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                item.add("coffee");
                                quantity.add(qty);
                                total = (fd.getCoffee() * qty) + total;
                                break;

                            case 2:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                item.add("Shake");
                                quantity.add(qty);
                                total = (fd.getShake() * qty) + total;
                                break;

                            case 3:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                item.add("Biriyani");
                                quantity.add(qty);
                                total = (fd.getBiriyani() * qty) + total;
                                break;

                            case 4:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                item.add("Alfaham");
                                quantity.add(qty);
                                total = (fd.getAlfaham() * qty) + total;
                                break;

                            case 5:
                                System.out.println("\tBILL");
                                System.out.println("***************");
                                for (int i = 0; i <= item.size() - 1; i++) {
                                    System.out.println("ITEM NAME:" + item.get(i) + "\tQTY:" + quantity.get(i));


                                    System.out.println("Total money you want to pay is \t" + total);
                                    total = 0;
                                    item.removeAll(item);
                                    quantity.removeAll(quantity);

                                }

                                break;

                            case 6:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid Choice");

                        }

                break;
                        }

                case 2:

                    System.out.println("choose the items");
                    System.out.println("1.Coffee Price="+dy.getCoffee());
                    System.out.println("2.Shake price="+dy.getShake());
                    System.out.println("3.Biriyani price"+dy.getBiriyani());
                    System.out.println("4.Alfaham price="+dy.getAlfaham());
                    System.out.println("5.Bill");
                    System.out.println("6.Exit");
                    c=sc.nextInt();
                      switch(c){
                          case 1:

                              System.out.println("Enter the Quantity");
                              qty= sc.nextInt();
                              item.add("coffee");
                              quantity.add(qty);
                              total=(dy.getCoffee()*qty)+total;
                              break;

                          case 2:
                              System.out.println("Enter the Quantity");
                              qty= sc.nextInt();
                              item.add("Shake");
                              quantity.add(qty);
                              total=(dy.getShake()*qty)+total;
                              break;

                          case 3:
                              System.out.println("Enter the Quantity");
                              qty= sc.nextInt();
                              item.add("Biriyani");
                              quantity.add(qty);
                              total=(dy.getBiriyani()*qty)+total;
                              break;

                          case 4:
                              System.out.println("Enter the Quantity");
                              qty= sc.nextInt();
                              item.add("Alfaham");
                              quantity.add(qty);
                              total=(dy.getAlfaham()*qty)+total;
                              break;

                          case 5:
                              System.out.println("\tBILL");
                              System.out.println("***************");
                              for(int i=0;i<=item.size()-1;i++)
                              {
                                  System.out.println("ITEM NAME:"+item.get(i)+"\tQTY:"+quantity.get(i));

                              }
                              System.out.println("Total money you want to pay is \t"+total);
                              total=0;
                              item.removeAll(item);
                              quantity.removeAll(quantity);

                              break;

                          case 6:
                              System.exit(0);
                              break;
                          default:
                              System.out.println("Invalid Choice");

                      }

                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }

}


