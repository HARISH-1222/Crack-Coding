package BigO;

public class stringCompress {
	public static void main(String arg[]) {
		String str1 = "aaabccccccaa";
//		System.out.println(getCount(str1));
		System.out.println(getCount(str1));
	}
	
	public static String getCount(String str1) {
		String temp = "";
		int count=0;
		for(int i=0;i<str1.length();i++) {
			count++;
			if(i+1>=str1.length() || str1.charAt(i) != str1.charAt(i+1)) {
//				temp+=str1.charAt(i);
//				temp+=count;
				//Or
				temp+=""+str1.charAt(i)+count;
				count=0;
			}
		}
		if(temp.length() > str1.length()) {
			return str1;
		}
		return temp;
		
	}
	
//	public static String getCount(String str1) {
//		String temp = "";
//		int count=1;
//		for(int i=0,j=1;i<str1.length();i++) {
//			while(str1.charAt(i) == str1.charAt(j)) {
//					count++;
//					j++;
//					if(j==str1.length()) {
//						break;
//					}
//			}
//			temp+=str1.charAt(i);
//			temp+=count;
//			count=0;
//			i=j-1;
//		}
//		if(temp.length() > str1.length()) {
//			return str1;
//		}
//		return temp;
//		
//	}
}
