import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

public class Baby_gin {

    static int[] A;
    static int[] B;

    static int winner;

    static boolean check(int[] L){
        boolean trigger = false;
        int l = L.length;

        for(int i=0; i<l-2;i++){
            if(L[i] == L[i+1] && L[i] == L[i+2]){
                return true;
            }
        }

        int cnt = 1;
        for(int i=0;i<l-1;i++){
            if(L[i]+1 == L[i+1]){
                cnt += 1;
                if(cnt == 3){
                    return true;
                }
            } else if (L[i]+1 > L[i+1]) {
                continue;
            }
            else {
                cnt = 1;
            }
        }

        return false;
    }

    static boolean babygin(int[] A, int[] B) {
        if(check(A) && !check(B)){
            winner = 1;
            return true;
        } else if (!check(A) && check(B)) {
            winner = 2;
            return true;
        } else if (check(A) && check(B)) {
            winner = 1;
            return true;
        }
        else {return false;}
    }

    public static void main() throws Exception {
        System.setIn(new FileInputStream("Adv/day5/src/sample_input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            A = new int[6];
            B = new int[6];
            winner = 0;
            for (int turn = 0; turn < 6; turn++) {
                A[turn] = sc.nextInt();
                B[turn] = sc.nextInt();
            }
            for (int turn = 0; turn < 6; turn++) {
                int[] A_temp = Arrays.copyOfRange(A, 0, turn + 1);
                int[] B_temp = Arrays.copyOfRange(B, 0, turn + 1);
                Arrays.sort(A_temp);
                Arrays.sort(B_temp);

                if (babygin(A_temp, B_temp)) {
                    break;
                }
            }
            System.out.println("#" + tc + " " + winner);
        }
    }
}
