package BigO;

public class powOf {
	public static void main(String arg[]) {
		System.out.println(powOf(2,4));
	}
	static int powOf(int a,int b) {
		if(b <0) return 0;
		else if(b == 0) return 1;
		else {
//			System.out.println(a*powOf(a,b-1));
			return a*powOf(a,b-1); 
		}
	}
}
