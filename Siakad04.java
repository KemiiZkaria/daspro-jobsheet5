import java.util.Scanner;

public class Siakad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas, nilaiHuruf = "", kualifikasi;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis  + nilaiTugas  + nilaiUjian )/3;

        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            kualifikasi = "Sangat Baik";
            nilaiHuruf = "A";
        }
        else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            kualifikasi = "Lebih dari Baik";
            nilaiHuruf = "B+";
        }
        else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            kualifikasi = "Baik";
            nilaiHuruf = "B";
        }
        else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            kualifikasi = "Lebih dari Cukup";
            nilaiHuruf = "C+";
        }
        else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            kualifikasi = "Cukup";
            nilaiHuruf = "C";
        }
        else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            kualifikasi = "Kurang";
            nilaiHuruf = "D";
        }
        else {
            kualifikasi = "Gagal";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")" +  " kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
