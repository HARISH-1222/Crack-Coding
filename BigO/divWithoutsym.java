package BigO;
//36
public class divWithoutsym {
	public static void main(String arg[]) {
		int a=10,b=5;
		int count = 0,sum=0;
		while(sum<=b){
			sum += b;
			count++;
		}
		System.out.println("Div = "+count);
	}
}
