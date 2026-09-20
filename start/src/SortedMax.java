import java.util.Scanner;

public class SortedMax {

    static int max_idx(int N, int[] L){
        int M = L[0];
        int max_i = 0;

        for(int i = 1;i<N;i++){
            if(L[i]>M){
                M = L[i];
                max_i = i;
            }
        }

        return max_i;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for(int i=0;i<N;i++){
            L[i] = sc.nextInt();
        }

        int current_i = N;
        while (current_i>0) {
            current_i = max_idx(N,L);
            System.out.print(current_i+1+" ");
            N = current_i;
        }
    }
}
