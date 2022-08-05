package BigO;
//31
//
public class primeNumCheck {
	public static void main(String arg[]) {
		if(checkPrime(100))
		{
			System.out.println("Yes !");
		}
		else {
			System.out.println("No !");
		}
	}
	
	public static boolean checkPrime(int val){
		for(int i=2;i*i<val;i++) {//also put ;Math.sqrt(val);i++
			if(val%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
