package TH74;
import java.util.*;

public class Problem_3_最長平台 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
			sc.nextLine();
			String[] input=sc.nextLine().split(" ");
			for(String item:input) {
				if(tm.containsKey(Integer.parseInt(item))) {
					tm.put(Integer.parseInt(item), tm.get(Integer.parseInt(item)).intValue()+1);
				}
				else tm.put(Integer.parseInt(item), 1);
			}
			int ans=0;
			for(Map.Entry<Integer,Integer>item:tm.entrySet() ) {
				if(item.getValue()>ans) {					
					ans=item.getValue();
				}
			}
			System.out.println(ans);
		}

	}

}
