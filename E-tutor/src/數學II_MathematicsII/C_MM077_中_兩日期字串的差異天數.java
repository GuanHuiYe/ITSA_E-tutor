package 數學II_MathematicsII;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class C_MM077_中_兩日期字串的差異天數 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d1 = df.parse(sc.nextLine());
			Date d2 = df.parse(sc.nextLine());
			long diff=0 ;
			if(d1.before(d2)) {
				diff= d2.getTime() - d1.getTime();
			}
			else {
				diff= d1.getTime() - d2.getTime();
			}
			
			System.out.println(diff/(1000*60*60*24));
		} catch (ParseException e) {
			
		}
		

	}

}
