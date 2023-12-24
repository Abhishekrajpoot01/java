import java.util.*;
public class FactorialEx {
   public static int calcfactorial(int n){
        if(n<=1){
            return 1;
        }
       return n*calcfactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nubmer for calculate factorial : ");
        int n = sc.nextInt();
        System.out.println("The factorial is "+calcfactorial(n));
    }
}
