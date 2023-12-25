import java.util.*;
public class Recursion {
    public static void printSum(int n){
        if(n==0){
            return ;
        }
        printSum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        printSum(n);
    }
}
