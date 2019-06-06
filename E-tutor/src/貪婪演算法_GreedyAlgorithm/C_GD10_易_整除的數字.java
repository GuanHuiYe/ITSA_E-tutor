package 貪婪演算法_GreedyAlgorithm;
import java.util.*;

public class C_GD10_易_整除的數字 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=0;
		boolean test=false;
		for (int n1 = 0; n1 < 10; n1++) {
			for (int n2 = 0; n2 < 10; n2++) {
				if (n2 == n1) {
					continue;
				}
				for (int n3 = 0; n3 < 10; n3++) {
					if (n3 == n2 || n3 == n1) {
						continue;
					}
					for (int n4 = 0; n4 < 10; n4++) {
						if (n4 == n3 || n4 == n2 || n4 == n1) {
							continue;
						}
						for (int n5 = 0; n5 < 10; n5++) {
							if (n5 == n4 || n5 == n3 || n5 == n2 || n5 == n1) {
								continue;
							}
							a=n1*10000+n2*1000+n3*100+n4*10+n5;
							for (int i1 = 0; i1 < 10; i1++) {
								if (i1==n5||i1 == n4 || i1 == n3 || i1 == n2 || i1 == n1) {
									continue;
								}
								for (int i2 = 0; i2 < 10; i2++) {
									if (i2==i1||i2==n5||i2 == n4 || i2 == n3 || i2 == n2 || i2 == n1) {
										continue;
									}
									for (int i3 = 0; i3 < 10; i3++) {
										if (i3==i2||i3==i1||i3==n5||i3 == n4 || i3 == n3 || i3 == n2 || i3 == n1) {
											continue;
										}
										for (int i4 = 0; i4 < 10; i4++) {
											if (i4==i3||i4==i2||i4==i1||i4==n5||i4 == n4 || i4 == n3 || i4 == n2 || i4 == n1) {
												continue;
											}
											for (int i5 = 0; i5 < 10; i5++) {
												if (i5==i4||i5==i3||i5==i2||i5==i1||i5==n5||i5 == n4 || i5 == n3 || i5 == n2 || i5 == n1) {
													continue;
												}
												b=i1*10000+i2*1000+i3*100+i4*10+i5;
												if(a/b==n&&a%b==0) {
													test=true;
													System.out.printf("%05d / %05d = %d\n",a,b,n);													
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if(!test) {
			System.out.println("No solutions for "+n+".");
		}
	}

}
