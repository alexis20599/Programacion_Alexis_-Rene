/**********************
Travelservice.java

Alexis Rene Olivares Cabrera
This a program calculates the total to be paid of a travel of studies
*********************/
import javax.swing.JOptionPane;

public class Travelservice{
    public static void main(String[] args){
        double na,pa,tot;
      na= Double.parseDouble(JOptionPane.showInputDialog("Enter the number of students"));

      if ( na>=100 ){
        pa=65;
        tot=na*pa;
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    } else if( na>=50 && na<=99 ) {
        pa=70;
        tot=na*pa;
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    } else if( na>30 && na<=49 ) {
        pa=95;
        tot=na*pa;
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    } else if(na<=30) {
        pa=4000;
        tot=pa;
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    }
  }
}
