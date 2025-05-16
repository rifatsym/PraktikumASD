package Pertemuan12;

import java.util.Scanner;

public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.print("Masukkan jumlah mahasiswa yang ingin ditambahkan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("ipk: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // konsumsi newline

            Mahasiswa11 mhs = new Mahasiswa11(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\nData Mahasiswa dalam Linked List:");
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.removeAt(0);
        sll.print();

    }
}
