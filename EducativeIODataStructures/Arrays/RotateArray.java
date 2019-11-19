import java.util.Arrays;

public class RotateArray{
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5};
		int[] result = rotateArray(nums);
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] rotateArray(int[] nums){
		int n = nums.length, lastElement = nums[n-k];
		
		for(int i=n-k;i>0;i--){
			nums[i] = nums[i-k];
		}
		nums[0] = lastElement;
		
		return nums;
	}
}