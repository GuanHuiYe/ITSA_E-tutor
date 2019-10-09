package 遞迴_Recursionc;

import java.util.*;

public class C_RU02_中_河內塔遊戲 {

	public static TreeMap<Integer, String> plate;

//解法參考 https://www.youtube.com/watch?v=2SUvWfNJSsM&t=612s
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		System.out.println("Number of Discs: " + size);
		System.out.println("***********************************\n" + "Initial State:");
		plate = new TreeMap<Integer, String>();
		for (int num = 1; num <= size; num++) {
			plate.put(num, "A");
		}
		print();
		for (int nth = 1; nth < Math.pow(2, size); nth++) {
			char[] step = String.format("%0" + size + "d", Integer.parseInt(Integer.toBinaryString(nth))).toCharArray();
			int index = -1;
			for (int n = step.length - 1; n >= 0; n--) {
				if (step[n] == '1') {
					index = size - n;
					break;
				}
			}
			Boolean test = true;
			switch (plate.get(index)) {
			case "A":
				for (int n = 1; n < index; n++) {
					if (plate.get(n).equals(size % 2 != 0 ? "C" : "B")) {
						test = false;
						break;
					}
				}
				if (size % 2 != 0)
					plate.put(index, test ? "C" : "B");
				else
					plate.put(index, test ? "B" : "C");

				break;
			case "B":
				for (int n = 1; n < index; n++) {
					if (plate.get(n).equals(size % 2 != 0 ? "A" : "C")) {
						test = false;
						break;
					}
				}
				if (size % 2 != 0)
					plate.put(index, test ? "A" : "C");
				else
					plate.put(index, test ? "C" : "A");

				break;
			case "C":
				for (int n = 1; n < index; n++) {
					if (plate.get(n).equals(size % 2 != 0 ? "B" : "A")) {
						test = false;
						break;
					}
				}
				if (size % 2 != 0)
					plate.put(index, test ? "B" : "A");
				else
					plate.put(index, test ? "A" : "B");

				break;
			}
			if (nth % 5 == 0 || nth == Math.pow(2, size) - 1) {
				System.out.println("***********************************");
				if (nth == Math.pow(2, size) - 1)
					System.out.println("Total Moved " + nth + " Times:");
				else
					System.out.println("After Moved " + nth + " Times:");

				print();
			}
		}
	}

	public static void print() {
		int aIndex = plate.size();
		int bIndex = plate.size();
		int cIndex = plate.size();
		int[] A = new int[plate.size()];
		int[] B = new int[plate.size()];
		int[] C = new int[plate.size()];
		for (Map.Entry<Integer, String> item : plate.entrySet()) {
			switch (item.getValue()) {
			case "A":
				A[--aIndex] = item.getKey();
				break;
			case "B":
				B[--bIndex] = item.getKey();
				break;
			case "C":
				C[--cIndex] = item.getKey();
				break;
			}
		}
		System.out.print("A: ");
		String ans = "";
		for (int index = 0; index < A.length; index++) {
			if (A[index] != 0)
				ans += A[index] + " ";
		}
		if (!ans.equals(""))
			System.out.print(ans.substring(0, ans.length() - 1));
		System.out.print("\nB: ");
		ans = "";
		for (int index = 0; index < B.length; index++) {
			if (B[index] != 0)
				ans += B[index] + " ";
		}
		if (!ans.equals(""))
			System.out.print(ans.substring(0, ans.length() - 1));
		System.out.print("\nC: ");
		ans = "";
		for (int index = 0; index < C.length; index++) {
			if (C[index] != 0)
				ans += C[index] + " ";
		}
		if (!ans.equals(""))
			System.out.print(ans.substring(0, ans.length() - 1));
		System.out.println();
	}

}
