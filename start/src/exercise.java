import java.util.Scanner;
import java.util.Arrays;

public class exercise {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {new int[3], new int[4], new int[5], new int[6]};
        int i = sc.nextInt();
        System.out.println(Arrays.deepToString(arr));
    }
}
