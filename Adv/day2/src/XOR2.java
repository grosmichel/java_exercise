import java.util.ArrayList;
import java.util.Scanner;

public class XOR2 {

    static int maxVal = 0;

    // L 배열 대신 선택한 원소의 XOR 누적값(currentXor)과 선택한 개수(count)를 추적
    static void choose(int N, int M, int[] A, int start, int count, int currentXor) {
        // M개를 모두 선택했을 때 최대값 갱신 후 종료
        if (count == M) {
            maxVal = Math.max(maxVal, currentXor);
            return;
        }

        // 선택 가능한 범위를 벗어나면 종료 (남은 원소 수가 필요한 개수보다 적을 때)
        if (start >= N) {
            return;
        }

        for (int i = start; i < N; i++) {
            // i번째 원소를 선택하고 다음 인덱스(i + 1)로 진행
            choose(N, M, A, i + 1, count + 1, currentXor ^ A[i]);
        }
    }

    static int max_xor(int N, int M, int[] A) {
        maxVal = 0;
        choose(N, M, A, 0, 0, 0);
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(max_xor(N, M, A));
    }
}
