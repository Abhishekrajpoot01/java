import java.util.*;
public class String1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Abhishek");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

       // insert char

        sb.insert(8,'R');
        System.out.println(sb);

        // delete the char
        sb.delete(2,3);
        System.out.println(sb);
        sb.delete(1,2);
        
         // append operation
         sb.append("e");
         System.out.println(sb);

         System.out.println(sb.length());
         StringBuilder sb1=new StringBuilder("Harsh");
         System.out.println(sb1);
         for(int i=0;i<((sb1.length())/2);i++)
         {
            int front = i;
            int back = sb1.length()-1-i;
         char frontChar=sb.charAt(front);
         char backChar=sb.charAt(back);

         sb.setCharAt(front,backChar);
         sb.setCharAt(back,frontChar);
         }
         System.out.println(sb);
    }
}