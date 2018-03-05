/*******************************
TikiTaka.java

Alexis René Olivares Cabrera
This a program calculate the sales range. In addition to the amount sold in each category and globally.
***********************************/
import javax.swing.JOptionPane;

public class TikiTaka{
  public static void main (String[]args){

    double n, v, cn=1;
    double t1=0;
    double tt=0;
    double t2=0;
    double t3=0;
    int a = 0;
    int b = 0;
    int c= 0;
    n=Double.parseDouble(JOptionPane.showInputDialog("Enter the number of sales"));
    while (cn<=n){

      v=Double.parseDouble(JOptionPane.showInputDialog("Enter the value of sale"));
      cn ++;
      tt +=v;
      if (v<=500)
      {
        c ++;
        t3 +=v;
      }else{
        if (v<=1000)
        {
          b ++;
          t2 +=v;
        }else{
          a ++;
          t1 +=v;
        }
      }
    }
    JOptionPane.showMessageDialog(null,"Sales type A were: " + a + " and its value is: " + t1 + "\nSales type B were: " + b + " and its value is: " + t2 + "\nSales type A were: " + c + " and its value is: " + t3 + "\nThe entire sales were: " + cn + " and the total cost was: " + tt);
  }
}
