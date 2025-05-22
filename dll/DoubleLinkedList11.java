package dll;

import java.security.Key;

public class DoubleLinkedList11 {
    Node11 head;
    Node11 tail;

    public DoubleLinkedList11(){
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa11 data) {
        Node11 newNode = new Node11(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            head.next = newNode;
            newNode.prev = head;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa11 data) {
        Node11 newNode = new Node11(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa11 data){
        Node11 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemunkan.");
            return;
        }

        Node11 newNode = new Node11(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode; 
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (!isEmpty()) {
            Node11 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
             System.out.println("NIM: " + tmp.data.nim + ", Nama: " + tmp.data.nama);
             tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List masih kosong!");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        System.out.println("Data yang terhapus adalah: ");
        head.data.tampil();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah berhasil dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("list kosong, tidak bisa dihapus.");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
