package model;

abstract class Binatang {
    private String nama;
    private int jmlhKaki;

    Binatang(String nama, int jmlhKaki) {
        this.nama = nama;
        this.jmlhKaki = jmlhKaki;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlhKaki() {
        return jmlhKaki;
    }

    public void setJmlhKaki(int jmlhKaki) {
        this.jmlhKaki = jmlhKaki;
    }

    void displayBinatang(String nama, int jumlahKaki) {
        System.out.println("Nama Binatang " + nama + "Jumlah Kaki " + jumlahKaki);
    }
}
