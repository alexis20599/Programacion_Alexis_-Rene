/**********************
FactorialForLoop.java

Alexis Rene Olivares Cabrera
This a program prints the factorial of a number.
*********************/
import javax.swing.JOptionPane;

public class FactorialForLoop{
  public static void main(String[]args){
    int factorial =1;
    int number;

    number= Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
for (int i=1;i<=number ; i++ ) {
  factorial*=i;
}
    JOptionPane.showMessageDialog(null,"the factorila of "+number+" is "+ factorial," Factorial",JOptionPane.OK_OPTION );
  }
}
