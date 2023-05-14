import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        Player driver = new Player();

        int pilihan = 0;
        do {
        System.out.println("\n===== Musik Player =====");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Putar Lagu");
        System.out.println("3. Cari Lagu");
        System.out.println("4. Keluar");
        System.out.println("===========================");

        System.out.print("Masukkan pilihan (1/2/3/4): ");
        pilihan = input.nextInt();
        input.nextLine();

            if(pilihan == 1){
                driver.tambahlagu();
            }else if(pilihan == 2){
                System.out.println("\nMasukkan Judul Lagu yang ingin diputar:");
                String Judul = input.nextLine();
                driver.play(Judul);
            }else if(pilihan == 3){
                System.out.println("\nMasukkan Judul Lagu yang ingin dicari:");
                String Judul = input.nextLine();
                driver.view(Judul);
            }else if(pilihan == 4){
                System.out.println("Terima kasih telah menggunakan Musik Player");
            }else{
                System.out.println("Pilihan Tidak Tersedia");
            }
        }while(pilihan != 4);
    }
    private ArrayList<Lagu> data = new ArrayList<>();

        public void tambahlagu(){
            Scanner input = new Scanner(System.in);
    
            System.out.println("Masukkan nama penyanyi:");
            String Penyanyi = input.nextLine();
    
            System.out.println("Masukkan judul lagu:");
            String Judul = input.nextLine();
    
            System.out.println("Masukkan durasi jam:");
            int jam = input.nextInt();
    
            System.out.println("Masukkan durasi menit:");
            int menit = input.nextInt();
    
            System.out.println("Masukkan durasi detik:");
            int detik = input.nextInt();
    
            Lagu baru = new Lagu(Penyanyi, Judul, jam, menit, detik);
            data.add(baru);
        }

        public void play(String Judul) {
            boolean cek = false;
            for (Lagu baru : data) {
                if (baru.getJudul().equals(Judul)) {
                    System.out.println("Penyanyi\t: " + baru.getPenyanyi());
                    System.out.println("Judul\t: " + baru.getJudul());
                    System.out.println("Masukkan Durasi :");
                    System.out.println("Jam\t: " + baru.getjam());
                    System.out.println("Menit\t: " + baru.getmenit());
                    System.out.println("Detik\t: " + baru.getdetik());
    
                    cek = true;
                    break;
                }
            }
    
            if (!cek) {
                System.out.println("Lagu tidak ditemukan");
            }
        }

        public void view(String Judul) {
            if (!data.isEmpty()) {
                System.out.println("List Lagu:");
                data.stream().forEach(lagu -> {
                    System.out.println("Judul: " + lagu.getPenyanyi());
                    System.out.println("Penyanyi: " + lagu.getJudul());
                    System.out.println("Jam: " + lagu.getjam());
                    System.out.println("Menit: " + lagu.getmenit());
                    System.out.println("Detik: " + lagu.getdetik());
                    System.out.println();
                });
            } else {
                System.out.println("Belum ada list lagu.");
            }
        }        
    }