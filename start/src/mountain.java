import java.util.Scanner;

class mountain
{	static int sol(int N,int[] L){
        int cnt = 0;
        boolean trigger = true;
        for(int i = 1;i<N+1;i++){
            if((L[i]-L[i+1]>0) && trigger){
                cnt += 1;
                trigger = false;
            }
            if(L[i]-L[i+1]<0){
                trigger = true;
            }
        }

        return cnt;
    }
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1; test_case < T+1; test_case++)
        {

            int N = sc.nextInt();
            int[] L = new int[N+2];
            for(int i = 1; i<N+1; i++){
                L[i] = sc.nextInt();
            }
            System.out.printf("#%d %d",test_case,sol(N,L));
            System.out.println();
        }

    }
}
