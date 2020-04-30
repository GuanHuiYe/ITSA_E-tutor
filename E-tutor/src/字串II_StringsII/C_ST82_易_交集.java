package 字串II_StringsII;

import java.util.*;

public class C_ST82_易_交集 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		String[] A = sc.nextLine().split(",");
		String[] B = sc.nextLine().split(",");
		for (int ai = 0; ai < A.length; ai++) {
			Boolean test = false;
			for (int bi = 0; bi < B.length; bi++) {
				if (A[ai].equals(B[bi])) {
					test = true;
					break;
				}
			}
			if (test && !al.contains(Integer.parseInt(A[ai])))
				al.add(Integer.parseInt(A[ai]));
		}
		if(al.size()!=0) {
			Object[] ans = al.toArray();
			Arrays.sort(ans);
			for (int index = 0; index < ans.length; index++) {
				System.out.print(ans[index] + (index < ans.length - 1 ? " " : "\n"));
			}
		}
		else
			System.out.println("null");
		
	}

}
