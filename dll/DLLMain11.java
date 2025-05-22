package dll;

import java.util.Scanner;
public class DLLMain11 {

    public static Mahasiswa11 inpMahasiswa11(Scanner scan) {
        System.out.print("NIM : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa11(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList11 list11 = new DoubleLinkedList11();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println();
            System.out.println("Menu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari mahasiswa berdasarkan NIM");
            System.out.println("7. Insert After");
            System.out.println("8. Add");
            System.out.println("9. Remove After");
            System.out.println("10. Remove");
            System.out.println("11. Get First");
            System.out.println("12. Get Last");
            System.out.println("13. Get Index");
            System.out.println("14. Size");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
            case 1 -> {
                Mahasiswa11 mhs = inpMahasiswa11(scan);
                list11.addFirst(mhs);
            }
            case 2 -> {
                Mahasiswa11 mhs = inpMahasiswa11(scan);
                list11.addLast(mhs);
            }
            case 3 -> list11.removeFirst();
            case 4 -> list11.removeLast();
            case 5 -> list11.print();
            // case 6 -> {
            //     System.out.println("Masukkan NIM yang dicari: ");
            //     String nim = scan.nextLine();
            //     Node11 found = list11.search(nim);
            //     if (found != null) {
            //         System.out.println("Data ditemukan: ");
            //         found.data.tampil();
            //     } else {
            //         System.out.println("Data tidak ditemukan.");
            //     }
            // }
            case 7 -> {
                    System.out.print("Masukkan NIM setelah data mana ingin disisipkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa11 mhs = inpMahasiswa11(scan);
                    list11.insertAfter(keyNim, mhs);
                }
            case 8 -> {
                    System.out.print("Masukkan indeks tempat data disisipkan: ");
                    int indexAdd = scan.nextInt();
                    scan.nextLine(); 
                    Mahasiswa11 mhsAdd = inpMahasiswa11(scan);
                    list11.add(indexAdd, mhsAdd);
                    break;
                }
            case 9 -> {
                    System.out.print("Masukkan NIM sebelum node yang akan dihapus: ");
                    String keyNimRemove = scan.nextLine();
                    list11.removeAfter(keyNimRemove);
                    break;
            }
            case 10 -> {
                    System.out.print("Masukkan indeks node yang akan dihapus: ");
                    int indexRemove = scan.nextInt();
                    scan.nextLine();
                    list11.remove(indexRemove);
                    break;
            }
            case 11 -> list11.getFirst();
            case 12 -> list11.getLast();
            case 13 -> {
                System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                int idx = scan.nextInt();
                scan.nextLine();
                list11.get(idx);
                break;
            }
            case 14 -> {
                System.out.println("Jumlah data dalam list: " + list11.size());
                    break;
            }       
            case 0 -> System.out.println("Keluar dari program.");
            default -> System.out.println("Pilihan tidak valid!");
        }
        } 
        while (pilihan != 0);
        scan.close();
    }
}
