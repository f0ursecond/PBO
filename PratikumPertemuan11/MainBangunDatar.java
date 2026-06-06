public class MainBangunDatar {
    public static void main(String[] args) {
        Kotak kotak = new Kotak(5, 10);
        System.out.println("--- Objek Kotak ---");
        kotak.draw();
        System.out.println("Jumlah Sisi: " + kotak.getJumlahSisi());
        System.out.println("Luas: " + kotak.getLuas());
        System.out.println("Keliling: " + kotak.getKeliling());

        System.out.println();

        Segitiga segitiga = new Segitiga(6, 8);
        System.out.println("--- Objek Segitiga ---");
        segitiga.draw();
        System.out.println("Jumlah Sisi: " + segitiga.getJumlahSisi());
        System.out.println("Luas: " + segitiga.getLuas());
        System.out.println("Keliling: " + segitiga.getKeliling());
    }
}
