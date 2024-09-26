import java.util.Scanner;

public class PemilihanHariDenganIf04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka 1-7: ");
        int angka = sc.nextInt();

        if (angka > 0 && angka < 6 ) {
            System.out.println("Weekday");
        }
        else if (angka > 5 && angka < 8){
            System.out.println("Weekend");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
