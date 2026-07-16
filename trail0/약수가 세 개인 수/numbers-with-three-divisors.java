import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int count = 0;  // 약수 3개인 수 개수

        for (int i = start; i <= end; i++) {
            int divisor = 0;  // 약수 개수
            for (int j = 1; j <= i; j++) {  // ① i까지 나누어 떨어지는지 확인
                if (i % j == 0) {            // ② 나머지가 0이면 약수
                    divisor++;
                }
            }
            if (divisor == 3) {              // ③ 약수 개수가 정확히 3개면
                count++;
            }
        }
        System.out.println(count);               // ④ 조건에 맞는 수의 총 개수 출력
    }
}