import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet_joke {

    static List<int[]> generate_power_set(int[] L) {
        int n = L.length;          // 집합의 크기
        List<int[]> power_set = new ArrayList<>();      // 부분집합들을 담을 리스트

        for (int d = 0; d < Math.pow(2, n); d++) {     // 0번째부터 2^n-1번째까지 중
            int[] subset = {};             // d번째 부분집합을 만들 리스트
            int idx = 0;                 // enumerate 대신 idx = 0 사용

            // 핵심! 비트연산자 안쓰고 toBinaryString으로 이진수 문자열을 얻는다.
            // 자릿수 문제로 중복이 발생할 수 있으므로 StringBuilder로 reverse시킨다.
            // 이진수니깐 trigger는 '0'아니면 '1'이다.
            String reversed = new StringBuilder(Integer.toBinaryString(d)).reverse().toString();
            for (char trigger : reversed.toCharArray()) {

                // trigger가 '1'이면 해당 인덱스에 해당하는 L의 원소를 추가한다.
                if (trigger == '1') {
                    int[] temp = new int[subset.length + 1];
                    temp[temp.length - 1] = L[idx];
                    for (int i = 0; i < subset.length; i++) {
                        temp[i] = subset[i];
                    }
                    subset = temp;
                }

                // 0이면 그냥 넘어가되, 값에 상관없이 idx는 계속 업데이트해준다.
                idx += 1;
            }

            // 완성된 부분집합을 멱집합에 추가한다.
            power_set.add(subset);
        }

        // 완성된 멱집합을 반환한다.
        return power_set;
    }

    public static void main(String[] args) {
        int[] L = {1, 2, 3, 4};

        List<int[]> P = generate_power_set(L);  // L의 멱집합 생성.
        for (int[] arr : P) {
            System.out.println(Arrays.toString(arr));   // 부분집합을 하나씩 출력
        }
    }
}
