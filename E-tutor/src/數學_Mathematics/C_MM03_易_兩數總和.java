package �ƾ�_Mathematics;
import java.util.Scanner;
public class C_MM03_��_����`�M {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			String[] a=sc.nextLine().split(" ");
			if(a[0]==null) {break;}
			else {
				int b=Integer.parseInt(a[0]),c=Integer.parseInt(a[1]);
				System.out.println((int)b+c);
			}
		}
	}

}
