import java.util.ArrayList;
import java.util.Arrays;

public class ReArrangePosNeg{
	public static void main(String[] args){
		int[] arr = {10, -1, 20, 4, 5, -9, -6};
		System.out.println(Arrays.toString(rearrangeOther(arr)));
		// ArrayList<Integer> result = rearrange(arr);
		// System.out.println(result.toString());
	}
	
	public static ArrayList<Integer> rearrange(int[] arr){
		ArrayList<Integer> result = new ArrayList<Integer>();	
		ArrayList<Integer> negArr = new ArrayList<Integer>();
		ArrayList<Integer> zeroArr = new ArrayList<Integer>();
		ArrayList<Integer> posArr = new ArrayList<Integer>();
		
		for(int x: arr){
			if(x < 0) negArr.add(x);
			else if(x == 0) zeroArr.add(x);
			else posArr.add(x);
		}
		
		if(!negArr.isEmpty()) result.addAll(negArr);
		if(!zeroArr.isEmpty()) result.addAll(zeroArr);
		if(!posArr.isEmpty()) result.addAll(posArr);
		
		return result;
	}
	
	public static int[] rearrangeOther(int[] nums){
		int[] result = new int[nums.length];
		int idx = 0;
		
		for(int x:nums){
			if(x < 0) result[idx++] = x;
		}
		
		for(int x: nums){
			if(x == 0) result[idx++] = x;
		}
		
		for(int x:nums){
			if(x > 0) result[idx++] = x;
		}
		
		return result;
	}
}












