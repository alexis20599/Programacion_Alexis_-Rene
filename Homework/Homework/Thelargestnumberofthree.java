/**********************
Thelargestnumberofthree.java

Alexis Rene Olivares Cabrera
This a program identifies three numbers entered, the largest
*********************/
import javax.swing.JOptionPane;

public class Thelargestnumberofthree{
    public static void main(String[] args){
        double a,b,c;
      a= Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
      b= Double.parseDouble(JOptionPane.showInputDialog("Enter the second number "));
      c= Double.parseDouble(JOptionPane.showInputDialog("Enter the third number "));

      if ( a>b && a>c ){
      JOptionPane.showMessageDialog(null, "The biggest number is " + a);
    } else if( b>a && b>c ) {
      JOptionPane.showMessageDialog(null, "The biggest number is " + b);
    } else if( c>a && c>b ) {
      JOptionPane.showMessageDialog(null, "The biggest number is " + c);
    } else {
      JOptionPane.showMessageDialog(null, "Enter a correct number" );
    }
  }
}
