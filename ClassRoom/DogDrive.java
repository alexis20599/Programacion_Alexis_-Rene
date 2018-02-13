/************************************
DogDrive.java

Alexis René Olivares Cabrera
This program creats dog objects and uses Dog class
************************************/
import javax.swing.JOptionPane;

public class DogDrive{
  public static void main (String[]arg){
    Dog fido;

    fido= new Dog();
    fido.setColor("black");
    fido.setEyeColor("gray");

    JOptionPane.showMessageDialog(null, fido.getColor());
    JOptionPane.showMessageDialog(null, fido.getEyeColor());

    fido.eat();
    fido.bark();
    fido.sleep();
    
  }
}
