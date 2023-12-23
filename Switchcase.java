import java.util.*;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,n;
        System.out.println("Enter first number ");
        a=sc.nextInt();
        System.out.println("Enter second number ");
        b=sc.nextInt();
        System.out.println("Enter the case to perform operation ");
        System.out.println("1 for addition,2 for subtaction,3 for multiplication and 4 for division");
        n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("The addition is "+(a+b));                
                break;
            case 2:
                System.out.println("The subtraction is "+(a-b));
                break;
            case 3:
                System.out.println("The multiplication is "+(a*b));
                break;
            case 4:
                System.out.println("The division is "+(a/b));    
            default:
                System.out.println("Invalid input ");
        }
    }
}
