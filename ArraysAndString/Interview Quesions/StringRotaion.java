// package ArraysAndString;

public class StringRotaion {
	public static void main(String arg[]) {
		//erbottlewaterbottlewat
		// String input1 = "waterbottle",input2 = "erbottlewat";
		String input1 = "harish",input2 = "shhari";
//		String input1 = "harish",input2 = "ishaeharharish";
		System.out.println(isSubString(input1,input2.concat(input2)));
	}

	static boolean isSubString(String s1,String s2) {
		System.out.println(s2);
		for(int i=0;i<s2.length();i++){
			if(s1.equals(s2.substring(i,s1.length()+i))){
				return true;
			}
		}
		/*
		for(int i=0;i<s2.length();i++) {
			System.out.println(i+s1.length() > s2.length());
			if(!(i+s1.length() > s2.length()) && s1.equals(s2.substring(i,i+s1.length()))) {
				return true;
			}
		}
		*/
		return false;
//		s2.contains(s1);
//		return s2.contains(s1);//Single line
	}
}
