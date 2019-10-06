package 字串_Stringsc;
import java.util.*;

public class C_ST09_易_星號矩形輸出 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] input=sc.nextLine().split(" ");
		for(int y=0;y<Integer.parseInt(input[1]);y++) {
			for(int x=0;x<Integer.parseInt(input[0]);x++) {
			System.out.print("*");	
			}
			System.out.println();
		}

	}

}
