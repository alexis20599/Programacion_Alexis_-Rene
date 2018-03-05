//

public class Rectangle extends GeometricObject{
  private double width;
  private double height;

  public Rectangle(){}

  public Rectangle(double width, double height){
     this.width = width;
     this.height=height;
  }

  public Rectangle(double width, double height, boolean filled){
    super(color,filled);
    this.width = width;
    this.height=height;
  }
  public double getWidth(){
    return this.height;
  }
  public void setWidth(double width){
    this.width =width;
  }
  public double getHeight(){
    return this.height;
  }
  public void setHeigth(double heigth){
    this.height=height;
  }
  public double getArea(){
    return this.height*this.width;
  }
  public double getPerimeter(){
    return (this.height*2)+(this.width*2);
  }

}
