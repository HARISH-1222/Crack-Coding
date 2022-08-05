package BigO;
import java.util.ArrayList;
public class premutation_Arr {
	static ArrayList arrLis = new ArrayList<>();
	public static void main(String arg[]) {
		String str = "1234";
		premutationMeth(str,"");
		for (int i = 0; i < arrLis.size(); i++) 
            System.out.print(arrLis.get(i) + " "); 
	}
	
	static void premutationMeth(String str,String pref) {
		
		if(str.length() == 0) {
			arrLis.add(pref);
		}else{
			for(int i=0;i<str.length();i++) {
				String temp = str.substring(0,i)+str.substring(i+1);
				premutationMeth(temp,pref+str.charAt(i));
			}
		}
	}
}
