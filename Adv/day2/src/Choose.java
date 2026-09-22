import java.util.Scanner;

public class Choose {
    public static final int MAX_N = 10;
    
    public static int n, m;
    public static int[] ranges = new int[MAX_N + 1];

    public static void printNumber() {
        for(int i = 0; i < m; i++) {
            System.out.print(ranges[i] + " ");
        }
        System.out.println();
    }

    public static void choose(int curr, int selected) {
        if(selected == m) {
            printNumber();
            return;
        }
        
        if(curr == n + 1) {
            return;
        }

        // 1. curr을 선택하는 경우
        ranges[selected] = curr;
        choose(curr + 1, selected + 1);

        // 2. curr을 선택하지 않는 경우
        choose(curr + 1, selected);
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        choose(1, 0);
    }
}