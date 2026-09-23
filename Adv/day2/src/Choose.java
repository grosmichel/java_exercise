import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;

    static void choose(int N, int M, ArrayList<Integer> L){
        if(L.size() == M){
            for(int i=0; i<L.size();i++){
                System.out.print(L.get(i)+" ");
            }
            System.out.println();
            return;
        }
        int start = 1;
        
        if(L.size() > 0){
            start = L.get(L.size()-1)+1;
        }

        for(int i=start; i<N+1; i++){
            L.add(i);
            choose(N,M,L);
            L.remove(L.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> L = new ArrayList<>();
        choose(N,M,L);
    }
}
