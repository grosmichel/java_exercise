import java.util.ArrayList;
import java.util.Scanner;

public class Meet {
    ///////////////////////////////////////////////////
    public static char[] d = new char[10000];
    public static int[] t = new int[10000];
    public static char[] d2 = new char[10000];
    public static int[] t2 = new int[10000];
    ////////////////////////////////////////////////////

    static ArrayList<Integer> A_path = new ArrayList<>();
    static ArrayList<Integer> B_path = new ArrayList<>();
    static int v = 1;
    static void path(int current, char direction, int time, ArrayList<Integer> path){
        if(direction == 'L'){
            for(int i=1;i<time+1;i++){
                path.add(current - i);
            }
        }
        if(direction == 'R'){
            for(int i=1;i<time+1;i++){
                path.add(current + i);
            }
        }

    }
    ////////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
        }

        ///////////////////////////////////////////////////
        A_path.add(0);
        B_path.add(0);

        for(int i=0; i<n; i++){
            path(A_path.get(A_path.size()-1),d[i],t[i],A_path);
        }
        for(int i=0; i<m; i++){
            path(B_path.get(B_path.size()-1),d2[i],t2[i],B_path);
        }

        boolean flag = true;
        int limit = Math.min(A_path.size(),B_path.size());
        int turn = 1;

        while (turn < limit) {
            if(A_path.get(turn).equals(B_path.get(turn))){
                System.out.println(turn);
                flag = false;
                break;
            }
            turn += 1;
        }

        if(flag){
            System.out.println(-1);
        }
    }
}
