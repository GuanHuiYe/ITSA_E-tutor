package �r��_Stringsc;

import java.util.*;

public class C_ST27_��_�ߤ@������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		LinkedList<Integer> numList = new LinkedList<Integer>();
		String[] input = sc.nextLine().split(" ");
		String ans = "";
		for (int index = 0; index < size; index++) {
			int num = Integer.parseInt(input[index]);
			if (!numList.contains(num)) {
				ans += input[index] + " ";
				numList.add(num);
			}

		}
		System.out.println(ans.substring(0,ans.length()-1));

	}

}
