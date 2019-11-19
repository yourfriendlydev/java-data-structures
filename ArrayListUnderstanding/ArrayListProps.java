import java.util.ArrayList;
import java.util.List;

public class ArrayListProps{
	public static void main(String[] args){
		List<String> topComp = new ArrayList<>();
		
		topComp.add("Microsoft");
		topComp.add("Facebook");
		topComp.add("Amazon");
		topComp.add("Apple");
		topComp.add("Netflix");
		topComp.add("Google");
		
		System.out.println("Top Companies list " + topComp);
		System.out.println("Check list empty " + topComp.isEmpty());
		System.out.println("Size of the list " + topComp.size());
		System.out.println("Access company at index zero " + topComp.get(0));
		
		topComp.set(2, "Walmart");
		System.out.println("Set company at index 1 " + topComp);
	}
}