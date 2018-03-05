/**********************
Theraggeddistinguished.java

Alexis Rene Olivares Cabrera
This a program identifies cost of a suit
*********************/
import javax.swing.JOptionPane;

public class Theraggeddistinguished{
    public static void main(String[] args){
        double ct,de1,de2,pf1,pf2;
      ct= Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the suit"));
      de1=ct*0.15;
      de2=ct*0.08;
      pf1=ct-de1;
      pf2=ct-de2;


      if ( ct>2500 ){
        JOptionPane.showMessageDialog(null, "The discount is of "+de1);
        JOptionPane.showMessageDialog(null, "What you have to pay is of $"+pf1);
    } else if( ct<=2500 ) {
        JOptionPane.showMessageDialog(null, "The discount is of "+de2);
        JOptionPane.showMessageDialog(null, "What you have to pay is of $"+pf2);
    } else {
      JOptionPane.showMessageDialog(null, "Enter a correct number");
    }
  }
}
