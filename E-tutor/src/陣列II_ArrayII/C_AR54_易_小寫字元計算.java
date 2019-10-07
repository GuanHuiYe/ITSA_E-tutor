package 陣列II_ArrayII;
import java.util.*;
public class C_AR54_易_小寫字元計算 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<Character,Integer> TM=new TreeMap<Character,Integer>();
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			char[] input=sc.nextLine().toCharArray();
			if(TM.containsKey(input[0])) {
				TM.put(input[0],TM.get(input[0])+1);
			}
			else {
				TM.put(input[0],1);
			}
		}
		for(Map.Entry<Character, Integer> item:TM.entrySet()) {
			System.out.println(item.getKey()+" "+item.getValue());
		}
	}

}
