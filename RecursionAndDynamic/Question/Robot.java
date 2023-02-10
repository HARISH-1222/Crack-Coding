public class Robot {
    public static void main(String arg[]) {
        int r = 18, c = 18;
        long a[][] = new long[r + 1][c + 1];
        System.out.println(RobotMove(a, r, c));
    }

    public static long RobotMove(long a[][], int r, int c) {
        if (r == 0 || c == 0)
            return 0;

        if (r == 1 || c == 1)
            return 1;
        if (a[r][c] == 0) {
            a[r][c] = RobotMove(a, r - 1, c) + RobotMove(a, r, c - 1);
        }
        return a[r][c];
    }
}
