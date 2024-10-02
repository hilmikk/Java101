import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix1 = new int[3][2];

        System.out.println("Your values in matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose1 = new int[2][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transpose1[j][i] = matrix1[i][j];
            }
        }
        System.out.println("Transpose matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose1[i][j] + " ");
            }
            System.out.println();
        }
    }
}