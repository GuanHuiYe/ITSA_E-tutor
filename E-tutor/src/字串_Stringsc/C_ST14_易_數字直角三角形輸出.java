package 字串_Stringsc;
import java.util.*;

public class C_ST14_易_數字直角三角形輸出 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int size=Integer.parseInt(sc.nextLine());
			for (int n = 1; n <= size; n++) {
				for (int space = size - n; space > 0; space--) {
					System.out.print(" ");
				}
				if(n%2==0) {
					for (int item = n; item >0; item--) {
						System.out.print(item);
					}	
				}
				else {
					for (int item = 1; item <= n; item++) {
						System.out.print(item);
					}
				}
				
				System.out.println();
			}
		}

	}

}
