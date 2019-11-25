package 字串_Stringsc;
import java.util.*;

public class C_ST45_易_名字反了 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			char[] Name=sc.nextLine().toLowerCase().toCharArray();
			System.out.print(String.valueOf(Name[Name.length-1]).toUpperCase());
			for(int index=Name.length-2;index>=0;index--) {
				System.out.print(Name[index]);
			}
			System.out.println();
		}

	}

}
