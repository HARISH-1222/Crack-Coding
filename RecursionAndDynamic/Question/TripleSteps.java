import java.util.Arrays;

public class TripleSteps {
    public static void main(String arg[]) {
        int n = 10;
        System.out.println(TripleStep(n, new int[n + 1]));
        // int memo[] = new int[n + 1];
        // Arrays.fill(memo, -1);
        // System.out.println(TripleStepBook(n, memo));
    }

    // Own
    public static int TripleStep(int i, int memo[]) {
        if (i == 0 || i == 1 || i == 2)
            return i;
        if (i == 3)
            return i + 1;
        if (memo[i] == 0) {
            memo[i] = TripleStep(i - 1, memo) + TripleStep(i - 2, memo) + TripleStep(i - 3, memo);
        }
        System.out.println(i + " " + memo[i]);
        return memo[i];
    }

    // In book :
    public static int TripleStepBook(int i, int memo[]) {
        if (i < 0)
            return 0;
        else if (i == 0)
            return 1;
        else if (memo[i] > -1) {// Both are Same
            return memo[i];
        } else {
            memo[i] = TripleStepBook(i - 1, memo) + TripleStepBook(i - 2, memo) + TripleStepBook(i - 3, memo);
            return memo[i];
        }
        // System.out.println(i + " " + memo[i]);

    }
}
