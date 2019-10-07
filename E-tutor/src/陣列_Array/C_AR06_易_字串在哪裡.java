package 陣列_Array;

import java.util.*;

public class C_AR06_易_字串在哪裡 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		if (input.length() > 10)
			System.out.println("Target Overflow");
		else {
			Boolean format_test = true;
			ArrayList<char[]> AL = new ArrayList<char[]>();
//			int nth=4;
			while (sc.hasNext()) {
				String input_Line = sc.nextLine();
				if (AL.size() == 20 || input_Line.length() > 20) {
					format_test = false;
					break;
				}

				AL.add(input_Line.toCharArray());
//				if(--nth<=0)break;
			}
			if (!format_test)
				System.out.println("Array Overflow");
			else {
				for (int y = 0; y < AL.size(); y++) {
					for (int x = 0; x < AL.get(y).length; x++) {
						char[] target = input.toCharArray();
						if (target[0] == AL.get(y)[x]) {
							// 左
							if (x - target.length+1  >= 0) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y)[x - n])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + y + ", " + (x - n));
									}
								}
							}
							// 左上
							if (x - target.length+1 >= 0 && y - target.length+1  >= 0) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y - n)[x - n])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + (y - n) + ", " + (x - n));
									}
								}
							}
							// 上
							if (y - target.length+1  >= 0) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y - n)[x])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + (y - n) + ", " + x);
									}
								}
							}
							// 右上
							if (x + target.length - 1 < AL.get(y).length && y - target.length+1  >= 0) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y - n)[x + n])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + (y - n) + ", " + (x + n));
									}
								}
							}
							// 右
							if (x + target.length - 1 < AL.get(y).length) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y)[x + n])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + y + ", " + (x + n));
									}
								}
							}
							// 右下
							if (x + target.length - 1 < AL.get(y).length && y + target.length - 1 < AL.size()) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y + n)[x + n])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + (y + n) + ", " + (x + n));
									}
								}
							}
							// 下
							if (y + target.length - 1 < AL.size()) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y + n)[x])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + (y + n) + ", " + x);
									}
								}
							}
							// 左下
							if (x - target.length+1  >= 0 && y + target.length - 1 < AL.size()) {
								for (int n = 1; n < target.length; n++) {
									if (target[n] != AL.get(y + n)[x - n])
										break;
									if (n == target.length - 1) {
										System.out.println(y + ", " + x + " To " + (y + n) + ", " + (x - n));
									}
								}
							}

						}
					}
				}
			}

		}

	}

}
