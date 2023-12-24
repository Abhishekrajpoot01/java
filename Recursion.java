import java.util.*;
public class Recursion {
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum = sum +i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        printSum(1,n,0);
    }
}