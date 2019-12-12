package 數學IV_MathematicsIV;

import java.util.*;

public class C_MM189_易_身體質量指數_BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double m = sc.nextDouble();
		Double kg = sc.nextDouble();
		Double BMI = kg / Math.pow(m, 2);
		if (BMI >= 35)
			System.out.println("Obese Class 3");
		else if (BMI >= 30)
			System.out.println("Obese Class 2");
		else if (BMI >= 27)
			System.out.println("Obese Class 1");
		else if (BMI >= 24)
			System.out.println("Overweight");
		else if (BMI >= 18.5)
			System.out.println("Normal");
		else
			System.out.println("Underweight");
		
		System.out.printf("BMI=%.4f\n", BMI);
	}

}
