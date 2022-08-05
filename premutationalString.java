package BigO;
//32
public class premutationalString {
	public static void main(String arg[]){
		String NumStr = "1234";
		premutation(NumStr,"");
		
	}
	
	static void premutation(String num,String pref){
	if(num.length() == 0) {
		System.out.println(pref);
	}
//		for(int i=0;i<num.length();i++) {
//			String temp = num.substring(0,i)+num.substring(i+1);
//			premutation(temp,pref+num.charAt(i));
//		}
		for(int i=0;i<num.length();i++) {
			String temp = num.substring(0,i)+num.substring(i+1);
			premutation(temp,pref+num.charAt(i));	
		}
	}
}
