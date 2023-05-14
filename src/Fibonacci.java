import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) throws Exception {
        new Angka();
    }
}

class Angka {
    public Angka() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan dalam deret Fibonacci: ");
        int jumlah = input.nextInt();

        int angka1 = 0, angka2 = 1, temp;
        System.out.print("Deret Fibonacci: " + angka1 + " " + angka2);

        for (int i = 2; i < jumlah; i++) {
            temp = angka2;
            angka2 = angka1 + angka2;
            angka1 = temp;
            System.out.print(" " + angka2);
        }
    }
}
