package sorting;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayList[]={5,9,1,12,6,2};
		System.out.println("Final result are:"+Arrays.toString(BubbleSortAsceMethod(arrayList)));
	}
		 public static int[] BubbleSortAsceMethod(int[] arr){
		        int temp;
		        for(int i=0; i < arr.length-1; i++){
		 
		            for(int j=1; j < arr.length-i; j++){
		                if(arr[j-1] > arr[j]){
		                    temp=arr[j-1];
		                    arr[j-1] = arr[j];
		                    arr[j] = temp;	                    
		                }
	}
}
return arr;
}
	 }