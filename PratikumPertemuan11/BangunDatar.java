public abstract class BangunDatar {

    protected int jumlahSisi;
    protected int x, y;

    public BangunDatar(int sisi) {
        this.jumlahSisi = sisi;
    }

    public void pindahkan(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw();

    public abstract void resize();

    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public abstract double getLuas();

    public abstract double getKeliling();
}
