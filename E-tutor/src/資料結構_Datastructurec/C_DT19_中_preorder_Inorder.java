package 資料結構_Datastructurec;

import java.util.*;

public class C_DT19_中_preorder_Inorder {
	public static class tree {
		public int index;
		public tree left;
		public String value;
		public tree right;

		public tree(String[] arr, int index) {
			this.index = index;
			value = arr[index];
			if (index * 2 < arr.length && arr[index * 2] != null) {
				left = new tree(arr, index * 2);
			}
			if (index * 2 + 1 < arr.length && arr[index * 2 + 1] != null) {
				right = new tree(arr, index * 2 + 1);
			}
		}

		public String preorder() {
			String result=value;
			if(left!=null)result+=" "+left.preorder();
			if(right!=null)result+=" "+right.preorder();
			return result;
		}

		public String inorder() {
			String result="";
			if(left!=null)result+=left.inorder();
			result+=" "+value;
			if(right!=null)result+=right.inorder();
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, String> order = new TreeMap<Integer, String>();
		while (true) {
			String[] input = sc.nextLine().split(" ");
			if (input[0].equals("-1"))
				break;
			order.put(Integer.parseInt(input[0]), input[1]);
		}
		int size = order.lastKey();
		String[] tree_arr = new String[size + 1];
		for (Map.Entry<Integer, String> item : order.entrySet()) {
			tree_arr[item.getKey()] = item.getValue();
		}
		tree ans_tree = new tree(tree_arr, 1);
		System.out.println(ans_tree.inorder().substring(1));			
		System.out.println(ans_tree.preorder());
		
	}

}
