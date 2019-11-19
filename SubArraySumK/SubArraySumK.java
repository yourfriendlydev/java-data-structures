public class SubArraySumK{
	public static void main(String[] args){
		// int[] inputArray = {1,4,20,10,3,5};
		int[] inputArray = {1,4,0,0, 3,10,5};
		int sum = 15;
		int[] idxs = subarraySum(inputArray, sum);
		for(int x: idxs){
			System.out.println(x);
		}
		
	}
	public static int[] subarraySum(int[] nums, int k){
		int[] idxs = {-1, -1};
		int curr_sum = nums[0], start = 0;
		// int curr_sum = 0, start = 0;
		
		for(int i=1;i<nums.length;i++){
			while(curr_sum > k && start < i-1){
				curr_sum -= nums[start];
				start++;
			}
			
			if(curr_sum == k){
				System.out.println("The sum is equal");
				idxs[0] = start;
				idxs[1] = i-1;
				return idxs;
			}
			if(i<nums.length){
				curr_sum += nums[i];
			}
		}
		return idxs;
	}
}