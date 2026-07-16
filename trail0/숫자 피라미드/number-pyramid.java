import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 정수 N 입력 받기
        int n = sc.nextInt();
        
        // N줄만큼 반복
        for (int i = 1; i <= n; i++) {
            // i번째 줄에는 i개의 숫자가 출력되도록 i번 반복
            for (int j = 0; j < i; j++) {
                System.out.print( i+" ");
            }
            // 한 줄 출력이 끝나면 줄바꿈
            System.out.println();
        }
        
        sc.close( );
    }
}