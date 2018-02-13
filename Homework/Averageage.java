/*******************************
Averageage.java

Alexis René Olivares Cabrera
This a program calculate the average of the age of "n" students for method while.
***********************************/
import javax.swing.JOptionPane;

public class Averageage{
  public static void main (String[]args){
    int c=0, su=0, nu;
    double pr,ed;
nu =Integer.parseInt(JOptionPane.showInputDialog("Enter a number the students"));

while( c<=nu ){
  ed =Integer.parseInt(JOptionPane.showInputDialog("Enter the age of student"));
  su += ed;
  c ++;

}
pr=(su/nu);
  JOptionPane.showMessageDialog(null, "The average age of the "+ nu + " students is " + pr);
  }
}
