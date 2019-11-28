package 字串II_StringsII;
import java.util.*;

public class C_ST93_中_方位解碼 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			TreeMap<String,String> Decrypt=new TreeMap<String,String>();
		Decrypt.put("01", "East");
		Decrypt.put("11", "West");
		Decrypt.put("10", "South");
		Decrypt.put("00", "North");
		
		Decrypt.put("001", "30");
		Decrypt.put("110", "45");
		Decrypt.put("100", "60");
		Decrypt.put("010", "75");
		
		Decrypt.put("0100", "250");
		Decrypt.put("1100", "700");
		Decrypt.put("1010", "550");
		Decrypt.put("0110", "100");
		String input=sc.nextLine();
		System.out.println(Decrypt.get(input.substring(0,2))+
				" "+Decrypt.get(input.substring(2,5))+
				" Degrees "+
				Decrypt.get(input.substring(5))+
				" Miles");
			
		

	}

}
