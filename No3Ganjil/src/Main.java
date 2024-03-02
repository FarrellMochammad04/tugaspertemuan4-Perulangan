import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        int faktorial = 1;
        String faktorialString = n + "!=";
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
            if (i != 1) {
                faktorialString += i + "*";
            } else {
                faktorialString += i;
            }
        }
        System.out.println(faktorialString + "=" + faktorial);
    }
}
