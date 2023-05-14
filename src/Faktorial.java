import java.util.Scanner;

public class Faktorial{
    public static void main(String[] args) throws Exception {
        new Angka();
    }
}


class Angka {
    public Angka() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan untuk dihitung faktorial: ");
        int bilangan = input.nextInt();

        int hasil = 1;
        System.out.print("Faktorial dari " + bilangan + " adalah: ");
        for (int i = bilangan; i >= 1; i--) {
            hasil *= i;
            System.out.print(i + (i == 1 ? " = " : " x "));
        }
        System.out.println(hasil);
    }
}
