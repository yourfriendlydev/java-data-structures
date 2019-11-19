import java.lang.Math;

class MinSizeSubArraySum{
	public static void main(String[] args){
		int result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 });
		System.out.println("Smallest subarray length: " + result);
		    
		result = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
		System.out.println("Smallest subarray length: " + result);
		    
		result = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
		System.out.println("Smallest subarray length: " + result);
	}
	
	public static int findMinSubArray(int sum, int[] arr){
		int currSum = 0, windowStart = 0, minLength = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			currSum += arr[i];
			
			while(currSum >= sum){
				minLength = Math.min(minLength, i - windowStart +1);
				currSum -= arr[windowStart];
				windowStart++;
			}
		}
		
		return minLength == Integer.MAX_VALUE ? 0:minLength;
	}
}