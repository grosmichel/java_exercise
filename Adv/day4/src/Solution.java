import java.util.Scanner;
import java.io.FileInputStream;


class Solution {

    static int n;
    static int l;
    static int reward;

    static boolean[][] checked;

    static void find_max(int curr_n, char[] arr) {
        if(curr_n == n){
            reward = Math.max(reward,Integer.parseInt(new String(arr)));
            return;
        }
        for(int i=0; i<l-1;i++){
            for(int j=i+1;j<l;j++){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                int var = Integer.parseInt(new String(arr));
                if(!checked[curr_n][var]){
                    checked[curr_n][var] = true;
                    find_max(curr_n+1,arr);
                }
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }


    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("Adv/day4/src/sample_input2.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {

            reward = 0;
            String str = sc.next();
            l = str.length();
            n = sc.nextInt();
            checked = new boolean[n][999999+1];

            char[] arr = str.toCharArray();
            find_max(0,arr);
            System.out.println("#" + test_case + " " + reward);
        }
    }
}
