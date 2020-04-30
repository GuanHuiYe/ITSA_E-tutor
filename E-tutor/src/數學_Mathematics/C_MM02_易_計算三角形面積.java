package 數學_Mathematics;
import java.util.Scanner;
public class C_MM02_易_計算三角形面積 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] a=sc.nextLine().split(" ");
		double min=Double.parseDouble(a[0]),h=Double.parseDouble(a[1]);
		System.out.println(min*h/2);
	}
}
