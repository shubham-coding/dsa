package frequency;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class frequency {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,6,7};
		
		Map<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
		List<Integer> list = new LinkedList<>();
	
	for(int i =0;i<arr.length;i++) {
		if(map.get(arr[i])!=null){
			Integer val = map.get(arr[i]);
			map.put(arr[i],++val);
		}else {
			map.put(arr[i],1);
		}
	}
	
	list= map.entrySet().stream()
	.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
	.map(e->e.getKey()).collect(Collectors.toList());
	
	System.out.println(list);
	
	}

}
