public class PivotElement{
	public static void main(String[] args){
		// int[] inputArray = {4,3,9,5,1,-23,7,3,10,13,8,6,9,10,2,5,4,3,7};
		int[] inputArray = {1,2,3,4,5,6000,15};
		int pivot_ele = pivot(inputArray);
		if(pivot_ele == -1){
			System.out.println("There is no such element");
		}
		else{
			System.out.println("The index is " + pivot_ele + " and the element is " + inputArray[pivot_ele]);
		}
	}


	public static int pivot(int[] nums){
		int total_sum = 0;
	
		for(int x:nums){
			total_sum += x;
		}
	
		int left_sum = 0;
		for(int i=0;i<nums.length;i++){
			if(i!=0){
				left_sum += nums[i-1];
			} 
			
			if(total_sum-left_sum-nums[i] == left_sum) {
				return i;
			}
		}
		return -1;
	}	
}