import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력되는 두 정수를 변수 n과 m에 저장합니다.
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // 세로 n줄만큼 반복
        for (int i = 0; i < n; i++) {
            // 가로 m칸만큼 별 출력
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            // 한 줄 출력이 끝나면 줄바꿈
            System.out.println();  
        }
        
        sc.close();
    }
}