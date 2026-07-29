import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        // arr1 입력
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                arr1[i][j] = sc.nextInt();

        // arr2 입력
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                arr2[i][j] = sc.nextInt();

        // 곱해서 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] * arr2[i][j]);
                if (j < 2) System.out.print(" ");
            }
            System.out.println();
        }
    }
}