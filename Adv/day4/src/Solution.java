
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;

public class Solution {
    static String str;
    static int len_str;
    static int n;
    static Set<String> checked;
    static int list_len;
    static int reward;

    static void fill_list(int n){
        if(n == 0){
            return;
        }
        for(String str:checked){
            for(int i=0;i<len_str-1;i++){
                for(int j=i+1;j<len_str;j++){
                    String temp = str;
                    if(j == len_str-1){
                        temp = str.substring(0,i)+str.charAt(j)+str.substring(i+1,j)+str.charAt(i);
                    }
                    else {
                        temp = str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + str.charAt(i) + str.substring(j + 1);
                    }
                    if(checked.contains(temp)){
                        continue;
                    }
                    else {
                        checked.add(temp);
                        fill_list(n-1);
                        checked.remove(temp);
                    }
                }
            }
        }
    }

    static void find_max_reward(){
        return;
    }

    public static void main(String args[]) throws FileNotFoundException {

        System.setIn(new FileInputStream("Adv/day4/src/sample_input2.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            str = sc.next();
            len_str = str.length();
            n = sc.nextInt();
            checked = new HashSet<>();
            checked.add(str);
            reward = 0;

            fill_list(n);
            System.out.println("#" + test_case + " " + str.substring(1,3) + " " + n);
        }
    }
}
