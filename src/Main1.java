import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        Main1 driver = new Main1();

        int pilihan = 0;
        do {
            System.out.println("\n===== Sistem Akademik =====");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Cari Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("===========================");

            System.out.print("Masukkan pilihan (1/2/3): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    driver.tambahMhs();
                    break;
                case 2:
                    System.out.println("\nMasukkan NIM mahasiswa yang ingin dicari:");
                    String nim = input.nextLine();
                    driver.view(nim);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan Sistem Akademik.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        } while (pilihan != 3);
    }

    
        private ArrayList<mhs> data = new ArrayList<>();

        public void tambahMhs(){
            Scanner input = new Scanner(System.in);
    
            System.out.println("Masukkan nama mahasiswa:");
            String nama = input.nextLine();
    
            System.out.println("Masukkan NIM mahasiswa:");
            String nim = input.nextLine();
    
            System.out.println("Masukkan prodi mahasiswa:");
            String prodi = input.nextLine();
    
            System.out.println("Masukkan alamat mahasiswa:");
            String alamat = input.nextLine();
    
            System.out.println("Masukkan TanggalLahir mahasiswa:");
            String tgllahir = input.nextLine();
    
            mhs baru = new mhs(nama, nim, prodi, alamat, tgllahir);
            data.add(baru);
        }
    
    
        public void view(String nim) {
            boolean ditemukan = false;
            for (mhs baru : data) {
                if (baru.getnim().equals(nim)) {
                    System.out.println("Nama\t: " + baru.getNama());
                    System.out.println("NIM\t: " + baru.getnim());
                    System.out.println("Program Studi\t: " + baru.getProdi());
                    System.out.println("Alamat\t: " + baru.getAlamat());
                    System.out.println("Tanggal Lahir\t: " + baru.getTgllahir());
    
                    ditemukan = true;
                    break;
                }
            }
    
            if (!ditemukan) {
                System.out.println("Data mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            }
        }
    }   