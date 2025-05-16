package Pertemuan12;

public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();
        
        Mahasiswa11 mhs1 = new Mahasiswa11("101", "Rifat", "1A", 3.5);
        Mahasiswa11 mhs2 = new Mahasiswa11("102", "Zinky", "1B", 3.8);
        Mahasiswa11 mhs3 = new Mahasiswa11("103", "Zaki", "1C", 3.2);
        Mahasiswa11 mhs4 = new Mahasiswa11("104", "Tanggaq", "1D", 3.9);
        Mahasiswa11 mhs5 = new Mahasiswa11("105", "Riski", "1E", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Tanggaq", mhs3);
        sll.insertAt(2, mhs2);
        sll.insertAt(3, mhs5);
        sll.print();
    }
}
