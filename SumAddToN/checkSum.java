import java.util.Arrays;
import java.util.stream.IntStream;

class checkSum
{   
  public static int[] findSum(int[] arr, int n) 
  {
    int[] result = new int[2];
	
	for(int x: arr){
		if(x < n){
			int reminder = n - x;
			if(IntStream.of(arr).anyMatch(i -> i == reminder)){
				result[0] = x;
				result[1] = reminder;
			}
		}
	}
    return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
  }
  
  public static void main(String[] args){
	  int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
	  int value = 27;
	  
	  int[] finalSet = findSum(arr, value);
	  for(int x: finalSet){
		  System.out.println(x);
	  }
  }
}