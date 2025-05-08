package Tugas;

public class AntrianKRS {
    private Mahasiswa[] antrian;
    private int front, rear;
    private int jumlahProses;
    private final int MAKS_PROSES = 30;

    public AntrianKRS() {
        antrian = new Mahasiswa[10];
        front = rear = -1;
        jumlahProses = 0;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == antrian.length - 1;
    }

    public void clear() {
        front = rear = -1;
        jumlahProses = 0;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        antrian[rear] = mhs;
    }

    public void dequeue2() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Mahasiswa diproses:");
        for (int i = 0; i < 2; i++) {
            if (front <= rear && jumlahProses < MAKS_PROSES) {
                System.out.println(antrian[front]);
                front++;
                jumlahProses++;
            }
        }

        if (front > rear) {
            clear(); // reset jika semua terproses
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Seluruh Antrian:");
        for (int i = front; i <= rear; i++) {
            System.out.println((i - front + 1) + ". " + antrian[i]);
        }
    }

    public void printFront2() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        for (int i = front; i <= rear && i < front + 2; i++) {
            System.out.println(antrian[i]);
        }
    }

    public void printRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terakhir:");
        System.out.println(antrian[rear]);
    }

    public int count() {
        return isEmpty() ? 0 : rear - front + 1;
    }

    public int countProses() {
        return jumlahProses;
    }

    public int countBelumProses() {
        return MAKS_PROSES - jumlahProses;
    }
}

