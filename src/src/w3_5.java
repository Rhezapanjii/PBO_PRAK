package src;
import java.util.Scanner;
public class w3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					Scanner obj = new Scanner(System.in);
					String str = obj.nextLine();
					
					String[] Part = str.split(" ");
					String value = "";
					
					for(int i=0; i<Part.length; i++) {
						value += Part[i];
					}

					System.out.println(value);
					Long result = Long.valueOf(value);
					
					if(((result-999999)%5) != 0) {
						System.out.println("Berhenti");
					}
					else {
						System.out.println("Jalan");
					}
				}

	

}

