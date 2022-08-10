package BigO;
//36
public class squarRootlargNum {
	public static void main(String arg[]) {
		int num=100;
		System.out.println(squrt(num));
	}
	
	static int squrt(int num) {
		for(int i=0;i*i<=num;i++) {
			if(i*i == num) {
				return i;
			}
		}
		return -1;
	}
}
