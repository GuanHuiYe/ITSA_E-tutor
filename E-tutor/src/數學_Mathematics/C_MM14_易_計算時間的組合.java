package 數學_Mathematics;
import java.util.Scanner;

public class C_MM14_易_計算時間的組合 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt(),day,hour,se,m;
		day=in/86400;
		hour=(in-(day*86400))/3600;
		se=(in-(day*86400)-(hour*3600))/60;
		m=in-(day*86400)-(hour*3600)-(se*60);
		System.out.println(day+" days\n"+hour+" hours\n"+se+" minutes\n"+m+" seconds");
	}

}
