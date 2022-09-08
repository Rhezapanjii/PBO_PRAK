import java.util.Scanner;

public class W3_soal1 {

	public static void main(String[] args) {
		// memasukan kata
		Scanner input  = new Scanner(System.in);
		String Kata;
		String [] bagian;
		
		
		
		do {
			Kata= input.nextLine();
			bagian = Kata.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@| ");
			if(Kata.length() < 1) {
					System.out.println("Harap Masukan Kata!");	
		}
			System.out.println(bagian.length);
			 	
			for(int i = 0; i < bagian.length; i++) {
				System.out.println(bagian[i]);
	}
		}while(Kata.length() <= 1);
	}
}

		
