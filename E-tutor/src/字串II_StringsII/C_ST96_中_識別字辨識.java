package 字串II_StringsII;
import java.util.*;

public class C_ST96_中_識別字辨識 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> al=new ArrayList<Character>();
		for(char c='a';c<='z';c++) {
			al.add(c);
		}
		for(char c='A';c<='Z';c++) {
			al.add(c);
		}
		for(char c='0';c<='9';c++) {
			al.add(c);
		}
		al.add('_');
		while(sc.hasNext()) {
			char[] input=sc.nextLine().toCharArray();
			Boolean test=true;
			if(Character.isDigit(input[0])) 
				test=false;			
			else {
				for(char item:input) {
					if(!al.contains(item)) {
						test=false;
						break;
					}
				}
			}
			System.out.println((test?"":"il")+"legal");
		}

	}

}
