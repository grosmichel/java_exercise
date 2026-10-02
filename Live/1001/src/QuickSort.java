import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class QuickSort {
    static int n;
    static int[] a;
    static int save_s;
    static int save_b;

    static void sort_a(int start, int end){

    }

    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("Live/1001/src/sample_input2.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1;tc<=T;tc++){
            n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            sort_a(0,n);
            System.out.println("#"+tc+" "+a[n/2]);
            System.out.println(Arrays.toString(a));
        }
    }
}
