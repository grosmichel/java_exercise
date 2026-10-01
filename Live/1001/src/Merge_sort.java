import java.util.Scanner;
import java.io.FileInputStream;

class Merge_sort {
    static int n;
    static int[] a;
    static int[] temp;
    static int cnt;

    static void sorted_a(int start, int end) {
        if (start == end-1) {
            return;
        }

        int temp_n = end - start;
        int mid = (start+end) / 2;
        sorted_a(start, mid);
        sorted_a(mid, end);

        if (a[mid - 1] > a[end - 1]) {
            cnt += 1;
        }

        temp = new int[temp_n];
        int curr_i = start;
        int curr_j = mid;
        int curr_k = 0;
        while (curr_i < mid && curr_j < end) {

            if (a[curr_i] <= a[curr_j]) {
                temp[curr_k] = a[curr_i];
                curr_i += 1;
            } else {
                temp[curr_k] = a[curr_j];
                curr_j += 1;
            }
            curr_k += 1;
        }
        if (curr_i == mid) {      // 왼쪽 배열의 인덱스가 임계점 도달. 복사할 원소 없음.
            for (int i = curr_k; i < temp_n; i++) {
                temp[i] = a[curr_j];
                curr_j += 1;
            }
        } else {                  // 오른쪽 배열의 인덱스가 임계점 도달. 복사할 원소 없음.
            for (int i = curr_k; i < temp_n; i++) {
                temp[i] = a[curr_i];
                curr_i += 1;
            }
        }

        for (int i = start; i < end; i++) {
            a[i] = temp[i - start];
        }

    }

    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("Live/1001/src/sample_input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            cnt = 0;

            sorted_a(0, n);
            System.out.println("#" + tc + " " + a[n / 2] + " " + cnt);
        }
    }
}
