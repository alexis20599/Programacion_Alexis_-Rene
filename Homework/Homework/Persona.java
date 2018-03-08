public class Persona{
  public int edad;
  public String nombre;
  public double peso;
  public double altura;

  public Persona(String nombre, int edad, double peso, double altura){
    this.nombre= nombre;
    this.edad=edad;
    this.peso= peso;
    this.altura= altura;
  }

  public double IMC(){
    double bmi=peso/(altura*altura);
  }

  public class Alumno{
    private int dni;
    public Alumno(int dni,String nombre, int edad, double peso, double altura){
      super(nombre,edad,peso,altura);
      this.dni=dni;
    }
    public int getDNIAlumno(){
      return dni;
    }
  }

}
