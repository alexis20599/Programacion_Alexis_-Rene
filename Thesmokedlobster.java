/**********************
Thesmokedlobster.java

Alexis Rene Olivares Cabrera
This a program calculates the total to pay for a banquet
*********************/
import javax.swing.JOptionPane;

public class Thesmokedlobster{
    public static void main(String[] args){
        double np,tot1,tot2,tot3;
      np= Double.parseDouble(JOptionPane.showInputDialog("Enter the number of people"));
      tot1=np*95;
      tot2=np*85;
      tot3=np*75;


      if ( np<=200  ){
        JOptionPane.showMessageDialog(null, "The cost is of $95");
        JOptionPane.showMessageDialog(null, "What you have to pay is of $"+tot1);
    } else if( np>200 && np<=300 ) {
        JOptionPane.showMessageDialog(null, "The cost is of $85");
        JOptionPane.showMessageDialog(null, "What you have to pay is of $"+tot2);
    } else if(np>300){
      JOptionPane.showMessageDialog(null, "The cost is of $75");
      JOptionPane.showMessageDialog(null, "What you have to pay is of $"+tot3);
    }else {
        JOptionPane.showMessageDialog(null, "Enter a correct number");
    }
  }
}
