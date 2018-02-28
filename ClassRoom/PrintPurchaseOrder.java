/******************************************
Alexis René Olivares Cabrera
PrintPurchaseOrder.java

This program calculates and prints a purchase order amount
*******************************************/

import java.util.Scanner;
public class PrintPurchaseOrder {
  public static void main(String[] args) {
    Scanner userData = new Scanner (System.in);
    double price ;
    int quantity;
    String name;
    System.out.println("Enter the price ");
    price= userData.nextDouble();
    System.out.println("Enter the name of the productasdas ");
    name= userData.next();
    System.out.println("Enter the quantity of " + name + " : ");
    quantity=userData.nextInt();
    System.out.println("Total purchase order $ " + name +" "+ price * quantity );
  }
}
