import java.util.*;

public class MultiCatch {

    public static void main(String[] args) {
        try {
            double a = 50.4;
            int b = 34;
            int c;
            Scanner s = new Scanner(System.in);
            System.out.println("Masukkan angka: ");
            c = s.nextInt();
            int d = s.nextInt();
            System.out.println(c / d);

            int[] arr = { 1, 2, 3 };
            System.out.println(arr[10]);
        } catch (InputMismatchException e) {
            System.out.println("Inputan harus berupa bilangan bulat");
        } catch (ArrayIndexOutOfBoundsException f) {
            f.printStackTrace();
        } finally {
            System.out.println("Terima kasih telah menggunakan program ini.");
        }
    }
}
