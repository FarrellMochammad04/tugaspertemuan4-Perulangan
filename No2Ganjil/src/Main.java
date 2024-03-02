import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batasAwal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batasAkhir: ");
        int batasAkhir = input.nextInt();

        int count = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah: " + count);
    }
}
