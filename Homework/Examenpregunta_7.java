/***********************
Alexis René Olivares Cabrera

Examenpregunta_7.java
This program converts from Fahrenheit to Celcius and vice versa
***********************/
import javax.swing.JOptionPane;

public class Examenpregunta_7{
  public static void main (String[]args){
    int a;
    int b;
    double far, cel;
    JOptionPane.showMessageDialog(null,"What do you want to convert?");
    a=Integer.parseInt(JOptionPane.showInputDialog("1=from degrees Celcius to Fahrenheit, 2=from degrees Fahrenheit to Celcius, 3=exit"));

  if(a> 0 && a<2){
    b=Integer.parseInt(JOptionPane.showInputDialog("Enter the degrees Celcius"));
    far= (b*1.8)+32;
    JOptionPane.showMessageDialog(null, "The " + b + "° Celcius equality to " + far + "° Fahrenheit");

  }if(a> 1 && a<3 ){
    b=Integer.parseInt(JOptionPane.showInputDialog("Enter the degrees Fahrenheit"));
    cel= (b-32)/1.8;
    JOptionPane.showMessageDialog(null, "The " + b + "° Fahrenheit equality to " + cel + "° Celcius");

  }if(a> 2 && a<4){
    JOptionPane.showMessageDialog(null, "Exit............................................. ");
    JOptionPane.showMessageDialog(null, "Bye ");
  }
  }
}
