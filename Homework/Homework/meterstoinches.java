/********************************************
Alexis_Rene_Olivares_Cabrera
meterstoinches.java
This Program prints and calculates the conversion the meters to inches
*********************************************/

import java.util.Scanner;
public class meterstoinches {
   public static void main(String[] args) {
        double pg;//this the variable end the meters to inches
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the meters of the fabric you need");
        double m=sc.nextDouble();
        double in=0.0254;
        pg=m*in;
        System.out.println("The number of inches you should ask is from =" + pg + " m2");
     }//end main
}//end meterstoinches
