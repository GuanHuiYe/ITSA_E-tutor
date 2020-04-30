package 陣列_Array;

import java.util.*;

public class C_AR12_易_遊樂園的摩天輪 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			int L = Integer.parseInt(input[0]);
			int R = Integer.parseInt(input[1]);
			int count=Integer.parseInt(input[2]);
			LinkedList<Integer> box = new LinkedList<Integer>();
			for (int n = 1; n <= count; n++) {
				box.addLast(n);
			}
			LinkedList<Integer> leave=new LinkedList<Integer>();
			Boolean LR = true;
			
			while (true) {
				if(leave.size()==count-1) {
					for(int item:leave) {
						box.remove((Object)item);
					}
					System.out.println(box.getFirst());
					break;
				}
				if (LR) {
					for (int n = 0; n < R; n++) {
						box.addLast(box.getFirst());
						box.removeFirst();
						if(leave.contains(box.getFirst())) {
							n--;
							continue;
						}
					}
				} else {
					for (int n = 0; n < L; n++) {
						box.addFirst(box.getLast());
						box.removeLast();
						if(leave.contains(box.getFirst())) {
							n--;
							continue;
						}
					}
				}
				LR = !LR;
				leave.add(box.getFirst());
			}

		}

	}

}
