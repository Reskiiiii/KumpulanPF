import java.util.Scanner;

public class kodenegara1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputkan kode negara (2 huruf): ");
        String kodeNegara = scanner.nextLine().toUpperCase();

        String namaNegara = "";

        if (kodeNegara.equals("ES")) {
            namaNegara = "Spain";
        } else if (kodeNegara.equals("TN")) {
            namaNegara = "Tunisia";
        } else if (kodeNegara.equals("ID")) {
            namaNegara = "Indonesia";
        } else if (kodeNegara.equals("MM")) {
            namaNegara = "Myanmar";
        } else if (kodeNegara.equals("IN")) {
            namaNegara = "India";
        } else {
            System.out.println("maaf, kode negara TIDAK DIKETAHUI");
            return;
        }

        System.out.println("Kode Negara :" + kodeNegara);
        System.out.println("Nama Negara :" + namaNegara);

    }
}