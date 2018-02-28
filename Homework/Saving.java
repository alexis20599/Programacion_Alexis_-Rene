/*******************************
Saving.java

Alexis René Olivares Cabrera
This a program determine how much a person saved in a year.
***********************************/
import javax.swing.JOptionPane;
public class Saving{
  public static void main (String[]args) {

    Double ah;
    int m=1, ca=0;

    while (m<=12){

      ah=Double.parseDouble(JOptionPane.showInputDialog("Enter the saving fo month"));
      ca += ah;
      JOptionPane.showMessageDialog(null, "You have saving: " + ca + " in " + m + " months");
      m ++;
    }
  }
}
