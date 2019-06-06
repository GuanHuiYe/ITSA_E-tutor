package 綜合_Comprehensive;
import java.util.Scanner;

public class C_CH02_易_OnlineGame選擇性別 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		if(in.equals("E")) {
			System.out.println("ByeBye");
		}
		if(in.equals("M")) {
			System.out.println("Male");
		}
		if(in.equals("F")) {
			System.out.println("Female");
		}
		
	}

}
