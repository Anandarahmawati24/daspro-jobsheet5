import java.util.Scanner;
public class jobsheet5individu204{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Usernamesistem= "ananda24";
        String passwordsistem= "rahasia12";

        System.out.print(" Masukkan Userame:  ");
        String UsernameInput= input.nextLine();
        System.out.print(" Masukkan Password:  ");
        String passwordInput= input.nextLine();

        if (UsernameInput.equals(Usernamesistem) && passwordInput.equals(passwordsistem)){
            System.out.println(" Login anda berhasil, Selamat datang di Sistem!. ");
        } else {
            System.out.println(" Username dan password salah , Silahkan mencoba kembali.");
        }

    }
}