package ArraysAndString;
//1.5
public class oneAway {
	public static void main(String arg[]) {
		String str1 = "pale",str2 = "pak";
		System.out.println(oneAway(str1,str2));
	}
	
	static boolean oneAway(String inp1,String inp2) {
		if(inp1.equals(inp2)) return true;
		else if((inp1.length()-inp2.length()) > 1 || (inp1.length()-inp2.length())< -1) {
			return false;
		}
		
		if(inp1.length() == inp2.length()) {
			return sameLength(inp1,inp2);
		}else if(inp1.length() > inp2.length()) {
			return diffLenth(inp2,inp1);
		}else {
			return diffLenth(inp1,inp2);  
		}
	}
	
	static boolean sameLength(String inp1,String inp2) {
		int check = 0;
		for(int i=0;i<inp1.length();i++) {
			if(inp1.charAt(i)!=inp2.charAt(i)) {
				if(check == 1)return false;
				check++;
			}
		}
		return true;
	}
	
	static boolean diffLenth(String inp1,String inp2) {
		int check = 0;
			for(int i=0,j=0;j<inp2.length();i++,j++) {
				if(i == inp2.length()-1 && check < 1) {
					return true;
				}
				if(inp1.charAt(i)!=inp2.charAt(j)) {
					if(check > 1)return false;
					check++;
					i-=1;
				}
			}
			//no Need !
//		}else if(inp1.length()>inp2.length()) {
//			for(int i=0,j=0;i<inp1.length();i++,j++) {
//				if(j == inp1.length()-1)return true;
//				if(inp1.charAt(i)!=inp2.charAt(j)) {
//					if(check > 1)return false;
//					check++;
//					j--;
//				}
//			}
//		}
		if(check > 1)
			return false;
		return true;
	}
}
