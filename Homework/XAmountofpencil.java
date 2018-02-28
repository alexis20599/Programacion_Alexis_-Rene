/**********************
XAmountofpencil.java

Alexis Rene Olivares Cabrera
This a program identifies "x" amount of pencil and calculates the price to pay
*********************/
import javax.swing.JOptionPane;

public class XAmountofpencil{
    public static void main(String[] args){
        double x,a,b;
        final double H= 0.85;
        final double I= 0.90;

  x= Double.parseDouble(JOptionPane.showInputDialog("Enter an amount of pencil"));
  a= x * H;
  b= x * I;

      if ( x>=1000 ){
      JOptionPane.showMessageDialog(null, "The cost is of 85¢");
      JOptionPane.showMessageDialog(null, "What you have to pay is of $"+a);
    } else if( x<1000 ) {
      JOptionPane.showMessageDialog(null, "The cost is of 90¢");
      JOptionPane.showMessageDialog(null, "What you have to pay is of $"+b);
    } else {
      JOptionPane.showMessageDialog(null, "Enter a correct amount");
    }
  }
}
