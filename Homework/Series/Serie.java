/************************************
Serie.java

Alexis Rene Olivares Cabrera
This class contains attributes of a television series
 ***********************************/
 //attributes
public class Serie implements Entregable{
  private String title = "";
  private int numberOfSeasons = 3;
  private boolean entregado = false;
  private String category = "";
  private String creator = "";

public Serie() {
  this.title = "";
  this.numberOfSeasons = 3;
  this.entregado = false;
  this.category = "";
  this.creator = "";
}
public Serie (String  title, String creator) {
  this.title = title;
  this.creator = creator;
  this.numberOfSeasons = 3;
  this.entregado = false;
  this.category = "";
}
public Serie (String title, int numberOfSeasons, String category, String creator) {
  this.title = title;
  this.numberOfSeasons = numberOfSeasons;
  this.category = category;
  this.creator = creator;
}

//methods
public String getTitle() {
  return this.title;
}
public int getNumOfSeasons() {
  return this.numberOfSeasons;
}
public String getCategory() {
  return this.category;
}
public String getCreator() {
  return this.creator;
}
public void setTitle(String title) {
  this.title = title;
}
public void setNumOfSeasons(int numberOfSeasons) {
  this.numberOfSeasons = numberOfSeasons;
}
public void setCategory(String category) {
  this.category = category;
}
public void setCreator(String creator) {
  this.creator = creator;
}
// method toString
@Override
  public String toString() {
    return "Title: " + getTitle() + "\nNumber of seasons: " + getNumOfSeasons() + "\nEntregado: " + entregado + "\nCategory: " + getCategory() + "\nCreator: " + getCreator();
  }

public void entregar() {
    this.entregado = true;
  }
public void devolver() {
    this.entregado = false;
  }
public boolean isEntregado() {
    return this.entregado;
  }
}
