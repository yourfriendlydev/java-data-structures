import java.util.Collections;

class KthLargest{
	public static void main(String[] args){
		int[] nums = {3,2,1,5,6,4};
		int kth = findKthLargest(nums, 2);
		System.out.println(kth);
	}
	
	public static int findKthLargest(int[] nums, int k){
		int[] sortedNums = Collections.sort(nums, Collections.reverseOrder());
		
		return sortedNums[k];
	}
}