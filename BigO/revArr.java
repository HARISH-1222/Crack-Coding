package BigO;
//30
//Also O(n) but only go half
//but does'n impact Big O
public class revArr {
	public static void main(String arg[]) {
		char arr[] = {'h','s','i','r','a','H'};
		for(int i=0;i<arr.length/2;i++) {
			int lastPos = arr.length - i - 1;
			char temp = arr[i];
			arr[i] = arr[lastPos];
			arr[lastPos] = temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
