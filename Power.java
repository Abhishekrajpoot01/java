import java.util.*;
class Power
{
    public static int calculatePower(int x,int p)
    {
        if(p==0)
        {
            return 1;
        }
        return x*calculatePower(x,p-1);

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int base =sc.nextInt();
        System.out.println("Enter the exponent : ");
        int exponent =sc.nextInt();
        calculatePower(base,exponent);
        System.out.println("The result is "+calculatePower(base,exponent));
    }
}