/*******************************
Weeklypayment.java

Alexis René Olivares Cabrera
This a program calculates the weekly balance of an worker.
***********************************/
import javax.swing.JOptionPane;

public class Weeklypayment{
  public static void main (String[]args){
    int n, i=1;
    double ht, ph, ss=0;
    double sf=0;
  n=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of employee"));
    ph=Double.parseDouble(JOptionPane.showInputDialog("Enter the payment per hour"));

    while (n<=i){
      ht=Double.parseDouble(JOptionPane.showInputDialog("Enter the hours worked during the week"));
      ss=ht*ph;
      i++;
      sf += ss;
    }
    JOptionPane.showMessageDialog(null,"The total to pay is: $" + sf);
  }
}
