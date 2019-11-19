import java.util.Arrays;

public class FindProduct{
	public static void main(String[] args){
		int[] nums = {1,-1};
		// int[] nums = {1,2,3,4};
		int[] result = findProdExceptSelf(nums);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] findProdExceptSelf(int[] nums){
		int prod = 1, zeroCount = 0;
		for(int x: nums){
			if(x == 0) zeroCount++;
			else prod *= x;
		}
		
		if(zeroCount == nums.length){
			Arrays.fill(nums,0);
		}
		else{
			for(int i=0;i<nums.length;i++){
				if(zeroCount == 0) nums[i] = prod/nums[i];
				else if(zeroCount == 1 && nums[i] == 0) nums[i] = prod;
				else nums[i] = 0;
				}
		}
		return nums;
	}
}