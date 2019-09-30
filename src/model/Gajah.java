package model;

public class Gajah extends Binatang implements Herbivora{
    private String suara,warnaBulu;

    public Gajah(String nama, int jmlhKaki, String suara, String warnaBulu) {
        super(nama, jmlhKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    void displayBinatang(String nama, int JumlahKaki) {
        super.displayBinatang(nama, JumlahKaki);
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan " + getNama() + " adalah " + makananH);
    }

    void displayData() {
        //implementasi kode
    }
}
