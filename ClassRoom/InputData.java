/******************************************
Alexis René Olivares Cabrera
InputData.java

This program display a personalized Hello greting
*******************************************/

import java.util.Scanner;

public class InputData{
  public static void main (String[]args) {
      Scanner userData = new Scanner (System.in);
      String name;
      System.out.println("Enter you name");
      name = userData.nextLine();

      System.out.println("Hello " + name + " !");
  }
}
