import java.util.Scanner;
class Fibonacci{
    public static void fib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fib(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fib(a,b,n-2);
    }
}