package sample;

public abstract class BukuFactory {
    public static judulBuku getjudulBuku(String jenisBuku){
        if (jenisBuku.equals(JenisBuku.BUKU1)){
            return new Buku1();
        }
        else if(jenisBuku.equals(JenisBuku.BUKU2)){
            return new Buku2();
        }
        else if(jenisBuku.equals(JenisBuku.BUKU3)){
            return new Buku3();
        }
        return null;
    }
}
