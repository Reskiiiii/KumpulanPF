import java.util.Scanner;

public class jumlahharga {
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		int harga[] = {2500, 3000, 4000, 5000, 6000};
		int item [] = new int [harga.length];
		System.out.println(" input jumlah barang belanja: ");
	
		for (int a=0; a<harga.length ; a++) {
			System.out.println("jumlah belanja item- " + a + " Rp " + harga[a] + ":" );
			item[a] = sc.nextInt();
		}
		System.out.println("Daftar belanja dan harga ");
		int total = 0;
		for (int a = 0; a < harga.length ; a++){
			total = harga[a] * item[a] ;
			System.out.println("Harga barang ke- " + a + " , " + harga[a] + " , " + item[a] + " item " +":" + total);
		}
		int totall = 0;
		for (int a = 0; a < harga.length ; a++){
			totall = totall + item[a];
		}
		int belanja = 0;
		for ( int a = 0; a < harga.length ; a++){
			belanja = belanja + harga[a] * item[a];
		}
		System.out.println("TOTAL ITEM BELANJA :" +totall);
		System.out.println("TOTAL BELANJA :" +belanja);
	}
}