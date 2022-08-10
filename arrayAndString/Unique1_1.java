package ArraysAndString;
import java.util.HashMap;
public class Unique1_1 {
	public static void main (String arg[]) {
//		String input = "Harish";
//		String input = "Haris";
		String input = "Hariss";
		input = input.toLowerCase();
		System.out.println(input);
		System.out.println(bruteForce(input));
		System.out.println(hashMap(input));
		}

	static boolean bruteForce(String input) {
		
		for(int i=0;i<input.length()-1;i++) {
			for(int j=i+1;j<input.length();j++) {
				if(input.charAt(i) == input.charAt(j)) return false;
			}	
		}
		return true;
	}
	
	static boolean hashMap(String input) {
		HashMap<Character,Integer> hash = new HashMap<>();
		for(int i=0;i<input.length();i++) {
			hash.put(input.charAt(i),i);
		}
		for(int i=0;i<input.length();i++) {
			if(!hash.containsValue(i)) {
				return false;
			}
		}
		return true;
	}
}