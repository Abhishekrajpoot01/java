import java.util.Scanner;
class Cylinder{
    Scanner sc = new Scanner(System.in);
    float r,h;
    double pi=3.14;
    void volume()
    {
         System.out.println("Enter the radius of Cylinder ");
            r=sc.nextFloat();
            System.out.println("Enter the height of Cylinder ");
            h=sc.nextFloat();
            double v=pi*r*r*h;
            System.out.println("The volume of cylinder is "+v);
    }
}
public class Area {
    
    public static void main(String[] args) {
            Cylinder c = new Cylinder();
            c.volume();
    }
    
}
