package 字串_Stringsc;
import java.util.*;

public class C_ST15_易_數字矩形輸出 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int size=Integer.parseInt(sc.nextLine());
			for(int nth=1;nth<size;nth++) {
				for(int num=1;num<=nth;num++) {
					System.out.print(num);
				}
				for(int num=size;num>nth;num--) {
					System.out.print(num);
				}
				System.out.println();
			}
		}

	}

}
