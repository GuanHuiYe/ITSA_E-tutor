package �ƾ�_Mathematics;
import java.util.Scanner;

public class C_MM01_��_�p��諬���n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] a=sc.nextLine().split(" ");
		double top=Double.parseDouble(a[0]),min=Double.parseDouble(a[1]),h=Double.parseDouble(a[2]);
		System.out.println("Trapezoid area:"+((top+min)*h/2));
	}
}
