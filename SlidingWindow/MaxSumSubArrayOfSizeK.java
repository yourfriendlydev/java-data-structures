import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Math;

class MaxSumSubArrayOfSizeK{
	public static void main(String[] args){
		int result = findMaxSubArray(new int[]{2, 1, 5, 1, 3, 2}, 3);
		System.out.println(result);
	}
	
	public static int findMaxSubArray(int[] arr, int K){
		int[] finalResult = new int[K];
		int windowSum = 0, windowStart = 0, maxIdx=0, maxSum = 0;

		for(int i=0;i<arr.length;i++){
			windowSum += arr[i];
			
			if(i>=K-1){
				maxSum = Math.max(maxSum, windowSum);
				windowSum -= arr[windowStart];
				windowStart++;
			}
		}
		return maxSum;
	}
}