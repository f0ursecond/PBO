public class Kotak extends BangunDatar implements Resizeable {
    private double panjang;
    private double lebar;

    public Kotak(double panjang, double lebar) {
        super(4);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Kotak with panjang " + panjang + " and lebar " + lebar);
    }

    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Kotak");
    }

    @Override
    public void resize(double x) {
        this.panjang *= x;
        this.lebar *= x;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
}
