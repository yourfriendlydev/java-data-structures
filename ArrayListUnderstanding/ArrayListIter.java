import java.util.ArrayList;
import java.util.List;
// import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIter{
	public static void main(String[] args){
		// List<String> tvShows = new ArrayList<>(Arrays.asList("Breaking Bad", "Friends", "Lucifer", "Suits", "Jack Rayn"));
		
		List<String> tvShows = new ArrayList<>();
		
		tvShows.add("Breaking Bad");
		tvShows.add("Game Of Thrones");
		tvShows.add("Friends");
		tvShows.add("Prison break");
		
		System.out.println(tvShows);
		
		System.out.println("======For each with lambda======");
		tvShows.forEach(tvShow -> System.out.println(tvShow));
		
		Iterator<String> tvShowIterator = tvShows.iterator();

		System.out.println("\n======Iterator with hasnext======");
		while(tvShowIterator.hasNext()){
			String tvShow = tvShowIterator.next();
			System.out.println(tvShow);
		}
		
		System.out.println("\n======Iterator with forEachRemaining======");
		tvShowIterator = tvShows.iterator();
		tvShowIterator.forEachRemaining(tvShow -> System.out.println(tvShow));
		
		System.out.println("\n======List Iterator======");
		ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
		
		System.out.println("\n=====List Iterator with hasPrevious=====");
		while(tvShowListIterator.hasPrevious()){
			String tvShow = tvShowListIterator.previous();
			System.out.println(tvShow);
		}
		
		
		System.out.println("\n=====Simple for loop=====");
		for(String tvShow: tvShows){
			System.out.println(tvShow);
		}
		
		System.out.println("\n=====Looping through index=====");
		for(int i=0; i<tvShows.size(); i++){
			System.out.println(tvShows.get(i));
		}
		
		
	}
}