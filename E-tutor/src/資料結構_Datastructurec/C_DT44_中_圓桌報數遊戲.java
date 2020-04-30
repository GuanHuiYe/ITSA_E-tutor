package 資料結構_Datastructurec;

import java.util.*;

public class C_DT44_中_圓桌報數遊戲 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		Queue<Integer> man = new LinkedList<Integer>();
		int num = Integer.parseInt(input[1]);
		while (man.size() < Integer.parseInt(input[0])) {
			man.offer(num);
			if (num + 1 > Integer.parseInt(input[0]))
				num = 1;
			else
				num++;
		}
		int count = 0;
		String ans = "";
		while (man.size() > 0) {
			int n = man.poll();
			if (++count == Integer.parseInt(input[2])) {
				ans += n + " ";
				count=0;
			}				
			else
				man.offer(n);
		}
		System.out.println(ans.substring(0, ans.length() - 1));

	}

}
