import java.util.Scanner;

public class PemilihanBilanga04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hasil;

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // if (angka % 2 == 0) {
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");
        // }
        // else {
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        hasil = (angka % 2 == 0) ? ("Angka " + angka + " termasuk bilangan genap") : ("Angka " + angka + " termasuk bilangan ganjil");
        System.out.println(hasil);
    }
}