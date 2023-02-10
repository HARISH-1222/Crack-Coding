// Bottom up
public class FiboIterat {
    public static void main(String arg[]) {
        int a = 0, b = 1, temp = 0;
        System.out.print(a + " " + b);
        for (int i = 2; i < 5; i++) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(" " + b);
        }
    }
}