package sample;

public class Buku1 implements judulBuku {
    private String namaBuku=Buku1.class.getSimpleName();
    @Override
    public void buku(){
        System.out.println(namaBuku+" : Genrenya Horor");
    }
}
