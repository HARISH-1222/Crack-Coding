public class recFibo {
    public static void main(String arg[]) {
        System.out.println(fibo(9));
    }

    public static int fibo(int i) {
        if (i == 0)
            return 0;
        if (i == 1) {
            return 1;
        }
        return fibo(i - 1) + fibo(i - 2);
    }
}
