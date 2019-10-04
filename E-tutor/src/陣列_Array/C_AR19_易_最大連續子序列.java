package 陣列_Array;

import java.util.*;

public class C_AR19_易_最大連續子序列 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] input = sc.nextLine().split(" ");
		String target = "";
		for (String item : input) {
			target += item;
		}
		TreeMap<String, Integer> TM = new TreeMap<String, Integer>();
		for (int n = 0; n < input.length - 1; n++) {
			for (int nn = n + 2; nn <= input.length; nn++) {
				String getStr = target.substring(n, nn);
				if (TM.containsKey(getStr)) {
					TM.put(getStr, TM.get(getStr) + 1);
				} else
					TM.put(getStr, 1);
			}
		}
		TreeMap<String, Integer> ANS = new TreeMap<String, Integer>();
		
		for(Map.Entry<String,Integer>item : TM.entrySet()) {
			if(item.getValue()!=1)ANS.put(item.getKey(), item.getValue());
		}
		System.out.println(ANS.lastKey().length());
	}

}
