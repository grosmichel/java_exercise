import java.util.Scanner;
import java.io.FileInputStream;

class QuickSort {
    static int n;
    static int[] a;

    static void sort_a(){

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

            System.out.println("#"+tc+" "+a[n/2]);
        }
    }
}
