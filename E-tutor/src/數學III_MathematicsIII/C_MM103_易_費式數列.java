package �ƾ�III_MathematicsIII;
import java.util.*;

public class C_MM103_��_�O���ƦC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(FIB(Long.parseLong(sc.nextLine())));

	}
	public static long FIB(long index) {
		if(index==0||index==1)return index;
		return FIB(index-1)+FIB(index-2);
	}

}
