package Pertemuan12.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueAntrian antrian = new QueueAntrian();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n==== MENU ANTRIAN UNIT KEMAHASISWAAN ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Lihat Depan & Belakang");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Cek Antrian Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Hitung Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nama, nim);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilkanAntrian();
                    break;
                case 4:
                    antrian.lihatDepanBelakang();
                    break;
                case 5:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 6:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 7:
                    antrian.kosongkanAntrian();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.hitungAntrian());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}
