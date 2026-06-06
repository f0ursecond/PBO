public class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius) {
        super(0); // Lingkaran biasanya dianggap memiliki 0 sisi
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Menggambar Lingkaran dengan radius " + radius);
    }

    @Override
    public void resize() {
        System.out.println("Mengubah ukuran Lingkaran");
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }
}
