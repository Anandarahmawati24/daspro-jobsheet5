import java.util.Scanner;
public class jobsheet5individu104{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Jarakpertarungan;
        System.out.print(" Masukkan jarak pertarungan (dalam meter):  ");
        Jarakpertarungan= input.nextFloat();
        if ( Jarakpertarungan <= 5 ){
            System.out.println(" Gunakan Melee weapon untuk pertarungan ");
        }else if (Jarakpertarungan > 5 && Jarakpertarungan <= 1000) {
            System.out.println(" Gunakan Range weapon untuk pertarungan ");
        }else {
            System.out.println(" Jarak pertarungan di luar batasan range weapon ");
        }
    }
}