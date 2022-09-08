import java.util.Scanner;
public class W3_Soal3 {
	
	public static void main	(String[] args) {
		
	Scanner input = new Scanner (System.in);
	String str = input.nextLine();
	String[] bagian = str.split(" ");
	
	int nilai1 = Integer.parseInt(bagian[0]);	
	int nilai2 = Integer.parseInt(bagian[2]);
	int result = 0;
	
	if(( nilai1 >= 1 && nilai1 <= 100) &&(nilai2 >= 1 && nilai2 >= 100));{
		if(bagian[1].equals("+")) {
			result = nilai1 + nilai2;
		}
	else if (bagian[1].equals("-")) {
			result = nilai1 - nilai2;
	}
	else if (bagian[1].equals("*")) {
			result = nilai1 * nilai2;
	}
	else if	(bagian[1].equals("/")) {
		result = nilai1 /nilai2;
	}
	
	else if(bagian[1].equals("%")) {
		result = nilai1 % nilai2;
	}else {
		
	}
			}
	System.out.print("HASIL = "+ result);
	}
	
	}
		
	