package 數學_Mathematics;
import java.util.Scanner;

public class C_MM10_易_攝氏溫度轉華式溫度 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double in=sc.nextDouble();
		System.out.println(Math.round((in*9/5+32)*10.0)/10.0);
	}

}
