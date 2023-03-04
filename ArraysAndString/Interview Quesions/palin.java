package ArraysAndString;
import java.util.Scanner;
import java.util.HashMap;

public class palin{
	public static void main(String arg[]) {
		Scanner sca = new Scanner(System.in);
		String str = sca.next();
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
		//HashMap:
		for(int i=0;i<str.length();i++){
			if(hashMap.containsKey(str.charAt(i))){
				hashMap.put(str.charAt(i),hashMap.get(str.charAt(i)+1));
			}
			else{
				hashMap.put(str.charAt(i),1);
			}
		}
		int count=0;
		boolean flag = true;
//		for(int i=0;i<hashMap.size();i++) {
//			if(count>1) {
//				flag = false;
//				break;
//			}
////			if(hashMap.get(str.charAt(i)) == 1) {
//			if(hashMap.get(str.charAt(i))%2 != 0) {
//				count++;
//			}
//		}
		
		for(int i=0;i<hashMap.size();i++) {
			if(hashMap.get(str.charAt(i))%2 != 0)count++;
		}
		if(!(count>1)){
			System.out.println("yes");
		}
		else {
			System.out.println("not");
		}
	}
}