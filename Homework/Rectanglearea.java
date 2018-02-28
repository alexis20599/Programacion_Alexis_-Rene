/********************************************
Alexis_Rene_Olivares_Cabrera
Rectanglearea.java
This Program prints and calculates the area of a Rectangle
*********************************************/

import java.util.Scanner;
public class Rectanglearea {
   public static void main(String[] args) {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rectangle width");
        double a=sc.nextDouble();
        System.out.println("enter the rectangle high");
        double b=sc.nextDouble();
        area=a*b;
        System.out.println("The area of rectangle is equivalent to =" + area);
     }//end main
}//end Rectanglearea
