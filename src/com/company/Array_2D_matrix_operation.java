package com.company;
import java.util.Scanner;
public class Array_2D_matrix_operation {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        System.out.println("Enter size of Square matrix");
        int size = scan_value.nextInt();
        int[][] matrix = new int[size][size];
        int [][] transpose = new int[size][size];
        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size; j++)
            {
                int item = scan_value.nextInt();
                matrix[i][j]=item;
            }
        }
        System.out.println("Your entered matrix is: ");
        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Transpose of input matrix is:");
        for (int i =0; i<size; i++)
        {
            for (int j =0; j<size; j++)
            {
                transpose[i][j]=matrix[j][i];
            }
        }
        for (int i=0; i<size; i++)
        {
            for (int j =0; j<size; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
