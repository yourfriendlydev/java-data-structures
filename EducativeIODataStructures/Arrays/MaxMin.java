import java.util.Arrays;

class MaxMin{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arrangeToMaxMin(arr)));
	}
	
	public static int[] arrangeToMaxMin(int[] arr){
		int n = arr.length, smallPointer = 0, largePointer = n - 1;
		int[] result = new int[n];
		boolean switchPointer = true;
	
		for(int i = 0; i < n; i++){
			if(switchPointer) result[i] = arr[largePointer--];
			else result[i] = arr[smallPointer++];
			
			switchPointer = !switchPointer;
		}
		
		return result;
	}
}