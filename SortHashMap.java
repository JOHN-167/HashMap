import java.util.*;
import java.util.Collections;

public class SortHashMap {

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
		scan.close();
		//Returns words sorted in order of frequency
		List<Integer> freq = new LinkedList<>(map.values());
		Collections.sort(freq);
		while (freq.size() > 0){
			String delete = "";
			for (String key : map.keySet()){
				int num = freq.get(freq.size()-1);
				if (map.get(key) == num){
					System.out.println(key + " at freq = " + num);
					delete = key;
					break;
				}
			}
			map.remove(delete);
			freq.remove(freq.size()-1);
		}
	}
}
