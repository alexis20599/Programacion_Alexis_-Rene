/************************************
Dog.java

Alexis René Olivares Cabrera
This class sets the dog´s properties and methods
************************************/
import javax.swing.*;
public class Dog{

  //Dog´s properties - Variables
  private String color;
  private String eyeColor;
  private double height;
  private double length;
  private double weight;

  /*Metodo tipo de dato GET = obtener
  metodo void SET = establecer*/

  //Set the dog´s color
  public void setColor(String dogColor){
      color = dogColor;
  }
  //gets the dog´s dog´s color
  public String getColor(){
    return color;
  }

//sets dog´s eyecolor
  public void setEyeColor(String dogEyeColor){
      eyeColor = dogEyeColor;
  }
  //gets dog´s eyecolor
  public String getEyeColor(){
    return eyeColor;
  }

  //sets dog´s height
    public void setheight(double dogHeight){
        height = dogHeight;
    }
    //gets dog´s height
    public double getheigth(){
      return height;
    }

    //sets dog´s length
      public void setLength(double dogLength){
          length = dogLength;
      }
      //gets dog´s length
      public double getLength(){
        return length;
      }

      //sets dog´s weight
        public void setWeight(double dogWeight){
            weight = dogWeight;
        }
        //gets dog´s weight
        public double getWeight(){
          return weight;
        }

  //Dog´s Methods - actions
  //sit method
  public void sit(){
    JOptionPane.showMessageDialog(null, "The dog is sat");
  }

//Bark Methods
public void bark(){
  JOptionPane.showMessageDialog(null, "The dog is barking");
  }

//Lady Down Method
public void layDown(){
  JOptionPane.showMessageDialog(null,"The dog is laid down");
  }

  public void sleep(){
    JOptionPane.showMessageDialog(null, "The dog is slepping ");
  }

  public void eat(){
    JOptionPane.showMessageDialog(null, "The dog is eating");
  }

 }
