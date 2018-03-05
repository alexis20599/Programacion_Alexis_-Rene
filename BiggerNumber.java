/**********************
BiggerNumber.java

Alexis Rene Olivares Cabrera
This a program identifies two numbers entered, the largest
*********************/
import javax.swing.JOptionPane;

public class BiggerNumber{
    public static void main(String[] args){
        double a,b;
      a= Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
      b= Double.parseDouble(JOptionPane.showInputDialog("Enter the second number "));

      if ( a>b ){
      JOptionPane.showMessageDialog(null, "The biggest number is " + a);
      } else if( b>a ) {
      JOptionPane.showMessageDialog(null, "The biggest number is " + b);
    } else {
      JOptionPane.showMessageDialog(null, "Enter a correct number");
    }
  }
}
