package 陣列_Array;
import java.util.*;
public class C_AR42_易_過半元素 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		while(sc.hasNext()) {
			String[] input=sc.nextLine().split(" ");
			TreeMap<String,Integer> search=new TreeMap<String,Integer>();
			for(String item:input) {
				if(search.containsKey(item)) {
					search.put(item, search.get(item).intValue()+1);
				}
				else search.put(item, 1);
			}
			String max_str="";
			int max_count=0;
			for(Map.Entry<String,Integer>item:search.entrySet() ) {
				if(item.getValue()>max_count) {
					max_str=item.getKey();
					max_count=item.getValue();
				}
			}
			System.out.println(max_count>(input.length/2)?max_str:"NO");
		}
	}

}
