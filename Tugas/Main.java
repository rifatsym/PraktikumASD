package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AntrianKRS antrian = new AntrianKRS();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil 2 Antrian untuk Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Jumlah Antrian");
            System.out.println("10. Jumlah Sudah Proses KRS");
            System.out.println("11. Jumlah Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nama, nim, prodi);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue2();
                    break;
                case 3:
                    antrian.printAll();
                    break;
                case 4:
                    antrian.printFront2();
                    break;
                case 5:
                    antrian.printRear();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 7:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian tidak penuh.");
                    break;
                case 8:
                    antrian.clear();
                    System.out.println("Antrian dikosongkan.");
                    break;
                case 9:
                    System.out.println("Jumlah antrian: " + antrian.count());
                    break;
                case 10:
                    System.out.println("Jumlah sudah proses KRS: " + antrian.countProses());
                    break;
                case 11:
                    System.out.println("Jumlah belum proses KRS: " + antrian.countBelumProses());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}

