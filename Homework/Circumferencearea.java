/********************************************
Alexis_Rene_Olivares_Cabrera
Circumferencearea.java
This Program prints and calculates the area of a circle
*********************************************/

import java.util.Scanner;
public class Circumferencearea {
   public static void main(String[] args) {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double r=sc.nextDouble();
        double Pi=(3.1416);
        area=(r*r)*Pi;
        System.out.println("The area of circle or circumference is equivalent to =" + area);
     }//end main
}//end Circumferencearea
