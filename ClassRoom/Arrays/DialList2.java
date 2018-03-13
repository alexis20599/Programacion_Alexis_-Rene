/**********************
DialList2.java

Alexis René Olivares Cabrera
This program creates a dial phone number list and prints
the created list. It uses a partially filled array
**********************/
import javax.swing.*;
public class DialList2{
  public static void main(String[]args){
  String[] phoneList = new String[100];//declaracion e inacializacion
    int filledNumbers = 0; // number of phones
    String phoneNum; // an entered phone number

    phoneNum = JOptionPane.showInputDialog("Enter a phone number(or press q to Quit)");

    while(!phoneNum.equalsIgnoreCase("q") && filledNumbers<phoneList.length){
      if(phoneNum.length()<10){
        JOptionPane.showMessageDialog(null,"Must enter a valid number(10 caracters)");
      }else{
        phoneList[filledNumbers] = phoneNum;
        filledNumbers++;
      }
      phoneNum = JOptionPane.showInputDialog("Enter a phone number (or press q to Quit)");
    }
    JOptionPane.showMessageDialog(null, "Dial List");
    for(int i = 0;i < filledNumbers;i++ ){
      JOptionPane.showMessageDialog(null, (i+1)+" Phone "+ phoneList[i]);
    }
  }
}
