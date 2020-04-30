package 字串_Stringsc;
import java.util.*;

public class C_ST01_易_數制轉換 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()) {
		String[] input=sc.nextLine().split(" ");
		System.out.printf("%S\n",Long.toString(Long.parseLong(input[1]), Integer.parseInt(input[0])));
		}
	}

}
