import java.util.ArrayList;
import java.util.Scanner;

public class DuplPermt {

    static void sol(int K, int N, ArrayList<Integer> L) {

        // N개를 모두 골랐으면 출력 후 종료
        if (L.size() == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(L.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= K; i++) {
            L.add(i);       // 1. 숫자를 추가
            sol(K, N, L);   // 2. 다음 위치 선택을 위해 재귀 호출
            L.remove(L.size() - 1); // 3. 원상복구 (백트래킹)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        ArrayList<Integer> L = new ArrayList<>();
        sol(k, n, L);
    }
}
