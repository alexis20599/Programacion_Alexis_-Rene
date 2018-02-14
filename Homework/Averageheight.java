/*******************************
Averageheight.java

Alexis René Olivares Cabrera
This a program calculate the average of the height of "n" people for method while.
***********************************/
import javax.swing.JOptionPane;

public class Averageheight{
  public static void main (String[]args){

    int c=0;
    double su=0, pr;
    double es=0;

while( c !=' '){

  es =Integer.parseInt(JOptionPane.showInputDialog("Enter the height"));
  su += es;
  c ++;

}
pr=(su/c);
  JOptionPane.showMessageDialog(null, "The average of the height is " + pr);
  }
}
