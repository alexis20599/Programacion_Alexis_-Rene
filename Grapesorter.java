/**********************
Grapesorter.java

Alexis Rene Olivares Cabrera
This a program identifies and calculate the type and size of the grape
*********************/
import javax.swing.JOptionPane;

public class Grapesorter{
    public static void main(String[] args){
        int ta;
        double p, k, ga, pk, gat;
         char ti ;

      ti= JOptionPane.showInputDialog("Enter the type of the grape (A/B)").charAt(0);
      ta= Integer.parseInt(JOptionPane.showInputDialog("Type the size of the grape: 1/2 "));
      k= Double.parseDouble(JOptionPane.showInputDialog("Enter the kilos of grapes "));
      pk= Double.parseDouble(JOptionPane.showInputDialog("Enter the price for kilo of grapes"));

      if ( ti=='A' ){
        if(ta==1){
          p=0.20;
          ga=k*p;
          gat=pk+ga;
          JOptionPane.showMessageDialog(null, "The gain of the grape is " + gat + "for" + k + "Kilos");
        }else if (ta==2){
          p=0.30;
          ga=k*p;
          gat=pk+ga;
          JOptionPane.showMessageDialog(null, "The gain of the grape is " + gat + "for" + k + "Kilos");
        }
    } else if( ti=='B') {
      if(ta==1){
        p=0.30;
        ga=k*p;
        gat=pk+ga;
        JOptionPane.showMessageDialog(null, "The gain of the grape is " + gat + "for" + k + "Kilos");
      }
    } else if(ta==2 ) {
      p=0.50;
      ga=k*p;
      gat=pk+ga;
      JOptionPane.showMessageDialog(null, "The gain of the grape is " + gat + "for" + k + "Kilos");
    } else{
      JOptionPane.showMessageDialog(null, "Enter a correct number of type and size" );
    }
  }
}
