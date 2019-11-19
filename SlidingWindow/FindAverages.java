import java.util.Arrays;

class FindAverages{
	public static void main(String[] args){
		double[] result = FindAverages.findAverages(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 9);
		System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
	}
	
	public static double[] findAverages(int[] arr, int K){
		double[] result = new double[arr.length-K+1];
		double windowSum = 0;
		int windowStart = 0;
		
		for(int i=0;i<arr.length;i++){
			windowSum += arr[i];
			
			//'i' current index is greater than the current window index
			if(i >= K-1){ 
				result[windowStart] = windowSum/K;
				windowSum -= arr[windowStart];
				windowStart++;	
			}
		}
		return result;
	}
}

