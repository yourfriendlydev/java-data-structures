import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PlusOne{
	public static void main(String[] args){
		int[] someArray = {9};
		int[] finalArray = plusOne(someArray);
		for(int x:finalArray){
			System.out.println(x);
		}
	}
	
	public static int[] plusOne(int[] digits){
		for(int i=digits.length-1;i>=0;i--){
			if(digits[i] == 9){
				digits[i] = 0;
			}
			else{
				digits[i] = digits[i] + 1;
				break;
			}
		}
		
		if(digits[0] == 0){
			int[] newArr = Arrays.copyOf(digits,digits.length+1);
			newArr[0] = 1;
			return newArr;
		}
		
		return digits;
	}
}