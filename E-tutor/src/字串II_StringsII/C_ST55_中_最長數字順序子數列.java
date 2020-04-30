package 字串II_StringsII;

import java.util.*;

public class C_ST55_中_最長數字順序子數列 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();
			String input = sc.nextLine();
			for (int Sindex = 0; Sindex < input.length(); Sindex++) {
				for (int Eindex = Sindex + 2; Eindex <= input.length(); Eindex++) {
					String item = input.substring(Sindex, Eindex);
					if (map.containsKey(item)) {
						map.put(item, map.get(item) + 1);
					} else {
						map.put(item, 0);
					}
				}
			}
			ArrayList<String> al = new ArrayList<String>();
			int MaxLength = 0;
			for (Map.Entry<String, Integer> item : map.entrySet()) {
				if (item.getValue() >= 1) {
					String str = item.getKey();
					if (str.length() > MaxLength) {
						MaxLength = str.length();
						al.clear();
					}
					al.add(str);
				}
			}
			Object[] strArr = al.toArray();
			Arrays.sort(strArr);
			System.out.println(strArr[0]);

		}

	}

}
