package ArraysAndString;
import java.util.Scanner;
public class URLift {
	public static void main(String arg[]) {
		Scanner sca = new Scanner(System.in);
		String input1 = sca.nextLine();
//		System.out.println(input1);
		int input2 = sca.nextInt();
		System.out.println(getUsingBruteForce(input1));
	}
	
	public static String getUsingBruteForce(String input) {
		String output = "";
		int count=0,flag=0;
		char charInput[]= input.toCharArray();
		for(int i=charInput.length-1;i>=0;i--) {
			if(count == 0 && charInput[i] == ' ' && !(flag == 0)) {
				output="%20"+output;
				count++;
			}
			else if(charInput[i] != ' ') {
				output=charInput[i]+output;
				count=0;
				flag++;
			}
		}
		return output;
	}
}
