/*************************
BIMOOP.java

Alexis Rene Olivares Cabrera
This class calculates the Body Mass Index
**************************/
import javax.swing.*;

public class BMIOOP{
//properties- attributes
  private String name;
  private int age;
  private double weigth;//in punds
  private double heigth;//in inches
  private final double KILOGRAMS_PER_POUND= 0.45359237;
  private final double METERS_PER_INCH= 0.0254;

  //methods - Actions
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return this.age;
  }
  public void setWeigth(double weigth){
    this.weigth = weigth;
  }
  public double getWeigth(){
    return this.weigth;
  }
  public void setHeigth(double heigth){
    this.heigth = heigth;
  }
  public double getHeigth(){
    return this.heigth;
  }


  public double getBMI(){
    double bmi= this.weigth*KILOGRAMS_PER_POUND/((this.heigth*METERS_PER_INCH)*(this.heigth*METERS_PER_INCH));
    return Math.round(bmi*100) /100;
    }

    //metohd to evaluate BMI and return a message
    public String getStatus(){
      double bmi = getBMI();
      if (bmi < 16){
        return "You are seriously uderweight";
      } else if (bmi < 18){
        return "You are uderweight";
      } else if (bmi < 24){
        return "You are normal weight";
      } else if (bmi < 29){
        return "You are overweight";
      } else if (bmi < 35){
        return "You are seriously overweight";
      } else{
        return "You are gravely overweight";
      }

    }

    //method to integrate data
    public static void main(String[] args) {

      BMIOOP newRegistry = new BMIOOP();
      Double registryWeight;
      Double registryHeight;

      String registryName = JOptionPane.showInputDialog("Enter your name");
      newRegistry.setName(registryName);
      int registryAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
      newRegistry.setAge(registryAge);
      registryWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in pounds"));
      newRegistry.setWeigth(registryWeight);
      registryHeight = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in inches"));
      newRegistry.setHeigth(registryHeight);

      JOptionPane.showMessageDialog(null, "Name: " + newRegistry.getName() + "\nAge: " + newRegistry.getAge() + "\nWeight: " + newRegistry.getWeigth() + "\nHeight: " + newRegistry.getHeigth() + "\nBody Mass Index: " + newRegistry.getBMI() +"\n"+ newRegistry.getStatus() );
    }
}
