/*************************************
IfControlStatement.javaimport

Alexis René Olivares Cabreraimport
This program checks for period at the end of line.
************************************/
import javax.swing.JOptionPane;

public class IfControlStatement{
  public static void main (String[]args){
    String sentence;
    int lastCharPosition ;

    sentence =JOptionPane.showInputDialog("Enter your sentence");

    lastCharPosition = sentence.length() -1;

  if (sentence.charAt(lastCharPosition) != '.') {
      JOptionPane.showMessageDialog(null, "Invalid Entry - Your sentence needs a period");
    }//end if
  }//end main
}//end class
