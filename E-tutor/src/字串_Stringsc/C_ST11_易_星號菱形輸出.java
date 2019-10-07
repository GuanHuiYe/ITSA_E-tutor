package 字串_Stringsc;
import java.util.*;

public class C_ST11_易_星號菱形輸出 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int height=Integer.parseInt(sc.nextLine());
		for(int nth=height,num=1;nth>0;nth--) {
			for(int space=(height-num+(height%2==0?-1:0))/2;space>0;space--) {
				System.out.print(" ");
			}
			for(int n=0;n<num;n++) {
				System.out.print("*");
			}
			System.out.println();
			if(nth-1<=height/2)num-=2;
			else num+=2;
		}

	}

}
