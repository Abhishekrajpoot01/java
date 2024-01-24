#include <stdio.h>
void main()
{
    int rows, cols;
    printf("Enter the number of rows ");
    scanf("%d", &rows);
    printf("Enter the number of columns ");
    scanf("%d", &cols);
    int A[rows][cols], trans[rows][cols];
                    // taking input
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            printf("Enter the elements ");
            scanf("%d", &A[i][j]);
        }
    }
                    // code for transpose
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            trans[j][i] = A[i][j];
        }
    }
                    // printing original matrix
    printf("The original matrix is \n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            printf("%d\t", A[i][j]);
        }
        printf("\n");
    }
                    // printing the transpose matrix
    printf("The transpose matrix is \n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            printf("%d\t", trans[i][j]);
        }
        printf("\n");
    }
                    // checking if the matrix are symmetric or not 
    int symmetric = 1;
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            if (A[i][j] != trans[i][j])
            {
                symmetric = 0;
                break;
            }
        }
    }

    if(symmetric == 0)
    {
        printf("The matrix is not symmetric ");
    }
    else
    {
        printf("The matrix is symmetric ");
    }
}