package 其他_Other;

import java.io.*;
import java.util.*;

public class C_OT01_易_計算BMI值 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./Problem1_in_BMI.txt");
			FileWriter fw = new FileWriter("./Problem1_out_BMI.txt",true);
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				String[] input=br.readLine().split(" ");
				Double cm= Double.parseDouble(input[0]);
				Double kg= Double.parseDouble(input[1]);
				Double BMI=kg / Math.pow(cm/100.0,2);
				fw.write(BMI+"\n");
				if(BMI<18.5)
					fw.write("Underweight");
				else if(BMI<24)
					fw.write("Normal");
				else if(BMI<27)
					fw.write("Overweight");
				else if(BMI<30)
					fw.write("Obese Class I");
				else if(BMI<35)
					fw.write("Obese Class II");
				else 
					fw.write("Obese Class III");
			}
			fr.close();
			fw.flush();
			fw.close();
		} catch (Exception e) {

		}

	}

}
