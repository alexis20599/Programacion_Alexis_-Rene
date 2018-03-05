/********************************************
Alexis_Rene_Olivares_Cabrera
Trapezerectanglearea.java
This Program prints and calculates the area of a Trapezerectangle
*********************************************/

import java.util.Scanner;
public class Trapezerectanglearea {
   public static void main(String[] args) {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rectangle width");
        double b=sc.nextDouble();
        System.out.println("enter the lower height");
        double c=sc.nextDouble();
        System.out.println("enter the highest height");
        double a=sc.nextDouble();
        double ar=b*c;//this rectangle area
        double at=(b*(a-c))/2;//this triangle area
        area=ar+at;
        System.out.println("The area of rectangle is equivalent to =" + area);
     }//end main
}//end Trapezerectanglearea
