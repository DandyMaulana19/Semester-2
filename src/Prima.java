import java.util.Scanner;

public class Prima{
    public static void main(String[] args) throws Exception {
        new Angka();
    }
}

class Angka{
    public Angka() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas atas: ");
        int batas = input.nextInt();

        System.out.print("Daftar bilangan prima dari 2 hingga " + batas + ": ");

        for (int i = 2; i <= batas; i++) {
            boolean prima = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
