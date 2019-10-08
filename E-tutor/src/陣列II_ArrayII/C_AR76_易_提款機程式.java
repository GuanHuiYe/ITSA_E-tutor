package 陣列II_ArrayII;
import java.util.*;

public class C_AR76_易_提款機程式 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[][] ans = new String[][] { { "123", "456", "9000" }, { "456", "789", "5000" }, { "789", "888", "6000" },
			{ "336", "558", "10000" }, { "775", "666", "12000" }, { "566", "221", "7000" } };
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			String[] input=sc.nextLine().split(" ");
			int index=-1;
			for(int y=0;y<ans.length;y++) {
				if(input[0].equals(ans[y][0])&&input[1].equals(ans[y][1])) {
					index=y;
					break;
				}
			}
			
				System.out.println(index==-1?"error":ans[index][2]);
		
		}

	}

}
