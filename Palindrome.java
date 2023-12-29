import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        int n,rev=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check ");
        n=sc.nextInt();
        int k=n;
        while(n!=0)                 
        {
            rem=n%10;               
            rev=rev*10+rem;             
            n=n/10;                 
        }
        if(k==rev){
            System.out.println("The number is palindrome ");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
