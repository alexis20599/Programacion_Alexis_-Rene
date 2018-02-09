/**********************
Creditcards.java

Alexis Rene Olivares Cabrera
This a program calculates the total to be paid of a query.
*********************/
import javax.swing.JOptionPane;
public class Creditcards{
  public static void main(String[] args)  {
    int tt;
    double la,ac,nc;
    String por;
    tt=Integer.parseInt(JOptionPane.showInputDialog("Enter your type of card: "));
    la=Double.parseDouble(JOptionPane.showInputDialog("Enter your current credit limit: "));
     switch(tt)
     {
       case 1:
          por="25%";
          ac=la*0.25;
          nc=ac+la;
          break;
      case 2:
          por="35%";
          ac=la*0.35;
          nc=ac+la;
          break;
      case 3:
          por="40%";
          ac=la*0.40;
          nc=ac+la;
          break;
      default:
          por="50%";
          ac=la*0.50;
          nc=ac+la;
          break;
     }
     JOptionPane.showMessageDialog(null,"Type of card: "+tt+"\n Current credit limit: "+la+"\n Percentage of credit increase "+por+"\n Credit increase: "+ac+"\n New credit limit: "+nc);
  }
}
