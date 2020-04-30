package 陣列II_ArrayII;
import java.util.*;

public class C_AR72_易_電影票購買計算 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int nth=Integer.parseInt(sc.nextLine());nth>0;nth--) {
			String[] input=sc.nextLine().split(" ");
			System.out.println(Integer.parseInt(input[0])*250+Integer.parseInt(input[1])*175);
		}

	}

}
