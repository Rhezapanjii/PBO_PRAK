import java.util.Scanner;

public class W4_soal4 {
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		float gajipokok= 5000000;
		
		System.out.print("Jumlah Penjualan Bulan ini:");
		float jumlahjual= input.nextInt();
		
		float hargabarang = 50000;
		float bonuspersale = (jumlahjual *(hargabarang * 10/100));
		float bonus = 0;
		if(jumlahjual <= 15) {
			bonus = (jumlahjual - 15) *(hargabarang * 15/100);
			bonuspersale = 0;
		}
		else if (jumlahjual >= 40 && jumlahjual < 80 ) {
			bonus = (jumlahjual *(hargabarang * 25/100));
			}
		else if (jumlahjual > 80) {
		bonus = (jumlahjual *(hargabarang * 35/100));
		}
		
		float totalgaji = gajipokok + bonuspersale + bonus ;
		
		System.out.println("total gaji =" + totalgaji );
	
		
	
		
	}

}	