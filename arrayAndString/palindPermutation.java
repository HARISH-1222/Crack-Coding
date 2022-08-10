package ArraysAndString;
import java.util.HashMap;
import java.util.ArrayList;
//1.4
public class palindPermutation {
	static ArrayList<String> arrLis = new ArrayList<>();
	public static void main(String arg[]) {
		String input = "tact coa",temp="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) != ' ') temp+=input.charAt(i);
		}
		
		//O(n! * n) Worst!
//		CheckPalindrome(temp,"");
//		System.out.println(!arrLis.isEmpty());
		
		//Using Odd and Even count :
		//time and space : O(n)
		System.out.println(CheckPermuPalin(temp));
		
		//Using BitVectors :
		//time and space : O(n)
		System.out.println(CheckByBitVectors(temp));
		
	}
	
	//Using Odd and Even count :
			//time and space : O(n)
	public static boolean CheckPermuPalin(String input) {
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for(int i=0;i<input.length();i++) {
			if(hashMap.containsKey(input.charAt(i))) {
				hashMap.put(input.charAt(i),hashMap.get(input.charAt(i)) + 1);	
			}else hashMap.put(input.charAt(i),1);
		}
		System.out.println(hashMap);
		int odd=0;
		for(int i=0;i<hashMap.size();i++) {
			if(hashMap.get(input.charAt(i))%2 != 0)odd++;
		}
		if(odd>1) return false;
		return true;

	}
	
	//Using BitVectors :
			//time and space : O(n)
	public static boolean CheckByBitVectors(String input) {
		HashMap<Character,Integer> hashMap = new HashMap<>();
		for(int i=0;i<input.length();i++) {
			if(hashMap.containsKey(input.charAt(i))) {
				if(hashMap.get(input.charAt(i))==0) {
					hashMap.put(input.charAt(i),1);
				}
				else hashMap.put(input.charAt(i),0);	
			}else hashMap.put(input.charAt(i),1);
		}
//		System.out.println(hashMap.get('a'));
		int countOne=0;
		for(int i=0;i<hashMap.size();i++) {
			if(hashMap.get(input.charAt(1)) == 1)countOne++;
		}
		if(countOne>1) return false;
		return true;

	}
	
	
	//O(n! * n) Worst!
//	public static void CheckPalindrome(String input,String permu) {
//		if(input.isEmpty()) {
//			if(CheckPalin(permu)) {
//				arrLis.add(permu);
//			}
//		}else {
//			for(int i=0;i<input.length();i++) {
//				String temp = input.substring(0,i)+input.substring(i+1);;
//				CheckPalindrome(temp,permu+input.charAt(i));
//			}
//		}
//	}
//	static boolean CheckPalin(String permu){
//		String temp = "";
//		for(int i=0;i<permu.length();i++) {
//				temp = permu.charAt(i)+temp;
//		}
//		if(permu.equals(temp)) {
//				return true;
//			}
//		return false;
//	}
}