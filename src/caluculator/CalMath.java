package caluculator;

import java.util.Scanner;

public class CalMath
{
    public static void main(String[] args) {
        int choice,x,y,r;
        while(true)
        {

            System.out.println("choose");
            System.out.println("1.addition");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("5.exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the numbers");
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println("Enter your choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Addition of x and y");
                    r = x + y;
                    System.out.println("Ans is" + r);
                    break;
                case 2:
                    System.out.println("subtraction");
                    r = x - y;
                    System.out.println("Ans is" + r);
                    break;
                case 3:
                    System.out.println("multiplication");
                    r = x * y;
                    System.out.println("Ans is" + r);
                    break;
                case 4:
                        System.out.println("division");
                        r = x / y;
                        System.out.println("Ans is" + r);
                        break;
                case 5:
                    System.exit(0);
            }
            }

        }
}

