package 陣列_Array;
import java.util.*;
public class C_AR43_易_以遞迴函數計算冪次 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] input=sc.nextLine().split(" ");
			System.out.println(Math.round(Math.pow(Double.parseDouble(input[0]),Double.parseDouble(input[1]))));
		}
	}

}
