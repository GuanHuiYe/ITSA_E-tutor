package 數學IV_MathematicsIV;
import java.util.*;
public class C_MM157_易_求費氏數列 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int size=Integer.parseInt(sc.nextLine());
			int f0=0,f1=1;
			System.out.print(f0+","+f1);
	
			while(--size>0) {
				int next=f0+f1;
				System.out.print(","+next);
				f0=f1;
				f1=next;
			}
			System.out.println();
		}
	}

}
