package polymorphism;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BangunDatar bd;
        Scanner inputan = new Scanner(System.in);
        SegiEmpat persegiPanjang = new SegiEmpat();
        bd = persegiPanjang;
        System.out.print("Masukkan Panjang: ");
        bd.panjang = inputan.nextDouble();

        System.out.print("Masukkan Lebar: ");
        bd.lebar = inputan.nextDouble();

        double luas = bd.luas();
        bd.cetakLuas("Persegi panjang", luas);

        Segitiga sikusiku = new Segitiga();
        bd = sikusiku;

        System.out.print("Masukkan Panjang: ");
        bd.panjang = inputan.nextDouble();

        System.out.print("Masukkan Tinggi: ");
        bd.tinggi = inputan.nextDouble();

        double luas1 = bd.luas(bd.panjang, bd.tinggi);
        bd.cetakLuas("Segitiga siku-siku", luas1);

        SegiEmpat persegi = new SegiEmpat();

        System.out.print("Masukkan Sisi: ");
        int sisi = inputan.nextInt();

        int luas2 = persegi.luas(sisi);

        persegi.cetakLuas("Persegi", luas2);

        JajarGenjang jajarGenjang = new JajarGenjang();
        System.out.print("Masukkan Alas: ");
        int alas = inputan.nextInt();
        System.out.print("Masukkan Tinggi: ");
        int tinggi = inputan.nextInt();

        int luas3 = jajarGenjang.luas(alas, tinggi);
        jajarGenjang.cetakLuas("Jajar Genjang", luas3);

    }

}
