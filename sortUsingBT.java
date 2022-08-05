package BigO;
//38

//Check It
public class sortUsingBT {
	public static void main(String arg[]) {
		 int []arr1 = {10,6,9,7,8};
		 int[] arr2 = {10,6,8,7,9};
		 int count=0;
		 mergeSort(arr2);

		 for(int key : arr1) {
			 if(binarySearch(arr2,key)){
				 count++;
			 }
		 }
		 
		 System.out.println(count);
	}
	
	static boolean binarySearch(int arr2[],int key) {
//		
//		int rightStart = 0;
//		int leftEnd = arr2.length-1;
//		int midd = (rightStart+leftEnd)/2;
//		
//		while(rightStart <= leftEnd) {
//			midd = (rightStart+leftEnd)/2;
//			if(arr2[midd]<key) {
//				rightStart = midd+1;
//			}
//			else if(arr2[midd]>key) {
//				leftEnd = midd-1;
//			}else {
//				return true;
//			}
//		}
		if(!(binarySearch(arr2,key,0,arr2.length-1) == -1))
			return true;
		return false;
	}
	
	static int binarySearch(int arr[],int key,int rightStart,int leftEnd){
		if(rightStart>leftEnd)return -1;
		int midd = (rightStart+leftEnd)/2;
		if(arr[midd] < key){
			return binarySearch(arr,key,midd+1,leftEnd);
		}
		else if(arr[midd]>key){
			return binarySearch(arr,key,rightStart,midd-1);
		}
		else return midd;
//		System.out.println(arr[leftEnd]+" "+key);
//		if(rightStart > leftEnd) {
//			 System.out.println("no");
//			return -1;
//		}
//
//		int midd = (rightStart + leftEnd)/2;
//		System.out.println(arr[midd]+" "+key);
//		
////		if(arr[midd] == key) {
////			 System.out.println("yess");
////			return true;
////		}
//		if(arr[midd]<key) {
//			 System.out.println("hii");
//			return binarySearch(arr,key,midd+1,leftEnd);
//		}
//		else if(arr[midd]>key) {
//
//			 System.out.println("hiii");
//			return binarySearch(arr,key,rightStart,midd-1);
//		}
//		else return midd;
	}
	
	static void mergeSort(int arr2[]) {
		int helper[] = new int[arr2.length];
		mergeSort(arr2,helper,0,arr2.length-1);
	}
	
	static void mergeSort(int arr[],int helper[],int leftStart,int rightEnd) {	
		if(leftStart >= rightEnd)return;
		int midd = (leftStart+rightEnd)/2;
		mergeSort(arr,helper,leftStart,midd);
		mergeSort(arr,helper,midd+1,rightEnd);
		merge(arr,helper,leftStart,midd,rightEnd);
	}
	
	static void merge(int arr[],int helper[],int leftStart,int middle,int rightEnd) {
		for(int i=leftStart;i<=rightEnd;i++)
			helper[i] = arr[i];
		int helpLef = leftStart;
		int helpRig = middle+1;
		int current = leftStart;
		
		while(helpLef<=middle && helpRig<=rightEnd) {
			if(helper[helpLef] <= helper[helpRig]) {
				arr[current] = helper[helpLef];
				helpLef++;
			}	
			else {
				arr[current] = helper[helpRig];
				helpRig++;
			}
			current++;
		}
		
		int reminding = middle - helpLef;
		for(int i=0;i<=reminding;i++)
			arr[current+i] = helper[helpLef+i];
	}
}
