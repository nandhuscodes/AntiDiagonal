import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AntiDiagonal {
    static void findAntiDiagonal(int[][] matrix){
        int N = matrix.length;
        int[][] result = new int[N * 2 - 1][N];
        for (int i = 0; i < N * 2 - 1; i++) {
            int row = Math.min(i, N - 1);
            int col = Math.max(i - N + 1, 0);
            int index = 0;
            while (row >= 0 && col < N) {
                result[i][index++] = matrix[row][col];
                row--;
                col++;
            }
            while (index < N) {
                result[i][index++] = 0;
            }
        }
        for (int[] diagonal : result) {
            for (int num : diagonal) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        findAntiDiagonal(matrix);
    }
}
