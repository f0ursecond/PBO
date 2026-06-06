public class MainResizeable {
    public static void main(String[] args) {
        // a. Mendefinisikan objek kotak (panjang = 4, lebar = 5)
        Kotak kotak = new Kotak(4, 5);

        // b. Cetak luas dan keliling objek.
        System.out.println("--- Ukuran Awal ---");
        System.out.println("Luas: " + kotak.getLuas());
        System.out.println("Keliling: " + kotak.getKeliling());

        // c. Ubah ukuran panjang dan lebar sebesar 2x dari ukuran semula
        System.out.println("\nResizing sebesar 2x...");
        kotak.resize(2.0);

        // d. Cetak kembali luas dan keliling objek.
        System.out.println("--- Setelah Resize ---");
        System.out.println("Luas: " + kotak.getLuas());
        System.out.println("Keliling: " + kotak.getKeliling());
    }
}
