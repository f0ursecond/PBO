package PratikumPertemuan5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Main {
    public static void main(String[] args) {
        
        Set<String> buku = new TreeSet<>();

        int index = 1;

        buku.add("Dilan 1990");
        buku.add("Dilan 1991");
        buku.add("Laskar Pelangi");
        buku.add("Mahaguru");
        buku.add("Mengejar Matahari");
        buku.add("Milea");
        buku.add("Perahu Kertas");

        System.out.println("Daftar buku secara Urut : ") ;

        for(Iterator<String> it = buku.iterator(); it.hasNext();) {
            String string = (String) it.next();
            System.out.println(index + ". " + string);
            index++;
        }

        System.out.println(" ");

        if(buku.contains("Mahaguru")){
            System.out.println("Buku Mahaguru ada");
        }

        System.out.println(" ");

        index = 1;
        buku.remove("Mahaguru");

        System.out.println("Daftar buku setelah Mahaguru dipinjam : ") ;

        for(Iterator<String> it = buku.iterator(); it.hasNext();) {
            String string = (String) it.next();
            System.out.println(index + ". " + string);
            index++;
        }
    }
}