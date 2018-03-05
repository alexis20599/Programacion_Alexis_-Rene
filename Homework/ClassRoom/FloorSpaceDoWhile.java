/**********************
FloorSpaceDoWhile.java

Alexis Rene Olivares Cabrera
This a program calculates total floor space in house.
*********************/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile{
  public static void main( String[]args){
    double length, width;//room dimensions
    double floorSpace = 0; //house´s total floor floorSpace
    char response; //user´s response

    do{
      length= Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the room´s length","My input",JOptionPane.WARNING_MESSAGE));
      width=  Double.parseDouble(JOptionPane.showInputDialog("Enter the room´s width"));
      floorSpace += length*width;

      response = JOptionPane.showInputDialog("Any more room? y/n").charAt(0);
    }while(response=='y' || response=='Y');
    JOptionPane.showMessageDialog(null, "The total floor space is " + floorSpace, "HELLO",JOptionPane.ERROR_MESSAGE);//existe el WARNING;
  }
}
