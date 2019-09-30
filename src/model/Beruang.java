package model;

public class Beruang extends Binatang implements Karnifora, Herbivora {
    private String suara, warnaBulu;

    public Beruang(String nama, int jmlhKaki, String suara, String warnaBulu) {
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
        System.out.println("Makanan " + getNama() + " adalah " + makananK + " & " + makananH);
    }

    void displayData() {
        //implementasi kode
    }
}
