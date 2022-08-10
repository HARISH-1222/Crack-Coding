package BigO;
//35
//O(log n)
public class powOfTwo {
	public static void main(String arg[]) {
		int num=10;
		System.out.println("main :"+pow(num));
	}
	
	public static int pow(int num) {
		if(num <= 0) return 0;
		else if(num == 1) return 1;
		else {
			int prv = pow(num/2);
			int curr = prv*2;
			System.out.println(curr);
			return curr;
		}
	}
}
