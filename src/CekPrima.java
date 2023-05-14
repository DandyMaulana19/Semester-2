import java.util.Scanner;

public class CekPrima{
    public static void main(String[] args) throws Exception {
        new Angka();
    }
}

class Angka {
    public Angka(){
    System.out.println("Masukkan Angka: ");
    
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
            System.out.println(bilangan + " adalah bilangan prima");
        } else {
            System.out.println(bilangan + " bukan bilangan prima");
        }
    }
}
