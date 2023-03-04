package ArraysAndString;
import java.util.ArrayList;

public class checkPermutation {
	static ArrayList<String> permutation1 = new ArrayList<>();
	static ArrayList<String> permutation2 = new ArrayList<>();
	public static void main(String arg[]) {
//		String output_1 = "Harish";
//		String output_2 = "Hrsiha";
//		String output_1 = "test";
//		String output_2 = "ttew";
		String output_1 = "geeksfor";
		String output_2 = "forgeeks";
		getPrmutation(output_1,"",permutation1);
		getPrmutation(output_2,"",permutation2);
		System.out.println(getEqualVal(permutation1,permutation2));
	}
	
	static void getPrmutation(String output,String permu,ArrayList premutation) {
		if(output.isEmpty()) {
			premutation.add(permu);
		}else {
			for(int i=0;i<output.length();i++) {
				String temp = output.substring(0,i)+output.substring(i+1);
				getPrmutation(temp,permu+output.charAt(i),premutation);
			}
		}
	}
	
	static boolean getEqualVal(ArrayList permutation1,ArrayList permutation2) {
		ArrayList<String> permutation = new ArrayList<String>();
		for(Object i : permutation1) {
			if(permutation2.contains(i)) {
				permutation.add((String) i);
			}
		}
		return !permutation.isEmpty();
	}
}
