package �}�C_Array;
import java.util.*;
public class C_AR41_��_�@��ƧǦC�ҧt����ƭӼƤΥ����� {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
while(sc.hasNext()) {
	String[] input=sc.nextLine().split(" ");
	System.out.println("Size: "+input.length);
	Double sum=0.0;
	for(String item:input) {
		sum+=Double.parseDouble(item);
	}
	System.out.printf("Average: %.3f\n",sum/(double)input.length);
}
	}

}
