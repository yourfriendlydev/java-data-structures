import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAll{
	public static void main(String[] args){
		List<Integer> firstList = new ArrayList<>();
		
		firstList.add(1);
		firstList.add(2);
		firstList.add(3);
		
		System.out.println("Printing first list " + firstList);
		
		List<Integer> secondList = new ArrayList<>();
		
		secondList.add(11);
		secondList.add(12);
		secondList.add(13);
		
		System.out.println("Printing second list " + secondList);
		
		firstList.addAll(secondList);
		
		System.out.println("Combined List " + firstList);
	}
}