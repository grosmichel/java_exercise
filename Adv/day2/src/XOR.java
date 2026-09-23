import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<ArrayList<Integer>> List = new ArrayList<>();
////////////////////////////////////////////////////////////////

static void choose(int N, int M, ArrayList<Integer> L){
        if(L.size() == M){

            // 새로 복사 해서 add해라. 안그럼 복사 오류난다..
            List.add(new ArrayList<>(L));
            return;
        }
        int start = 0;
        
        if(L.size() > 0){
            start = L.get(L.size()-1);
        }

        for(int i=start; i<N; i++){
            L.add(i);
            choose(N,M,L);
            L.remove(L.size()-1);
        }
    }
////////////////////////////////////////////////////////////////

    static int max_xor(int N, int M, int[] A){

        int max = 0;

        choose(N,M,new ArrayList<>());

        for(int i=0; i<List.size();i++){

            ArrayList<Integer> temp = List.get(i);
            int[] temp2 = new int[M];

            for(int j=0;j<M;j++){
                temp2[j] = A[temp.get(j)];
            }

            int xor = temp2[0];

            for(int j=1;j<M;j++){
                xor ^= temp2[j];
            }

            max = Math.max(max,xor);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(max_xor(N,M,A));
    }
}
