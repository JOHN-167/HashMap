import java.util.*;

public class Collections {

    public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	while(scan.hasNextLine()) {
	    String input = scan.nextLine();
	    if (map.containsKey(input)){
		int freq = map.get(input);
		map.remove(input);
		map.put(input,freq+1);
	    }
	    else
		map.put(input,1);
	}
	//Returns words sorted in order of frequency
	List<Integer> freq = new LinkedList<>();
	freq = map.values().clone();
	    Collections.sort(freq,Collections.reverseOrder());
	while (freq.length > 0){
	    for (String key : map.keySet()){
		if (map.get(key) == freq.get(0)){
		    System.out.println(key);
		    map.remove(key);
		    freq.remove(0);
	    }
	}
    }
}
