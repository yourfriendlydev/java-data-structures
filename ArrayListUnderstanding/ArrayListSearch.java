import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch{
	public static void main(String[] args){
		List<String> names = new ArrayList<>();
		
		names.add("Krishna");
		names.add("Tej");
		names.add("Ch");
		names.add("Chinnu");
		names.add("Madhavi");
		names.add("Ravi");
		names.add("Ch");
		names.add("Chinnu");
		
		System.out.println("Array List " + names);
		
		System.out.println("Does list contain \"Krishna\"?" + names.contains("Krishna"));
		
		System.out.println("Index of \"Ch\"" + names.indexOf("Ch"));
		
		System.out.println("Last index of \"Chinnu\"" + names.lastIndexOf("Chinnu"));
			
	}
}