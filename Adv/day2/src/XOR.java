import java.util.Scanner;

public class XOR {
    public static final int MAX_N = 20;

    public static int[] ranges = new int[MAX_N + 1];
    public static int[] numbers =  new int[MAX_N + 1];

    public static int n, m;

    public static int ans = 0;

    public static void choose(int currIdx, int selected, int total) {
        if(selected == m) {
            ans = Math.max(ans, total);
            return;
        }

        if(currIdx >= n) {
            return;
        }

        // 1번 currIdx를 선택했을 때
        ranges[selected] = numbers[currIdx];
        choose(currIdx + 1, selected + 1, total^numbers[currIdx]);

        // 2번 currIdx 선택하지 않았을 때
        choose(currIdx + 1, selected, total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        
        choose(0, 0, 0);

        System.out.println(ans);
    }
}