package 陣列II_ArrayII;
import java.util.*;

public class C_AR77_易_二維陣列反轉 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=Integer.parseInt(sc.nextLine());
		int col=Integer.parseInt(sc.nextLine());
		int num=row*col;
		for(int y=0;y<row;y++) {
			for(int x=0;x<col;x++) {
				System.out.print(num--+(x==col-1?"\n":" "));
			}
		}

	}

}
