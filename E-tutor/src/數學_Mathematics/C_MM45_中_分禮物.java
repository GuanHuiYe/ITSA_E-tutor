package 數學_Mathematics;

import java.util.*;

public class C_MM45_中_分禮物 {

	public static class MAN {
		public int no;
		public String Name;
		public String Ori_Gift;
		public String Gift;

		public MAN() {
			Name = "";
			Ori_Gift = "";
			Gift = "";
		}
	}

	public static Map<String, String> mans;

	public static ArrayList<String> ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = Integer.parseInt(sc.nextLine());
		mans = new HashMap();

		ans = new ArrayList<String>();

		int[] man_arr = new int[input];
		MAN[] manData = new MAN[input];
		for (int n = 0; n < input; n++) {
			MAN man_data = new MAN();
			String[] in = sc.nextLine().split(" ");
			man_data.Name = in[0];
			man_data.Ori_Gift = in[1];

			mans.put(in[0], in[1]);
			manData[n] = man_data;
			man_arr[n] = n;
		}
		arrange(man_arr, 0, man_arr.length);

		ArrayList<String> real_ans = new ArrayList<String>();
		for (String item : ans) {
			Boolean test = false;
			String[] target = item.split(" ");
			for (int n = 0; n < man_arr.length; n++) {
				if (Integer.parseInt(target[n]) == man_arr[n]) {
					test = true;
					break;
				}
			}
			if (!test) {
				String input_str = "";
				for (int n = 0; n < target.length; n++) {
					input_str += manData[n].Name + " " + manData[Integer.parseInt(target[n])].Ori_Gift;
					if (n != target.length - 1) {
						input_str += ",";
					}
				}
				real_ans.add(input_str);
			}
		}

		ArrayList<String> print_ans = new ArrayList<String>();
		for (String item : real_ans) {
			if (!print_ans.contains(item)) {
				print_ans.add(item);
			}
		}

		System.out.println(print_ans.size());
		for (String item : print_ans) {
			System.out.println(item);
		}

	}

	public static void swap(int[] str, int i, int j) {
		int temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	public static void arrange(int[] str, int st, int len) {
		if (st == len - 1) {
			String item = "";
			for (int i = 0; i < len; i++) {
				item += String.valueOf(str[i]);
				if (i < len - 1)
					item += " ";
			}
			ans.add(item);
		} else {
			for (int i = st; i < len; i++) {
				swap(str, st, i);
				arrange(str, st + 1, len);
				swap(str, st, i);
			}
		}

	}

}
