import java.util.ArrayList;
import java.util.Scanner;

public class BeautyNum {
    static int cnt = 0;

    // 아름다운 수열인지 검사하는 함수
    static boolean isBeautiful(ArrayList<Integer> L) {
        for (int i = 0; i < L.size(); i += L.get(i)) {
            int tg = L.get(i);

            // 범위를 벗어나는 경우
            if (i + tg > L.size()) {
                return false;
            }

            // tg개만큼 연속된 숫자가 동일한지 검사
            for (int j = 1; j < tg; j++) {
                if (L.get(i + j) != tg) {
                    return false;
                }
            }
        }

        return true;
    }

    // 재귀적으로 숫자를 선택하는 함수 (목표 길이 targetSize를 인자로 받음)
    static void cnt_beauty_num(int N, ArrayList<Integer> L) {
        // 목표한 개수만큼 모두 골랐을 때
        if (L.size() == N) {
            if (isBeautiful(L)) {
                cnt++;
            }
            return;
        }

        // 1부터 4까지의 숫자 중 하나 선택
        for (int i = 1; i <= 4; i++) {
            L.add(i);                   // 숫자 추가
            cnt_beauty_num(N, L);      // 다음 상태 탐색
            L.remove(L.size() - 1);     // 원상복구 (백트래킹)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 탐색 시작 (빈 리스트 전달)
        ArrayList<Integer> L = new ArrayList<>();
        cnt_beauty_num(N, L);

        System.out.println(cnt);
    }
}
