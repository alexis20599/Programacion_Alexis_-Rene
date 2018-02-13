/**********************
ChimefonTelephone.java

Alexis Rene Olivares Cabrera
This a program prints and calculates how much should you pay for each concept of the call.
*********************/
import javax.swing.JOptionPane;

public class ChimefonTelephone{
  public static void main(String[] args){
    int ti;
    double tu,pag,imp,tot,in,cob;
    String di,turn;
    ti=Integer.parseInt(JOptionPane.showInputDialog("Enter your time in minutes: "));
    di=JOptionPane.showInputDialog("Enter the day of the week: ");
    cob=0;
    tot=0;
    switch(di)
    {
      case "domingo":
          cob=0.03;
          break;
      default:
          turn=JOptionPane.showInputDialog("Enter the turn: ");
          if(turn=="matutino"){
            cob=0.15;
            break;
          }else if(turn=="vespertino"){
            cob=0.10;
            break;
          }
    } if(ti<=5){
            in=1;
            pag=in*ti;
            imp=cob*pag;
            tot=pag+imp;
          }else if(ti<=8){
            in=0.80;
            pag=5+(ti-5)*in;
            imp=cob*pag;
            tot=pag+imp;
          }else if(ti<=10){
            in=0.70;
            pag=7.4+(ti-8)*in;
            imp=cob*pag;
            tot=pag+imp;
          }else if(ti>10){
            in=0.50;
            pag=8.8+(ti-5)*in;
            imp=cob*pag;
            tot=pag+imp;
          }
    JOptionPane.showMessageDialog(null,"The total payment:$ "+tot);
  }
}
