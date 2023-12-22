 import java.util.Scanner;
 class Rectangle{
    double length,breadth;
    void getdata(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length");
        length=sc.nextDouble();
         System.out.println("Enter the breadth");
        breadth=sc.nextDouble();
        
    }
    void area(){
        double a;
        a=length*breadth;
        System.out.println("The area is = "+a);
    }
 }
public class Demo {
    public static void main(String[] args) {

        Rectangle obj =new Rectangle();
        obj.getdata();
        obj.area();
    
}
    
}
