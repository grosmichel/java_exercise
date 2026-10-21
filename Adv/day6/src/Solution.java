//#include <iostream>
//using namespace std;


import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

    static boolean isAllRight(int N, int M, int K)
    {
        int wrong = N-M;
        return (N/K <= wrong);
    }

    static int selectOX(int score, int N, int M, int K)
    {
        if(isAllRight(N, M, K)) return score + M;
        return selectOX((score + K) * 2, N-K, M-K, K);
    }

    public static void main() throws Exception {
        System.setIn(new FileInputStream("src/sample_input.txt"));
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int tc = 1; tc < testCase + 1; tc++)
        {

            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(selectOX(0, N, M, K));
        }
    }
}
