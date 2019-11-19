import java.util.ArrayList;
import java.util.List;

public class ArrayListRemovals{
	public static void main(String[] args){
		List<String> topComps = new ArrayList<>();
		
		topComps.add("Microsoft");
		topComps.add("Facebook");
		topComps.add("Amazon");
		topComps.add("Apple");
		topComps.add("Netflix");
		topComps.add("Google");
		
		System.out.println("Initial List " + topComps);
		
		System.out.println("Remove index 1 " + topComps.remove(1));
		System.out.println("List after removing index 1 " + topComps);
		
		System.out.println("Remove Netflix " + topComps.remove("Netflix"));
		
		System.out.println("List after removing Netflix " + topComps);
		
		System.out.println("Remove if " + topComps.removeIf(s -> s.startsWith("A")));
		
		System.out.println("List after removing ele with starting A " + topComps);
	}
}