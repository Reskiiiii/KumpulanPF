import java.util.Scanner;

public class nilaiindeks1 {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.println("nilai huruf (A, B, C, D, atau E):");
        char nilaiHuruf= input.next().charAt(0);

        double nilaiIndeks;
        switch (nilaiHuruf) {
            case 'A':
                nilaiIndeks = 4.0;
                break;
            case 'B':
                nilaiIndeks = 3.0;
                break;
            case 'C':
                nilaiIndeks = 2.0;
                break;
            case 'D':
                nilaiIndeks = 1.0;
                break;
            case 'E':
                nilaiIndeks = 0;
            default:
                System.out.println("Maaf,konversi nilai tidak diketahui");
                return;
        }
        System.out.println("hasil konversi:" + nilaiIndeks);
	}
}