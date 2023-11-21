import java.util.Scanner;

public class Pin4digit {
	public static void main (String[]args) {
		String Pin = "1503";
		int maksimalpercobaan = 3;
		int percobaan = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (percobaan < maksimalpercobaan) {
			System.out.print("Masukkan PIN 4 digit: ");
			String inputPin = scanner.nextLine();
			
			if (inputPin.equals(Pin)){
				System.out.print("Pin yang telah anda masukkan benar.Akses diberikan");
				break;
				
			} else {
				percobaan++;
				System.out.println("Pin yang telah Anda masukkan salah. Sisa kesempatan:" +(maksimalpercobaan-percobaan));
			}
		}
		
		if(percobaan>=maksimalpercobaan){
			System.out.println("Anda telah melebihi batas maksimal kesempatan.Akses ditolak:");
		}
	}
}			