package 陣列_Array;
import java.util.*;
public class C_AR41_易_一整數序列所含之整數個數及平均值 {

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
