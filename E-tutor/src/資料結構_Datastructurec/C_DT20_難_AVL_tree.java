package 資料結構_Datastructurec;

import java.util.*;

public class C_DT20_難_AVL_tree {
	public static TreeMap<Integer, Integer> map;

	public static class Node {
		
		public Node head;
		public Node left;
		public int key;
		public String name;
		public Node right;

		public Node(int key, String name,Node head) {
			this.key = key;
			this.name = name;
			this.head=head;
			
		}

		public void add(int key, String name) {
			Boolean is_left = key < this.key;
			if (is_left) {
				if (left == null)
					left = new Node(key, name,this);
				else
					left.add(key, name);
			} else {
				if (right == null)
					right = new Node(key, name,this);
				else
					right.add(key, name);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, String> DATA = new TreeMap<Integer, String>();
		map = new TreeMap<Integer, Integer>();
		Node tree = null;
		while (true) {
			String[] input = sc.nextLine().split(" ");
			if (input[0].equals("-1"))
				break;
			if (tree == null)
				tree = new Node(Integer.parseInt(input[0]), input[1],null);
			else
				tree.add(Integer.parseInt(input[0]), input[1]);
			DATA.put(Integer.parseInt(input[0]), input[1]);
		}
		System.out.println("Node Key Name");		
		for(Map.Entry<Integer, Integer>item:map.entrySet()) {
			System.out.printf("%d %d %s\n", item.getKey(),item.getValue(),DATA.get(item.getValue()));
		}
	}

}
