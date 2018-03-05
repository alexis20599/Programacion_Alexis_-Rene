/************************
GeometricObject.java

Alexis Rene Olivares Cabrera
This is a superclass
************************/
import java.util.Date; //es para fecha

public abstract class GeometricObject{
  private String color;
  private boolean filled; //rellenado
  private Date dateCreated;//Fecha de creacion

//Methods
public GeometricObject(){
  this.color = "purple";
  this.filled= true;
  this.dateCreated = new Date();
}
public GeometricObject(String color, boolean filled){
    this.color=color;
    this.filled= false;
    this.dateCreated = new Date();
  }
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    this.color = color;
  }
  public boolean isFilled(){
    return this.filled;
  }
  public void setFiller(boolean filled){
    this.filled= filled;
  }
  public Date getDateCreated(){
    return this.dateCreated;
  }
  //DEfinir el metodo abstracto que puedes utilizar Circle o Rectangle
  public abstract double getArea();
  public abstract double getPerimeter();

}
