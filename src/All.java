import java.util.Scanner;

public class All{
    public static void main(String[] args) throws Exception {
        new Faktorial();
        new Fisika();
        new CekPrima();
        new Prima();
        new Fibonacci();
    }
}

class Faktorial{
    public Faktorial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int bilangan = input.nextInt();

        int hasil = 1;
        System.out.print("Faktorial dari " + bilangan + " adalah: ");
        for (int i = bilangan; i >= 1; i--) {
            hasil *= i;
            System.out.print(i + (i == 1 ? " = " : " x "));
        }
        System.out.print(hasil);
    }
}

class Fisika {
    public Fisika() {
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

class CekPrima {
    public CekPrima(){
    System.out.print("Masukkan Angka: ");
    
    Scanner input = new Scanner(System.in);
    int bilangan = input.nextInt();

    boolean prima = true;
        if (bilangan < 2) {
            prima = false;
        } else {
            for (int i = 2; i <= Math.sqrt(bilangan); i++) {
                if (bilangan % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        if (prima) {
            System.out.print(bilangan + " adalah bilangan prima");
        } else {
            System.out.print(bilangan + " bukan bilangan prima");
        }
    }
}


class Prima{
    public Prima() {
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

class Fibonacci {
    public Fibonacci() {
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
