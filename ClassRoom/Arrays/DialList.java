/*********************
DialList.java

Alexis René Olivares Cabrera
This a program creates a cell phone dial phone number list and print the created List
*********************/
import javax.swing.JOptionPane;

public class DialList{
  public static void main (String[]args){
    long [] phoneList ; //List of phone numbers
    int sizeList; //number of phone numbers
    long phoneNum; //an entered phone number

    sizeList =
    Integer.parseInt(JOptionPane.showInputDialog("How many phone number you like to enter?"));
    phoneList = new long[sizeList];//inicializando
    for (int i=0;i< sizeList;i++){
      phoneNum =
      Long.parseLong(JOptionPane.showInputDialog("Enter a phone number"));
      phoneList[i] = phoneNum;

    }
    for (int i= 0;i< sizeList;i++){
      JOptionPane.showMessageDialog(null, "index "+i+" element number: "+(i+1)+ "phone number: "+phoneList[i]);
    }
  }
}
