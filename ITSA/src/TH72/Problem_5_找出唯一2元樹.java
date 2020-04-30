package TH72;

import java.util.*;

public class Problem_5_找出唯一2元樹 {

	public static class Node {
		public int value;
		public Node left;
		public Node right;

		Node(int target, String pre_order, String in_order) {
			value = target;
			pre_order = pre_order.substring(1);
			String[] in = in_order.split(Integer.toString(target));
			if (in.length > 0) {
				if (in[0].length() > 0) {
					String preL = pre_order.substring(0, in[0].length());
					if (preL.length() > 0) {
						left = new Node(Integer.parseInt(preL.substring(0, 1)), preL, in[0]);
					}

				}
				if (in.length > 1) {
					if (in[1].length() > 0) {
						String preR = pre_order.substring(in[0].length() == 0 ? 0 : in[0].length());
						if (preR.length() > 0) {
							right = new Node(Integer.parseInt(preR.substring(0, 1)), preR, in[1]);

						}

					}
				}

			}
		}

		public String post_order() {
			String result = "";
			if (left != null) {
				result += left.post_order();
			}
			if (right != null) {
				result += right.post_order();
			}
			result += Integer.toString(value);
			return result;
		}

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//前序式
		String pre_order = sc.nextLine();
		//後序式
		String in_order = sc.nextLine();
		
		Node ans = new Node(Integer.parseInt(pre_order.substring(0, 1)), pre_order, in_order);

		System.out.println(ans.post_order());
	}

}
