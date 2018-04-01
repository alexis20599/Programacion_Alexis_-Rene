/************************************
VideoJuego.java

Alexis Rene Olivares Cabrera
This class contains attributes of a videogame
***********************************/
public class VideoJuego implements Entregable{
//attributes
  private String title = "";
  private int estimedHours = 10;
  private boolean entregado = false;
  private String category = "";
  private String company = "";

public VideoJuego() {
  this.title = "";
  this.estimedHours = 10;
  this.entregado = false;
  this.category = "";
  this.company = "";
}

public VideoJuego(String title, int estimedHours) {
  this.title = title;
  this.estimedHours = estimedHours;
  this.entregado = false;
  this.category = "";
  this.company = "";
}

public VideoJuego(String title, int estimedHours, String category, String company) {
  this.title = title;
  this.estimedHours = estimedHours;
  this.category = category;
  this.company = company;
  this.entregado = false;
}

//methods
public String getTitle() {
    return this.title;
}
public int getEstimedHours() {
  return this.estimedHours;
}
public String getCategory() {
  return this.category;
}
public String getCompany() {
  return this.company;
}
public void setTitle(String title) {
  this.title = title;
}
public void setEstimedHours(int estimedHours) {
  this.estimedHours = estimedHours;
}
public void setCategory(String category) {
  this.category = category;
}
public void setCompany(String company) {
  this.company = company;
}

//method toString
@Override
public String toString() {
  return "Title: " + getTitle() + "\nEstimed Hours: " + getEstimedHours() + "\nEntregado: " + entregado + "\nCategory: " + getCategory() + "\nCompany: " + getCompany();
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
