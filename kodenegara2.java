import java.util.Scanner;
public class kodenegara2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputkan kode negara (2 huruf):");
        String kodeNegara = scanner.next().toUpperCase();

        String namaNegara;

        switch (kodeNegara) {
            case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "Tunisia";
                break;
            case "ID":
                namaNegara = "Indonesia";
                break;
            case "MM":
                namaNegara = "Myanmar";
                break;
            case "IN":
                namaNegara = "India";
                break;
            default:
                namaNegara = "Maaf, kode negara TIDAK DIKETAHUI";
                break;
        }

        System.out.println("kode yang anda Inputkan adalah : " +kodeNegara +" ,dengan negara " + namaNegara);

    }
}