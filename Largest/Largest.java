import java.util.Arrays;
import java.util.List;

public class Largest{
	public static void main(String[] args){
		int[] inputArray = {1,2,3,4,5,6000,15};
		int dom_index = dominantIndex(inputArray);
		
		if(dom_index == -1) System.out.println("No dominant index is found");
		// else System.out.println("The dominant index is " + dom_index + " and element is " + inputArray[dom_index]);
		else System.out.println(dom_index);
	}
	
	
	public static int dominantIndex(int[] nums){
		int max = Arrays.stream(nums).max().getAsInt();

		int idx = 0;
		
		int 
		for(int x:nums){
			if((x != max) && (x > (max/2))){				
				return -1;
			} 
		}
		
		for(int x:nums){
			if(x == (max)){
				return idx;
			} 
			idx++;
		}
		return 0;
	}
}