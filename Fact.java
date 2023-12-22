import java.util.Scanner;
public class Fact {
    void  factorial(){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the number ");
        a=sc.nextInt();
        int f=1;
        while(a!=0){
            f=f*a;
            a--;
        }
        System.out.println("Factorial is = "+f);

    }
    public static void main(String[] args) {
        new Fact().factorial();
    }
}
