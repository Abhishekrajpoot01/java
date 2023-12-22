import java.util.*;
public class Vectorexample {
    public static void main(String[] args) {
        Vector list = new Vector();
       // Adding elements into vector
        list.addElement("Abhishek");
        list.addElement(1804);
        list.addElement("GL Bajaj");
        System.out.println("Vectors elements are "+list);
        //  Inserting elements into vector

        list.insertElementAt("Harsh", 1);
        System.out.println(list);
        System.out.println(list.size());
        list.removeElement(1804);
        System.out.println(list);
        list.removeAllElements();
        System.out.println(list);
    }
}
