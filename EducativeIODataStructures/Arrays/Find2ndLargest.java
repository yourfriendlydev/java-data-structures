class Find2ndLargest{
	public static void main(String[] args){
		int[] nums = {4,2,1,5,0};
		int secondMax = secondLargest(nums);
		System.out.println(secondMax);
	}
	
	public static int secondLargest(int[] nums){
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		
		for(int x: nums){
			if(x > max){
				secondMax = max;
				max = x;
			}
		}
		return secondMax;
	}
}