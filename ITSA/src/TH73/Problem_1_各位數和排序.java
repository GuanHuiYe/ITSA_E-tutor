package TH73;

import java.util.*;

public class Problem_1_各位數和排序 {

	public static class item {
		public static String str;
		public static Long count;
		public static item nextItem;

		public void add(item it) {
			if (nextItem == null) {
				nextItem = new item();
				if (it.count > count) {
					nextItem = it;
				} else {
					nextItem.str = str;
					nextItem.count = count;
					str = it.str;
					count = it.count;
				}
			} else {				
				if (it.count > count) {
					nextItem.add(it);
				} else {
					item temp=new item();
					temp.str = str;
					temp.count = count;
					nextItem.add(temp);										
					str = it.str;
					count = it.count;
				}
			}
		}

		public void print() {
			System.out.print(str);
			if (nextItem != null) {
				System.out.print(" ");
				nextItem.print();
			} else {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] strArr = sc.nextLine().split(" ");
		item ans = new item();

		for (int n = 0; n < strArr.length; n++) {
			item it = new item();
			item.str = strArr[n];
			item.count = (long) 0;
			char[] charArr = strArr[n].toCharArray();
			for (char item : charArr) {
				it.count += Integer.parseInt(String.valueOf(item));
			}
			if (n == 0) {
				ans = it;
			} else {
				ans.add(it);
			}

		}

		ans.print();

	}

}
