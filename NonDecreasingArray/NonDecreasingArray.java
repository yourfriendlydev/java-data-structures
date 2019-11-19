public class NonDecreasingArray{
	public static void main(String[] args){
		// int[] inputArray = {17,19,23,27,28,24,37};
		// int[] inputArray = {4,2,3};
		int[] inputArray = {2,3,3,4,2};
		if((checkPossibility(inputArray))){
			System.out.println("Sorted array");
		}
		else{
			System.out.println("Unsorted Array");
		}
	}
	
	public static boolean checkPossibility(int[] nums){
		// Condition 1: If length of the array is 0 or 1, then it is already sorted
		if(nums.length == 0 || nums.length == 1){
			return true;
		}
		// Condition 2: Check if the array is already sorted
		else if(sortedArray(nums)){
			return true;
		}
		// Condition 3: Special case where the first element is greater, swap it and check if it is sorted
		else if(nums[0] > nums[1]){
			nums[0] = nums[1];
			return sortedArray(nums);
		}
		// Else, where the differnce occurs, check the value of i-1 index if greater than i+1 index, replace the i+1 index with ith index.
		// Else, replace the current index with i+1 index
		else{
			for(int i=0;i<nums.length-1;i++){
				if(nums[i] > nums[i+1]){
					if(nums[i-1] > nums[i+1]){
						nums[i+1] = nums[i];
					}
					else{
						nums[i] = nums[i+1];
					}
					break;
				}
			}
			return sortedArray(nums);
		}
	}
	public static boolean sortedArray(int[] nums){
		for(int i=0;i<nums.length - 1;i++){
			if(nums[i] > nums[i+1]){
				return false;
			}
		}
		return true;
	}
}