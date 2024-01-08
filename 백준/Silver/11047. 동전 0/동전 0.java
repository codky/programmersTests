import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt(); // 금액
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        // 그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0; // 동전 개수
        for (int i = N-1; i>=0; i--) { // 큰 동전먼저 
            if (A[i] <= K) { // 동전의 값이 금액보다 작거나 같으면
                count += (K/A[i]); // 동전으로 목표금액을 나누고 동전의 사용개수를 count에 넣는다.
                K = K % A[i]; // 목표금액을 동전으로 나누고 남은 값을 K(목표금액)로 다시 초기화한다.
            }
        }
        System.out.println(count);
    }
}
