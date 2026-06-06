// package polymorphism;
// public class BangunDatar {
//     protected double panjang;
//     protected double lebar;
//     protected double tinggi;
//     protected double sisi;
//     public double luas() {
//         double luas;
//         luas = panjang * lebar;
//         return luas;
//     }
//     /**
//      * overload
//      *
//      * @param panjang
//      * @param tinggi
//      * @return
//      */
//     public double luas(double panjang, double tinggi) {
//         return (panjang * tinggi) / 2;
//     }
//     // method baru
//     public double keliling() {
//         return 2 * (panjang + lebar);
//     }
//     // overload method baru
//     public double keliling(double sisi) {
//         return 4 * sisi;
//     }
//     public void cetakLuas(String tipe, double luas) {
//         System.out.println("Luas " + tipe + " adalah " + luas);
//     }
//     //overload
//     public void cetakLuas(String tipe, int luas) {
//         System.out.println("Luas " + tipe + " adalah " + luas);
//     }
// }
