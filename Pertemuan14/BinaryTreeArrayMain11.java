package Pertemuan14;

public class BinaryTreeArrayMain11 {
    public static void main(String[] args) {
        BinaryTreeArray11 bta = new BinaryTreeArray11();

        Mahasiswa11 mhs1 = new Mahasiswa11("244160121", "Ali", "A", 3.57);
        Mahasiswa11 mhs3 = new Mahasiswa11("244160185", "Candra", "C", 3.21);
        Mahasiswa11 mhs2 = new Mahasiswa11("244160221", "Badar", "B", 3.85);
        Mahasiswa11 mhs4 = new Mahasiswa11("244160220", "Dewi", "A", 3.54);

        Mahasiswa11 mhs5 = new Mahasiswa11("244160131", "Devi", "A", 3.72);
        Mahasiswa11 mhs6 = new Mahasiswa11("244160205", "Ehsan", "D", 3.37);
        Mahasiswa11 mhs7 = new Mahasiswa11("244160170", "Fizi", "B", 3.46);

        Mahasiswa11[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6; 
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);     

    }
}
