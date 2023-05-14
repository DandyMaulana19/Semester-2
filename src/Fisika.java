import java.util.Scanner;

public class Fisika{
    public static void main(String[] args) throws Exception {
        new Angka();
    }
}

class Angka {
    public Angka() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak antara kekasih (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan kecepatan kekasih A (km/jam): ");
        double kecepatanA = input.nextDouble();

        System.out.print("Masukkan kecepatan kekasih B (km/jam): ");
        double kecepatanB = input.nextDouble();

        double waktuPertemuan = jarak / (kecepatanA + kecepatanB);
        System.out.printf("Waktu pertemuan antara kekasih adalah: %.2f jam\n", waktuPertemuan);
    }
}
