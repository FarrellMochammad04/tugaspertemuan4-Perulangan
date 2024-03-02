import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.println("Bilangan dari 1 sampai " + n + " adalah:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
