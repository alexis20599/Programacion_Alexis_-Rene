/*******************************
Accountant.java

Alexis René Olivares Cabrera
This a program calculate the sum of ten quantities by the method while.
***********************************/
import javax.swing.JOptionPane;

public class Accountant{
  public static void main (String[]args){
    int c=1;
    double va, su=0;
va =Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));
su =va;
while( c<10 ){
  va =Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));
  su += va;
  c ++;
}
  JOptionPane.showMessageDialog(null, "The plus is "+ su);
  }
}
