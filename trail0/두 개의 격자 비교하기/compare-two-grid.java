import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // arr1 입력
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr1[i][j] = sc.nextInt();

        // arr2 입력
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr2[i][j] = sc.nextInt();

        // 비교 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i][j] == arr2[i][j])
                    System.out.print(0);
                else
                    System.out.print(1);
                if (j < m-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}