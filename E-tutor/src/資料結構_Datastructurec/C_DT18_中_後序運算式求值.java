package 資料結構_Datastructurec;

import java.util.*;

public class C_DT18_中_後序運算式求值 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		String[] input = sc.nextLine().split(" ");
		for (String item : input) {
			int a = 0;
			int b = 0;
			switch (item) {
			case "+":
				a = st.pop();
				b = st.pop();
				st.push(b + a);
				break;
			case "-":
				a = st.pop();
				b = st.pop();
				st.push(b - a);
				break;
			case "*":
				a = st.pop();
				b = st.pop();
				st.push(b * a);
				break;
			case "/":
				a = st.pop();
				b = st.pop();
				st.push(b / a);
				break;
			case "%":
				a = st.pop();
				b = st.pop();
				st.push(b % a);
				break;
			default:
				st.push(Integer.parseInt(item));
				break;
			}
		}
		System.out.println(st.pop());

	}

}
