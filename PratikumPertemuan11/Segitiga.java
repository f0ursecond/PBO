public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        super(3);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }

    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Segitiga");
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        // Asumsi segitiga siku-siku untuk perhitungan keliling
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}
