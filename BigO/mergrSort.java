package BigO;

public class mergrSort {
	public static void main(String arg[]) {
		int arr[] = {5,1,4,2,3,2,9,7,5,7};
		mergeSort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static void mergeSort(int arr[]) {
		int temp[] = new int[arr.length];
		mergeSort(arr,temp,0,arr.length-1);
	}
	
	public static void mergeSort(int arr[],int temp[],int leftStart,int rightEnd) {
		if(leftStart>=rightEnd)return;
		int midd = (leftStart+rightEnd)/2;
		mergeSort(arr,temp,leftStart,midd);
		mergeSort(arr,temp,midd+1,rightEnd);
		merge(arr,temp,leftStart,midd,rightEnd);
	}
	
	public static void merge(int arr[],int temp[],int leftStart,int midd,int rightEnd) {
//		Also work
//		for(int i=0;i<arr.length;i++)temp[i] = arr[i];
		for(int i=leftStart;i<=rightEnd;i++)temp[i] = arr[i];
		int left = leftStart;
		int right = midd+1;
		int current = leftStart;
		
		while(left<=midd && right<=rightEnd) {
			if(temp[left]<=temp[right]) {
				arr[current] = temp[left];
				left++;
			}
			else {
				arr[current] = temp[right];
				right++;
			}
			current++;
		}
		int remind = midd - left;
		for(int i=0;i<=remind;i++) {
			arr[current+i] = temp[i+left];
		}
	}
}
