/**********************
WhileLoop.java
while = mientras
Alexis Rene Olivares Cabrera
This a program makes ent6ries in a bridal registry
*********************/
import javax.swing.JOptionPane;

public class WhileLoop{
  public static void main (String[]args){
    String registry = "";
    char more;

  more = JOptionPane.showInputDialog("Do you want to create a bridal registry? (Y/N)").charAt(0);//sirve para ingresar valores tipo cadena

  while(more == 'Y' || more =='y'){
    registry += //sirve para acomular de cadenas
    JOptionPane.showInputDialog("Enter item: ");
    registry +=
    JOptionPane.showInputDialog("Enter store: \n");
    registry += "\n";
    //more = sirve para acomular caracteres y para evaluar es .equals("") solo sirve para caracter
      more =  JOptionPane.showInputDialog("Any more items? (Y/N)").charAt (0);//lanzar la pregunta dentro del ciclo

  } //end while
  if (!registry.equals("")) {
    JOptionPane.showMessageDialog(null, "\nBridal registry\n " + registry);
  }
}//end main
}//end whileloop
