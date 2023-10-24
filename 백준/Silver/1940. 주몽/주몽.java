import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (A[i] + A[j] < M) { // 1 + 7 = 8 < 9   -> 2 + 7 = 9
                i++;
            } else if (A[i] + A[j] > M) { //  3 + 7 = 10 > 9  -> 3 + 6 = 9
                j--;
            } else { // A[i] + A[j] == M
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        bf.close();
    }
}
