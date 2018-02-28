/********************************************
Alexis_Rene_Olivares_Cabrera
milkproduction.java
This Program prints and calculates the payment of milk production per day
*********************************************/

import java.util.Scanner;
public class milkproduction {
   public static void main(String[] args) {
        double ga;
        double tg;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the production of liters per day");
        double l=sc.nextDouble();
        System.out.println("enter the amount you get paid per gallon");
        double pg=sc.nextDouble();
        double gal=3.785;
        tg=l/gal;
        ga=tg*pg;
        System.out.println("the amount of gallons that occurred during this day is from= " + tg + " gal");
        System.out.println("What they should pay you for the " + tg + " gallons is=$" + ga);
     }//end main
}//end milkproduction
