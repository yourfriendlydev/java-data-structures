import java.util.HashMap;

public class FindUnique{
	public static void main(String[] args){
		String s = "Krishna tej";
		int freq = findUnique(s);
		
	}
	
	public static int findUnique(String s){
		HashMap<Character, Integer> freqMap = new HashMap<Character,Integer>();
		char[] chars = s.toCharArray();
		
		for(int i=0;i<s.length;i++){
			char c = s.charAt(i);
			freqMap.put(c, freqMap.getOrDefault(c,0)+1);
		}
		
		for(int i=0;i<s.length;i++){
			if(freqMap.get(s.charAt(i))==1){
				return i;
			}
		}
		
		
		return -1;
	}
}