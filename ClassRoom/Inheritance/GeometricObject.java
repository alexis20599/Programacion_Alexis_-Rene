/************************
GeometricObject.java

Alexis Rene Olivares Cabrera
This is a superclass
************************/
import java.util.Date; //es para fecha

public class GeometricObject{
  private String color;
  private boolean filled; //rellenado
  private Date dateCreated;//Fecha de creacion

//Methods
public GeometriObject(){
  this.color= "white";
  this.filled= false;
  this.dateCreated= new Date();
  }
public GeometricObject(String color, boolean filled){
    this.color=color;
    this.filled= filled;
    this.dateCreated = new Date();
  }
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    color=new Color;
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
}
