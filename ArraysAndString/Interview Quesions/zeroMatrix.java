
// package ArraysAndString;

import java.util.Set;
import java.util.HashSet;

//O(M.N)
class zeroMatrix {
	public static void main(String arg[]) {
		int arr[][] = { { 1, 5, 2 }, { 1, 4, 2 }, { 0, 5, 2 }, { 0, 0, 2 } };
		Set<Integer> rowSet = new HashSet<Integer>();
		Set<Integer> columnSet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				if (arr[i][j] == 0) {
					rowSet.add(i);
					columnSet.add(j);
				}
			}
		}

		for (int i : rowSet) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j : columnSet) {
				arr[i][j] = 0;
			}
		}

		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}