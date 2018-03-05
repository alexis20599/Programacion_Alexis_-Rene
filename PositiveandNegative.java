/**********************
PositiveandNegative.java

Alexis Rene Olivares Cabrera
This a program identifies two numbers entered, the largest
*********************/
import javax.swing.JOptionPane;

public class PositiveandNegative{
    public static void main(String[] args){
        double num;
      num= Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));

      if ( num<0 ){
      JOptionPane.showMessageDialog(null, "The number " + num + " is negative");
    } else if( num>0 ) {
      JOptionPane.showMessageDialog(null, "The number " + num + " is positive");
    } else {
      JOptionPane.showMessageDialog(null, "Maybe your number is zero or enter the wrong number");
    }
  }
}
