import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    private static void printSpaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void createTriangle() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Podaj n: ");
        n = Integer.parseInt(scanner.nextLine());
        int[][] pascal = new int[n][n];

        for(int i = 0; i < n; i++) {

            printSpaces(n - i);

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
