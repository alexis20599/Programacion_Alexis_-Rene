/**********************
BMI.java

Alexis Rene Olivares Cabrera
This a program calculates the Body Mass Index
*********************/
import javax.swing.JOptionPane;
public class BMI{
  public static void main(String[]args){
    float weight, height;
    final double KILOGRAMS_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    weight =
    Float.parseFloat(JOptionPane.showInputDialog("Enter your WEIGHT in pounds "));

    height =
    Float.parseFloat(JOptionPane.showInputDialog("Enter your HEIGHT in inches"));

    double weightInKilograms = weight*KILOGRAMS_PER_POUND;
    double heigtInMeters = height*METERS_PER_INCH;

    double bmi = weightInKilograms/ (heigtInMeters*heigtInMeters);
    // * double bmi = weightInKilograms/ (Math.pow(heigtInMeters,2)); Es de la otra forma para elevar al cuadrado
    if (bmi < 16){
      JOptionPane.showMessageDialog(null, "You are seriously uderweight");
    } else if (bmi < 18){
      JOptionPane.showMessageDialog(null, "You are uderweight");
    } else if (bmi < 24){
      JOptionPane.showMessageDialog(null, "You are normal weight");
    } else if (bmi < 29){
      JOptionPane.showMessageDialog(null, "You are overweight");
    } else if (bmi < 35){
      JOptionPane.showMessageDialog(null, "You are seriously overweight");
    } else{
      JOptionPane.showMessageDialog(null, "You are gravely overweight");
    }
  }
}
