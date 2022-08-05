package BigO;
//36
public class squarRoot {
	public static void main(String arg[]) {
		int num=100;
		System.out.println(squrt(num,1,num));
	}
	
	static int squrt(int num,int min,int max) {
		if(max<min)return -1;
		int guess = (min+max)/2;
		if(guess*guess == num)return guess;
		else if(guess*guess < num)return squrt(num,guess+1,max);
		else return squrt(num,min,guess-1);
	}
}
