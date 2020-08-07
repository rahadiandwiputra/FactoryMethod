package sample;

public class Buku2 implements judulBuku {
    private String namaBuku=Buku2.class.getSimpleName();

    @Override
    public void buku(){
        System.out.println(namaBuku+" : Genrenya Historycal");
    }
}
