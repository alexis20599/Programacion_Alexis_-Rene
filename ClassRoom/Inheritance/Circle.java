//
import javax.swing.*;
public class Circle extends GeometricObject{
  private double radius;

  public Circle(){}

  public Circle(double radius){
  this.radius = radius;
    }

public Circle(double radius,String color, boolean filled){
  super(color, filled);
  this.radius=radius;
}
public double getRadius(){
  return this.radius;
}
´public void setRadius(double radius){
  this.radius= radius;
}
public double getArea(){
  return Math.PI*Math.pow(this.radius, 2);
}
public double getPerimeter(){
  return Math.PI*(this.radius*2);
}
public double getDiameter(){
  return this.radius *2;
}
public void printCircle(){
  JOptionPane.showMessageDialog(null, "The Circle created "+getDateCreated()+" has a color "+getColor());
}
}
