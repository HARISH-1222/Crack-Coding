package BigO;

//36
//It will append the array into the last of another array
public class appendArray {
	public static void main(String arg[]) {
		int arr[] = new int[0];
		int array[] = {1,2,3,4,5,6};
		for(int val : array) {
			arr = toAppend(arr,val);
		}
		
		for(int val : arr) {
			System.out.println(val);
		}
	}
	
	public static int[] toAppend(int arr[],int val) {
		int array[] = new int[arr.length+1];
		for(int i=0;i<arr.length;i++)
			array[i] = arr[i];
		array[array.length-1] = val;
		return array;
	}
}
