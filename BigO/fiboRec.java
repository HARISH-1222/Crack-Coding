package BigO;
//33,34
//O(2^n)
public class fiboRec {
	public static void main(String arg[]) {
//		for(int i=0;i<=10;i++) {
//			System.out.println("fibo of "+i+" : "+fiboNum(i));
//		}
		int n=5;
		int memo[] = new int [n+1];
		for(int i=0;i<n;i++) {
			System.out.println("fibo of "+i+" : "+fiboNum(i,memo));
		}
	}
	
//	public static int fiboNum(int num){
//		if(num<=0)return 0;
//		else if(num == 1)return 1;
//		
//		return fiboNum(num-1)+fiboNum(num-2);	
//	}
	public static int fiboNum(int num,int memo[]){
		if(num<=0)return 0;
		else if(num == 1)return 1;
		else if(memo[num]>0)return memo[num];
		memo[num] =  fiboNum(num-1,memo)+fiboNum(num-2,memo);
		return memo[num];
	}
}
