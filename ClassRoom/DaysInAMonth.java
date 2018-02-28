/**********************
DAysInAMonth.java

Alexis Rene Olivares Cabrera
This a program finds the greatest of three numbers
*********************/
import javax.swing.JOptionPane;

public class DaysInAMonth{
  public static void main(String[] args){
    int numberOfDaysInAMounth = 0;
    String monthOfYear;

    monthOfYear = JOptionPane.showInputDialog("Enter your month");

    switch(monthOfYear){
      case "January":
      numberOfDaysInAMounth = 31;
      break;
      case "February" :
      numberOfDaysInAMounth = 28;
      break;
      case "March":
      numberOfDaysInAMounth = 31;
      break;
      case "April":
      numberOfDaysInAMounth = 30;
      break;
      case "May":
      numberOfDaysInAMounth = 31;
      break;
      case "June":
      numberOfDaysInAMounth = 30;
      break;
      case "July":
      numberOfDaysInAMounth = 31;
      break;
      case "August":
      numberOfDaysInAMounth = 31;
      break;
      case "September":
      numberOfDaysInAMounth = 30;
      break;
      case "October":
      numberOfDaysInAMounth = 31;
      break;
      case "November":
      numberOfDaysInAMounth = 30;
      break;
      case "December":
      numberOfDaysInAMounth = 31;
      break;
    }
  }
}
