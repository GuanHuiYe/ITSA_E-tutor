package 陣列_Array;

import java.util.*;

public class C_AR026_中_選擇排序法動態展示 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (sc.hasNext()) {
			input += sc.nextLine() + "\n";
		}

		String[] str_arr = input.split("\n");

		for (int index = 0; index < str_arr.length; index++) {
			System.out.print(str_arr[index] + (index == str_arr.length - 1 ? "\n" : ","));
		}

		for (int nth = 0; nth < str_arr.length; nth++) {
			int max_num = Integer.parseInt(str_arr[nth]);
			int max_index = nth;
			for (int index = nth + 1; index < str_arr.length; index++) {
				if (max_num < Integer.parseInt(str_arr[index])) {
					max_num = Integer.parseInt(str_arr[index]);
					max_index = index;
				}
			}
			if (max_index != nth) {
				String temp = str_arr[nth];
				str_arr[nth] = str_arr[max_index];
				str_arr[max_index] = temp;
				for (int index = 0; index < str_arr.length; index++) {
					System.out.print(str_arr[index] + (index == str_arr.length - 1 ? "\n" : ","));
				}
			}

			if (max_index == nth) {
				Boolean test = false;
				for (int index = nth + 2; index < str_arr.length; index++) {
					for (int test_index = index + 1; test_index < str_arr.length; test_index++) {
						if (Integer.parseInt(str_arr[index]) < Integer.parseInt(str_arr[test_index])) {
							test = true;
							break;
						}
					}
					if(test)break;
				}
				if(!test)break;
			}
		}

	}

}
