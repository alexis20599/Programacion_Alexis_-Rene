//TestArrayList
import java.util.ArrayList;
import javax.swing.*;
public class TestArrayList{
  public static void main (String[] args) {
    ArrayList cityList = new ArrayList();

    cityList.add("London");
    cityList.add("New York");
    cityList.add("Paris");
    cityList.add("Tokyo");
    cityList.add("Miami");
    cityList.add("City Mexico");

    JOptionPane.showMessageDialog(null, "List size: "+ cityList.size());

    JOptionPane.showMessageDialog(null, "Is Miami in this list? "+ cityList.contains("Miami"));

    JOptionPane.showMessageDialog(null, "The location of Paris is "+ cityList.indexOf("Paris"));

    JOptionPane.showMessageDialog(null, "Is this list empty? "+ cityList.isEmpty());

    cityList.remove("London");

  }
}
