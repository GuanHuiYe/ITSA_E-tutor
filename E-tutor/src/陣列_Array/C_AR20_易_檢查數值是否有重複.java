package 陣列_Array;
import java.util.*;
public class C_AR20_易_檢查數值是否有重複 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		int[] count=new int[129];
		for(int n=0;n<129;n++) {
			count[n]=0;
		}
		String[] input=sc.nextLine().split(" ");
		for(String item:input) {
			count[Integer.parseInt(item)]++;
		}
		Boolean test=true;
		for(int item:count) {
			if(item>1) {
				test=false;
			}
		}
		System.out.println(test?"1":"0");
	}

}
