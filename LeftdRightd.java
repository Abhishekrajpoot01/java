import java.util.Scanner;
 public class LeftdRightd
{
    public static void main(String[] args) {
        int row,column,i,j,ld=0,rd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row :");
        row=sc.nextInt();
        System.out.println("Enter the column");
        column=sc.nextInt();
        int arr[][]=new int[row][column];

        // taking input in the matrix
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.println("Enter the elements :");
                arr[i][j]=sc.nextInt();
            }
        }
        // display the matrix

        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        j=2;
        for(i=0;i<row;i++)
        {
            ld=ld+arr[i][i];
            rd=rd+arr[j][i];
            j--;
        }
        System.out.println("The sum of left diagonal is "+ld);
        System.out.println("The sum of right diagonal is "+rd);
    }
}