import java.util.Scanner;

public class Factorial {
    void factorial(int x)
    {
        int f = 1;
        while (x != 0) 
        {
            f = f * x;
            x--;
        }
        System.out.println("Factorial = " + f);
    }

    public static void main(String args[])
    {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Factorial f = new Factorial();
        f.factorial(a);
    }
}
