//Doubt

package BigO;
//37
public class sortString {
	static int totChar = 26;
	public static void main(String arg[]) {
		int reminding = 1;
		printSortedString(reminding,"");
	}
	
	static void printSortedString(int rem,String str) {
		if(rem == 0) {
			if(isInOrder(str)) {
				System.out.println(str);
			}
		}
		else {
			for(int i=0;i<totChar;i++) {
				char c = ithLetter(i);
				printSortedString(rem-1,str+c);
			}
		}
	}
	
	static boolean isInOrder(String str) {
		for(int i=1;i<str.length();i++) {
			int prev = ithLetter(str.charAt(i-1));
			int curr = ithLetter(str.charAt(i));
			if(prev > curr)return false;
		}return true;
	}
	
	static char ithLetter(int i) {
		return (char)((char)'a' + i);
	}
}
