package 字串II_StringsII;
import java.util.*;

public class C_ST91_易_英文斷詞 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al =new ArrayList<String>();
		String[] input=sc.nextLine().split(" ");
		for(String item:input) {
			if(!al.contains(item))al.add(item.toLowerCase());
		}
		for(int index=0;index<al.size();index++) {
			System.out.print(al.get(index)+(index<al.size()-1?" ":"\n"));
		}

	}

}
