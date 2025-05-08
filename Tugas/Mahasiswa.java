package Tugas;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Prodi: " + prodi;
    }
}

