import java.util.Scanner;

public class jumlahdata {
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		System.out.print("Jumlah data : ");
		
		int jumdat = in.nextInt();
		int [] data = new int [jumdat];
		System.out.println("inputkan data berikut: " );
		
		for(int a = 0; a < jumdat ; a++){
			System.out.print("Data ke- " + a + ": ");
			data[a] = in.nextInt();
		}
		System.out.println(" Menampilkan data : ");
		
		for (int a = 0; a < jumdat ; a++){
			if(data[a] % 2 == 0 ) {
				System.out.println(data[a] + " --> Genap");
			} else {
				System.out.println(data[a] + " --> Ganjil");
			}
		}
		
		int total = 0;
		for (int a = 0; a < jumdat; a++){
			total = total + data[a];
		}
		System.out.println("Total penjumlahan : " +total);
		double ratarata = total/jumdat;
		System.out.println("Rata-rata :" +ratarata);
	}
}