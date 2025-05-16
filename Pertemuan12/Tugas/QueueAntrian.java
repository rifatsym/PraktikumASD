package Pertemuan12.Tugas;

public class QueueAntrian {
    Node11 front, rear;
    int size = 0;
    final int MAX = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX;
    }

    public void enqueue(Mahasiswa11 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        Node11 baru = new Node11(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memanggil: " + front.data);
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian Mahasiswa:");
        Node11 current = front;
        int no = 1;
        while (current != null) {
            System.out.println(no++ + ". " + current.data);
            current = current.next;
        }
    }

    public void lihatDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: " + front.data);
            System.out.println("Mahasiswa terakhir: " + rear.data);
        }
    }

    public void kosongkanAntrian() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public int hitungAntrian() {
        return size;
    }
}
