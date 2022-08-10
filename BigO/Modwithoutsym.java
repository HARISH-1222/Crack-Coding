package BigO;
//36
public class Modwithoutsym {
	public static void main(String arg[]) {
		System.out.println(mod(15,4));
	}
	static int mod(int a,int b) {
		if(b<=0)return -1;
		int div = a/b;
		return a-div*b;
//		return a%b;
	}
}
