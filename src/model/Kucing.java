package model;

public class Kucing extends Binatang implements Karnifora {
    private String suara, warnaBulu;

    public Kucing(String nama, int jmlhKaki, String suara, String warnaBulu) {
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
        System.out.println("Makanan " + getNama() + " adalah " + makananK);
    }

    void displayData() {
        //implementasi kode
    }
}
