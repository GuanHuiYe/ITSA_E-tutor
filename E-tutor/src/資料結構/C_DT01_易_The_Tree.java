package 資料結構;

import java.util.*;

public class C_DT01_易_The_Tree {

	//運算
	public static Double operation(String item) {
		Double ans = 0.0;

		switch (aimsSymbol.indexOf(item)) {
		case -1:
			ans = Double.parseDouble(item);
			break;
		case 0:
			ans = operation((String) Tree.poll()) + operation((String) Tree.poll());
			break;
		case 1:
			ans = operation((String) Tree.poll()) - operation((String) Tree.poll());
			break;
		case 2:
			double a = operation((String) Tree.poll());
			double b = operation((String) Tree.poll());
			ans = a * b;
			break;
		case 3:
			ans = operation((String) Tree.poll()) / operation((String) Tree.poll());
			break;
		}

		return ans;
	}

	//搜尋替換的值
	public static String searchAims(LinkedList<String[]> aims, String value) {
		for (String[] item : aims) {
			if (item[0].equals(value)) {
				return item[2];
			}
		}
		return "-1";
	}

	//要被無視的值
	public static String notAims = "()";
	//運算的值
	public static String aimsSymbol = "+-*/";

	//用來存資料的
	public static Queue<String> Tree = new LinkedList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tree = new LinkedList<String>();

		LinkedList<String[]> aims = new LinkedList<String[]>();

		String[] inputOperation = sc.nextLine().split(" ");

		while (sc.hasNext()) {		
			aims.add(sc.nextLine().split(" "));
		}

		for (String item : inputOperation) {
			if (notAims.indexOf(item) == -1) {
				String value = searchAims(aims, item);
				if (!value.equals("-1")) {
					Tree.offer(value);
					continue;
				}
				Tree.offer(item);
			}
		}

		Double ans=operation(Tree.poll());
		
		if((ans*10)%10==0) {
			System.out.println(ans.intValue());
		}
		else {
			System.out.println(ans);
		}
		

	}

}
