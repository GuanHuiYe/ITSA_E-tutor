package �}�C_Array;

import java.util.*;

public class C_AR39_��_�M�Ͳզ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sound = new String[] { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" ,"C", "C#", "D", "D#", "E", "F", "F#"};
	
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			char[] input = sc.nextLine().toCharArray();
			for (int index = 0; index < sound.length; index++) {
				if (String.valueOf(input[0]).equals(sound[index])) {

					System.out.println(sound[index] + " " + sound[index + (input.length>1 ?3:4)] + " " + sound[index + 7]);

					break;
				}
			}
		}
	}

}
