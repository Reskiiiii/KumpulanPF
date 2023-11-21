import java.util.Scanner;

public class nilaiindeks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputkan nilai huruf: ");
        char nilaiHuruf = scanner.next().charAt(0);

        double nilaiIndeks;

        if (nilaiHuruf == 'A') {
            nilaiIndeks = 4.0;
        } else if (nilaiHuruf == 'B') {
            nilaiIndeks = 3.0;
        } else if (nilaiHuruf == 'C') {
            nilaiIndeks = 2.0;
        } else if (nilaiHuruf == 'D') {
            nilaiIndeks = 1.0;
        } else if (nilaiHuruf == 'E') {
            nilaiIndeks = 0;
        } else {
            System.out.println("maaf ,konversi nilai tidak diketahui");
            return;
        }

        System.out.println("Hasil konversi: " + nilaiIndeks);
    }
}