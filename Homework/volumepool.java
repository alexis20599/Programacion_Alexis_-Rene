/********************************************
Alexis_Rene_Olivares_Cabrera
volumepool.java
This Program prints and calculates the cost of the pool
*********************************************/

import java.util.Scanner;
public class volumepool {
   public static void main(String[] args) {
        double volume;
        double cost;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter of the pool base");
        double l=sc.nextDouble();
        System.out.println("enter of the pool width");
        double n=sc.nextDouble();
        System.out.println("enter of the pool high");
        double a=sc.nextDouble();
        System.out.println("Enter the price to pay per cubic meter");
        double cm=sc.nextDouble();//This is the price variable
        volume=a*l*n;
        cost=volume*cm;
        System.out.println("The volume of the pool is equivalent to =" + volume + " m3");
        System.out.println("The amount to be paid for filling the pool is =" + "$" + cost);
     }//end main
}//end volumepool
