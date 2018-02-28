/**********************
Chargeforconsultation.java

Alexis Rene Olivares Cabrera
This a program calculates the total to be paid of a query.
*********************/
import javax.swing.JOptionPane;

public class Chargeforconsultation{
    public static void main(String[] args){
        double nc,cc,tot;
      nc= Double.parseDouble(JOptionPane.showInputDialog("Enter the number of query"));

      if ( nc<=3 ){
        cc=200;
        tot=nc*cc;
      JOptionPane.showMessageDialog(null, "The cost for query is of " + cc);
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    } else if( nc>3 && nc<=5) {
      cc=150;
      tot=((nc-3)*cc)+600;
      JOptionPane.showMessageDialog(null, "The cost for query is of " + cc);
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    } else if( nc>5 && nc<=8 ) {
      cc=100;
      tot=((nc-5)*cc)+900;
      JOptionPane.showMessageDialog(null, "The cost for query is of " + cc);
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    } else if(nc>8) {
      cc=50;
      tot=((nc-8)*cc)+1200;
      JOptionPane.showMessageDialog(null, "The cost for query is of " + cc);
      JOptionPane.showMessageDialog(null, "The total to be paid is " + tot);
    }
  }
}
