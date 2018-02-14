/*******************************
Printto100.java

Alexis René Olivares Cabrera
This a program print of the one a one hundred.
***********************************/
import javax.swing.JOptionPane;
public class Printto100{
  public static void main (String[]args){
    int mod;
    for (int i=0; i<=100; i ++){
      mod= i%2;
      if (mod==0){
        JOptionPane.showMessageDialog(null,i);
      }//end if
    }//end for
  }//main
}//end Printto100.java
