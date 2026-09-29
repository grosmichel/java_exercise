import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BF {
    static int ans;

    static int n;
    static int[][] M;

    static void min_sum(int n, int[][] M, int curr_r, int curr_c, int curr_sum) {
        if(curr_sum>ans){
            return;
        }
        if(curr_r == n-1 && curr_c == n-1){
            ans = Math.min(curr_sum+M[curr_r][curr_c],ans);
            return;
        }
        if(curr_r+1<n) {
            min_sum(n, M, curr_r + 1, curr_c, curr_sum+M[curr_r][curr_c]);
        }
        if(curr_c+1<n){
            min_sum(n,M,curr_r,curr_c+1,curr_sum+M[curr_r][curr_c]);
        }
    }

    static void main() throws FileNotFoundException {
        System.setIn(new FileInputStream("Adv/day4/src/sample_input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            n = sc.nextInt();
            M = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            ans = 300;
            min_sum(n, M,0,0,0);
            System.out.printf("#%d %d", tc, ans);
            System.out.println();
        }
    }
}
