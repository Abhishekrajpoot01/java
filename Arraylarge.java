import java.util.*;
public class Arraylarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array ");
        size=sc.nextInt();
        int Arr[] = new int[size];
        System.out.println("Enter the elements into array ");
        for(int i=0;i<size;i++)
        {
            Arr[i]=sc.nextInt();
        }
        int large = Arr[0];
        int small = Arr[0];
        for(int i=0;i<size;i++)
        {
            if(Arr[i]>large)
            {
                large=Arr[i];
            }
            else if(Arr[i]<small)
            {
                small=Arr[i];
            }
        } 
        System.out.println("The largest element is "+large);       
        System.out.println("The smallest element in "+small);
    }

    private static void elif(boolean b) {
    }
}
