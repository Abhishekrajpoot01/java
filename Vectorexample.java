import java.util.*;
public class Vectorexample {
    public static void main(String[] args) {
        Vector list = new Vector();
        list.addElement("Abhishek");
        list.addElement(1804);
        list.addElement("GL Bajaj");
        System.out.println("Vectors elements are "+list);
        //  Inserting elements into vector

        list.insertElementAt("Rajput", 1);
        System.out.println(list);

    }
}
