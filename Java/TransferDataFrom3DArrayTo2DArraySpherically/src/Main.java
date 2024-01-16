import java.util.Scanner;

//Size is entered by user in console and a square matrix is created
//Matrix is filled with numbers 1-size (Example: size 4 => 4 * 4 = 16 elements)
//A new 2D Array is created and filled with all numbers in matrix, transferred spherically
//The new array is printed with space-separation

//      Example of spherical transfer:
//         3D Array
//         1 2 3 4
//         5 6 7 8
//         9 10 11 12
//         13 14 15 16
//
//         2D Array:
//         1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7

public class Main {

    public static Scanner inp = new Scanner(System.in);
    public static int size;

    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        size = inp.nextInt();

        int[][] twoDArr = CreateAndFillMultiDArrayWithNums();

        int[] newArr = TransferSpherically(twoDArr);
        PrintArray(newArr);
    }

    public static int[][] CreateAndFillMultiDArrayWithNums() {
        int[][] twoDArray = new int[size][size];

        int num = 1;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                twoDArray[i][j] = num++;
            }
        }

        return twoDArray;
    }

    public static int[] TransferSpherically(int[][] twoDArr) {
        int[] oneDArr = new int[size * size];

        int colsMinIndex = 0;
        int rowsMinIndex = 0;

        int colsMaxIndex = size - 1;
        int rowsMaxIndex = size - 1;

        int index = 0;

        while(index < size * size) {

            for(int row = rowsMinIndex; row <= rowsMaxIndex; row++) {
                oneDArr[index++] = twoDArr[row][colsMinIndex];
            }
            colsMinIndex++;

            for(int col = colsMinIndex; col <= colsMaxIndex; col++) {
                oneDArr[index++] = twoDArr[rowsMaxIndex][col];
            }
            rowsMaxIndex--;

            for(int row = rowsMaxIndex; row >= rowsMinIndex; row--) {
                oneDArr[index++] = twoDArr[row][colsMaxIndex];
            }
            colsMaxIndex--;

            for(int col = colsMaxIndex; col >= colsMinIndex; col--) {
                oneDArr[index++] = twoDArr[rowsMinIndex][col];
            }
            rowsMinIndex++;
        }

        return oneDArr;
    }

    public static void PrintArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}