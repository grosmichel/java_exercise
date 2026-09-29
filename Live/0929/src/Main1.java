public class Main1 {

    static int n;

    static void abc(int lev) {

        if (lev == n) {
            System.out.print(lev + " ");
            return;
        }

        System.out.print(lev + " ");
        abc(lev + 1);
        System.out.print(lev + " ");
    }

    public static void main(String[] args) {

        n = 5;
        abc(0);
    }
}
