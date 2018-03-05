//
import javax.swing.*;
public class ImplementGeometricObjects{
  public static void main(String[] args){
    GeometricObject circlelito= new Circle(3.5, "Blue", true);
    JOptionPane.showMessageDialog(null, "The area is "+circlelito.getArea());
    JOptionPane.showMessageDialog(null, "The circle was created on "+circleito.getDateCreated());

    GeometricObject rectanglelito = new Rectangle(10,20,"Red", true);
    JOptionPane.showMessageDialog(null, "The area is " +rectanglelito.getArea());
    JOptionPane.showMessageDialog(null, "The perimeter is "+rectanglelito.getPerimeter());
    JOptionPane.showMessageDialog(null, "The rectangle was created on "+rectanglelito.getDateCreated());

  /*  //polimorfismo
    JOptionPane.showMessageDialog(null, circlelito.toString());
    circlelito.getArea();*/
  }
}
