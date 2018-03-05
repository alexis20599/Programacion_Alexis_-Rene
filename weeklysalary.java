/********************************************
Alexis_Rene_Olivares_Cabrera
weeklysalary.java
This Program prints and calculates the employee's weekly payment
*********************************************/

import java.util.Scanner;
public class weeklysalary {
   public static void main(String[] args) {
        double ss;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how much the employee is paid per hour");
        double ph=sc.nextDouble();
        System.out.println("enter how many hours the employee worked");
        double ht=sc.nextDouble();
        ss=ph*ht;
        System.out.println("the weekly salary that you must pay the worker is =$" + ss);
     }//end main
}//end weeklysalary
