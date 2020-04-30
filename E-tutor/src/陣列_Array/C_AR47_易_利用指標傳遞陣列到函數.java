package 陣列_Array;
import java.util.*;
public class C_AR47_易_利用指標傳遞陣列到函數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		for(int index=input.length-1;index>=0;index--) {
			System.out.print(input[index]+(index==0?"\n":" "));
		}
	}

}
