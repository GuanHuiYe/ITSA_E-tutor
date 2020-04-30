package 陣列_Array;

import java.util.*;

public class C_AR027_中_整數集合之交集與聯集 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		A.add(Integer.parseInt(sc.nextLine()));
		A.add(Integer.parseInt(sc.nextLine()));
		A.add(Integer.parseInt(sc.nextLine()));
		A.remove((Object)Integer.parseInt(sc.nextLine()));

		B.add(Integer.parseInt(sc.nextLine()));
		B.add(Integer.parseInt(sc.nextLine()));
		B.add(Integer.parseInt(sc.nextLine()));
		B.remove((Object)Integer.parseInt(sc.nextLine()));

		int[] temp = A.stream().mapToInt(i -> i).toArray();
		Arrays.sort(temp);
		for (int index = 0; index < temp.length; index++) {
			System.out.print(temp[index] + (index == temp.length - 1 ? "\n" : ","));
		}

		temp = B.stream().mapToInt(i -> i).toArray();
		Arrays.sort(temp);
		for (int index = 0; index < temp.length; index++) {
			System.out.print(temp[index] + (index == temp.length - 1 ? "\n" : ","));
		}

		Boolean test = true;
		for (int item : B) {
			if (!A.contains(item)) {
				test = false;
				break;
			}
		}
		System.out.println(test ? "T" : "F");

		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		for (int item : B) {
			if (A.contains(item)) {
				if (!tempArr.contains(item))
					tempArr.add(item);
			}
		}

		temp = tempArr.stream().mapToInt(i -> i).toArray();
		Arrays.sort(temp);
		for (int index = 0; index < temp.length; index++) {
			System.out.print(temp[index] + (index == temp.length - 1 ? "\n" : ","));
		}

		tempArr = new ArrayList<Integer>();
		for (int item : A) {
			if (!tempArr.contains(item))
				tempArr.add(item);
		}
		for (int item : B) {
			if (!tempArr.contains(item))
				tempArr.add(item);
		}

		temp = tempArr.stream().mapToInt(i -> i).toArray();
		Arrays.sort(temp);
		for (int index = 0; index < temp.length; index++) {
			System.out.print(temp[index] + (index == temp.length - 1 ? "\n" : ","));
		}

	}

}
