public class topdownRecur {
    public static void main(String arg[]) {
        System.out.println(fibo(9, new int[10]));
    }

    public static int fibo(int i, int memo[]) {
        if (i == 0)
            return 0;
        if (i == 1) {
            return 1;
        }
        if (memo[i] == 0) {
            memo[i] = fibo(i - 1, memo) + fibo(i - 2, memo);
        }
        return memo[i];
    }
}
