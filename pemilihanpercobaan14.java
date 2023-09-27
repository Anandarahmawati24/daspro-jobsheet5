import java.util.Scanner;
public class PemilihanPercobaan104 {

    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input04.nextInt();
        String JenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " +angka+ " bilangan "  +JenisAngka);

    }
}