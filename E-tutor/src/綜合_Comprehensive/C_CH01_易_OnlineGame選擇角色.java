package 綜合_Comprehensive;
import java.util.Scanner;

public class C_CH01_易_OnlineGame選擇角色 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		switch (in) {
		case 1:
			System.out.println("Person");
			break;
		case 2:
			System.out.println("Fairy");
			break;
		case 3:
			System.out.println("Dwarf");
			break;
		}
	}

}
