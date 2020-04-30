package 陣列II_ArrayII;
import java.util.*;

public class C_AR57_易_刪除重複資料 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			char[] input=sc.nextLine().toCharArray();
			LinkedList<Character> list=new LinkedList<Character>();
			for(char item:input) {
				if(!list.contains(item))list.add(item);
			}
			System.out.println(input.length+" "+list.size());
		}

	}

}
