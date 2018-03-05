/********************************************
Alexis_Rene_Olivares_Cabrera
conearea.java
This Program prints and calculates the area of a the half circle and two triangles.
*********************************************/

import java.util.Scanner;
public class conearea {
   public static void main(String[] args) {
        double area;
        double at;
        double ac;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double r=sc.nextDouble();
        System.out.println("enter the hypotenuse of the triangle");
        double h=sc.nextDouble();
        double Pi=(3.1416);
        float c= (float) Math.sqrt((h*h)-(r*r));
        at=r*c;
        ac=((r*r)*Pi)/2;
        area=at+ac;
        System.out.println("The area of the half circle and two triangles is equivalent to =" + area);
     }//end main
}//end conearea
