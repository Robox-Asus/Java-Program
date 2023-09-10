//   Write a Java program to rotate arrays 90 degree clockwise
//        by taking matrices from user input.

import java.util.Scanner;
public class Transpose {

    static void printArray(int[][] arr,int size) {
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input size of square matrix : ");
        int size = scanner.nextInt();

        // Initialize of Square Array with given size
        int[][] arr = new int[size][size];

        // Taking value from user for an array
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(" Actual Array ");
        printArray(arr,size);

        // Transpose Logic
        for(int i=0; i<size; i++) {
            for(int j=i; j<size; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println(" Transpose of matrix ");
        printArray(arr,size);

        // Reverse Logic or Reverse the row
        for(int i=0; i<size; i++) {
            int j,l;
            for(j=0,l = size - 1;j<l;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][l];
                arr[i][l] = temp;
                l--;
            }
        }

        System.out.println(" Rotation of 90 degree matrix");
        printArray(arr,size);

    }
}
