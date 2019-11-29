package 數學III_MathematicsIII;

import java.util.*;

public class C_MM104_易_約瑟夫問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		Queue<Integer> q = new LinkedList<Integer>();
		for (int n = 0; n <= 99; n++) {
			q.offer(n);
		}
		int count = 0;
		while (q.size() > 1) {
			int n = q.poll();
			if (++count == num) {
				count = 0;
				continue;
			}
			q.offer(n);
		}
		System.out.println(q.poll());

	}

}
