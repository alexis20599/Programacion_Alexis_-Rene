/*********
*********/
import javax.swing.*;
public class Course{
  private String courseName;
  private String[] students = new String [100];
  private  int numberOfStudents = 0;

//Constructor
  public Course(String courseName){
    this.courseName = courseName;
  }

//Method to get the name of the course
  public String getCourseName(){
    return this.courseName;
  }
//adds a new students to the course
  public void addStudent(String students){
  this.students[numberOfStudents]  = students;
  numberOfStudents++;
  }
//returns the students for the course
  public String[] getStudents(){
    return this.students;
  }

//returns the number of students for the course
public int getNumberOfStudents(){
  return this.numberOfStudents;
  }
//drops a students from the course
public void dropStudent(String students){
  //homework goes here
 for (int i=0;i<this.getNumberOfStudents;i++){
    if (this.students[i].equalsIgnoreCase(student)) {
      this.students [i]= "";// tambien puedo ocupar el null
      }
    }
  }
public static void main(String[]args){
    Course coursito = new  Course("course");
    int opc = 0;//variable of the menu
    do{
      opc=Integer.parseInt(JOptionPane.showInputDialog("....Menu.... \n 1.-Create course \n 2.- Add student \n 3.-Show students \n 4.-Drop Student \n 5.-EXIT"));
      switch(opc){
        case 1:
        String course = JOptionPane.showInputDialog("Course name? ");
        coursito = new Course(course);
        break;

        case 2:
        String name;
        do{
          name = JOptionPane.showInputDialog("Student name? (or 'q' to exit)");
          if (name.charAt(0) != 'q'){
            coursito.addStudent(name);
            }
        }while('q' != name.charAt(0));
        break;

        case 3:
        String[] students = coursito.getStudents();
        String output = "";
        for(int i=0; i< coursito.getNumberOfStudents(); i++){
        output += "Student "+(i+1)+" "+ students[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, output);
        break;

        case 4:
        name = JOptionPane.showInputDialog("Student´s name?");
        coursito.dropStudent(name);
        JOptionPane.showMessageDialog(null, "The student was deleted");
        break;
        case 5: JOptionPane.showMessageDialog(null, "Bye see you, take care have a nice day");
        break;
        dafault: JOptionPane.showMessageDialog(null, "Option doesn´t exist");
      }
    }while(opc != 5);
  }
}
