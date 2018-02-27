/***********************************
Contrasena.java

Alexis René Olivares Cabrera
This class sets the dog´s properties and methods
************************************/
import javax.swing.*;
public class Contrasena{

private  int longitud;
private String contrasena;
private boolean is_String;
private cont=0;

public  void setLongitud(int longitud){
  this.longitud = longitud;
}
public int getLongitud(){
  return this.longitud;
}
public void setContrasena(String contrasena){
  this.contrasena = contrasena;
}
public String getContrasena(){
  return this.contrasena;
}

  public boolean is_String(){
    for (cont <= 8){
       = ((int)char)
      cont++
    }
    return "Tu contrasena no es lo bastante fuerte";
  }

  public static void main(String[]args){
    Contrasena newContrasena = new Contrasena ();
   //sirve para ingresar la contrasena
    String newData = JOptionPane.showInputDialog("Ingresa tu contrasena");
    newContrasena. setContrasena (newData);

  }
}
