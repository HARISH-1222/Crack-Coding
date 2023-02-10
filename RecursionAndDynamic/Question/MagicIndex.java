import java.util.Scanner;

public class MagicIndex {
    // int arr[] = new
    public static void main(String arg[]) {
        int arr[] = { -40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13 };
        // int arr[] = {0,1,3,4,4,6,7};
        // int arr[] = {-10,-5,2,2,2,3,4,7,9,12,13};
        int root = arr[arr.length / 2];
        System.out.println(getAns(arr, root));
        // System.out.println(getAnsWithoutDistinct(arr,0,arr.length));

    }

    public static int getAns(int arr[], int root) {
        if (root == 0 || root == arr.length) {
            return -1;
        }
        if (arr[root] > root) {
            return getAns(arr, root / 2);
        } else if (arr[root] < root) {
            return getAns(arr, (arr.length + root) / 2);
        }
        return root;
    }

    // On Book
    public static int getAnsWithoutDistinct(int arr[], int start, int end) {
        if (start > end)
            return -1;

        int midInd = (end + start) / 2;
        int root = arr[midInd];
        if (root == midInd)
            return midInd;

        // Left
        int lefInd = Math.min(midInd - 1, root);
        int left = getAnsWithoutDistinct(arr, start, lefInd);
        if (left >= 0)
            return left;

        // Right
        int RigInd = Math.max(midInd + 1, root);
        int right = getAnsWithoutDistinct(arr, RigInd, end);
        return right;

    }
}

/*
 * network layer protocol
 * TTL NIC
 * 
 * Scanner sca = new Scanner(System.in);
 * 
 * int num = sca.nextInt();
 * sca.nextLine();
 * String s = sca.nextLine();
 * 
 * // System.out.println(num+" "+s);
 * System.out.println(num+" "+s);
 */