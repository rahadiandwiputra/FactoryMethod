package sample;

public class Buku3 implements judulBuku {
    private String namaBuku=Buku3.class.getSimpleName();

    @Override
    public void buku(){
        System.out.println(namaBuku+" : Genrenya Percintaan");
    }
}
