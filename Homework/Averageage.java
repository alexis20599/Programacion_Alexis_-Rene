/*******************************
Averageage.java

Alexis René Olivares Cabrera
This a program calculate the average of the age of "n" students for method while.
***********************************/
import javax.swing.JOptionPane;

public class Averageage{
  public static void main (String[]args){
    int su=0, nu, ed;
    int c=1;
    double pr;
nu =Integer.parseInt(JOptionPane.showInputDialog("Enter a number the students"));

while( c <= nu ){
  ed =Integer.parseInt(JOptionPane.showInputDialog("Enter the age of student"));
  su += ed;
  c ++;

}
pr=(su/nu);
  JOptionPane.showMessageDialog(null, "The average age of the "+ nu + " students is " + pr);
  }
}
