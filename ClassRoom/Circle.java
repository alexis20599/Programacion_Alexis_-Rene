/**************************
Circle.java

Alexis René Olivares Cabrera
This class calculates the area of a Circle
*****************************/
import javax.swing.*;
public class Circle{
  //properties
  private double radius;

  //Constructor
  public Circle(){

  }
  //Constructor Circle overload
  public Circle(double radius){
    this.radius = radius;
  }

  //methods
  public void setRadius(Double radius){
    this.radius = radius;
  }
  public double getRadius(){
    return this.radius;
  }

  public double getArea(){
    return Math.pow(this.radius, 2) *Math.PI;
  }
    //Main Method
public static void main (String[]args){

  double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius"));
  Circle circle = new Circle(radius);

  JOptionPane.showMessageDialog(null, "The circle´s area with a radius of "+ circle.getRadius() + " is "+ circle.getArea());
  }
}
