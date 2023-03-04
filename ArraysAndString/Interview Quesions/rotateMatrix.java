package ArraysAndString;
import java.util.Scanner;
public class rotateMatrix {
	 public static void main(String arg[]) {
		 Scanner sca = new Scanner(System.in);
		 int siz=4;
		 
//		 int arr[][] = {{1,2},{3,4}};
//		 int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		 int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		 int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

//		 get From user :
//		 int arr[][] = new int[siz][siz];
//		 for(int i=0;i<siz;i++) {
//			 for(int j=0;j<siz;j++) {
//				 arr[i][j] = sca.nextInt();
//			 }
//		 }
		 
		 travels(siz,arr);
		 System.out.println();
		 //Easy but not inplace(Not use duplicat)
//		 toChange(siz,arr);
		 System.out.println();
		 book(arr);
		 
	 }

	 static void toChange(int siz,int arr[][]) {
		 int temp[][] = new int[siz][siz];
		 for(int i=0;i<siz;i++) {
			 for(int j=0;j<siz;j++) {
				 temp[j][siz-1-i] = arr[i][j];
			 }
		 }
		 System.out.println();
		 System.out.println();
		 travels(siz,temp);
	 }
	 
	 static void travels(int siz,int arr[][]) {
		 for(int i=0;i<siz;i++) {
			 for(int j=0;j<siz;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 static boolean book(int arr[][]) {
		 if(arr.length == 0 || arr.length != arr[0].length) return false;
		 int siz = arr.length;
		 for(int i=0;i<siz/2;i++) {
			 int fir = i;
			 int last = siz-1-i;
			 System.out.println(fir +" "+last);
			 for(int j=fir;j<last;j++) {
				 int offset = i-fir;
				 int top = arr[fir][j];
				 
				 arr[fir][j] = arr[last-offset][fir];
				 arr[last-offset][fir] = arr[last][last-offset];
				 arr[last][last-offset] = arr[j][last];
				 arr[j][last] =top;
			 }	 
		 }
		 travels(4,arr);
		 return true;
	 } 
}
