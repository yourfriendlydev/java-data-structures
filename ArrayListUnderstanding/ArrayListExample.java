import java.util.ArrayList;
import java.util.List;

public class ArrayListExample{
	
	public static void main(String[] args){
	List<String> animals = new ArrayList<>();
	
	animals.add("Lion");
	animals.add("Tiger");
	
	System.out.println("Before index insertion");
	System.out.println(animals);
	
	animals.add(1, "Dog");
	System.out.println("After index insertion");
	System.out.println(animals);
}
	
}

