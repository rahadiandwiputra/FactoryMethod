package sample;
import java.lang.*;


public class Main {




    public static void main(String[] args) {
        judulBuku order = BukuFactory.getjudulBuku(JenisBuku.BUKU1);
        order.buku();
        order = BukuFactory.getjudulBuku(JenisBuku.BUKU2);
        order.buku();
        order = BukuFactory.getjudulBuku(JenisBuku.BUKU3);
        order.buku();

    }
}
