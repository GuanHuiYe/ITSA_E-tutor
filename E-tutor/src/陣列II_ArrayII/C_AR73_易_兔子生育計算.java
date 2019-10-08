package 陣列II_ArrayII;
import java.util.*;

public class C_AR73_易_兔子生育計算 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ans=new int[30];
		ans[0]=1;
		ans[1]=1;
		for(int index=2;index<ans.length;index++) {
			ans[index]=ans[index-1]+ans[index-2];
		}
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			int count=Integer.parseInt(sc.nextLine());
			for(int index=0;index<count;index++) {
				System.out.print(ans[index]+(index==count-1?"\n":" "));
			}
		}

	}

}
