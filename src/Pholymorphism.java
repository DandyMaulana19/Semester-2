import java.util.ArrayList;

public class Pholymorphism{
    public static void main(String[] args) throws Exception{
        ArrayList<Koleksi> a = new ArrayList<>();

        Koleksi ab = new Koleksi("AB123", "Hello", "Kompas", "10-02-2023", 1, 01);
        Koleksi bc = new Buku("BC123", "World", "Gramedia", "20-03-2023", 2, 01, "Ahmad", "2023", "BC13", "BC113", "BC1113", "BC11113");
        Koleksi cb = new Majalah("CB123", "Halo", "Komplex", "30-03-2023", 3, 01, "Baru");
        Koleksi ba = new CakramDigital("BA123", "Dunia", "Komputindo", "1-03-2023", 4, 01, 01);
        
        a.add(ab);
        a.add(bc);
        a.add(cb);
        a.add(ba);

        for(Koleksi obj : a){
            obj.viewData();
        }
    }
}

class Koleksi{
    private String idKoleksi, nama, penerbit, tanggalterbit;
    private int jenis, status;

    public Koleksi(String idKoleksi, String nama, String penerbit, String tanggalterbit, int jenis, int status){
        this.idKoleksi = idKoleksi;
        this.nama = nama;
        this.penerbit = penerbit;
        this.tanggalterbit = tanggalterbit;
        this.jenis = jenis;
        this.status = status;

    }

    public String getidKoleksi(){
        return idKoleksi;
    }
    public String getnama(){
        return nama;
    }
    public String getpenerbit(){
        return penerbit;
    }
    public String gettanggalterbit(){
        return tanggalterbit;
    }
    public int getjenis(){
        return jenis;
    }
    public int getstatus(){
        return status;
    }
    public void setidKoleksi(){
        this.idKoleksi = idKoleksi;
    }
    public void setnama(){
        this.nama = nama;
    }
    public void setpenerbit(){
        this.penerbit = penerbit;
    }
    public void settanggalterbit(){
        this.tanggalterbit = tanggalterbit;
    }    
    public void setjenis(){
        this.jenis = jenis;
    }
    public void setstatus(){
        this.status = status;
    }
    public void viewData(){
        System.out.println("Id = " + idKoleksi);
        System.out.println("Nama = " + nama);
        System.out.println("Penerbit = " + penerbit);
        System.out.println("Tanggal Terbit = " + tanggalterbit);
        System.out.println("Jenis = " + jenis);
        System.out.println("Status = " + status);
        System.out.println("");
    }

}

class Buku extends Koleksi{
    private String pengarang, tahunMasuk, issn, isbn, doi, arxivld;

    public Buku(String idKoleksi, String nama, String penerbit, String tanggalterbit, int jenis, int status, String pengarang, String tahunMasuk, String issn, String isbn, String doi, String arxivld){
        super(idKoleksi, nama, penerbit, tanggalterbit, jenis, status);
        this.pengarang = pengarang;
        this.tahunMasuk = tahunMasuk;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivld = arxivld;
    }

    public String getpengarang(){
        return pengarang;
    }
    public String gettahunMasuk(){
        return tahunMasuk;
    }
    public String getissn(){
        return issn;
    }
    public String getisbn(){
        return isbn;
    }
    public String getdoi(){
        return doi;
    }
    public String getarxivld(){
        return arxivld;
    }
    public void setpengarang(){
        this.pengarang = pengarang;
    }
    public void settahunMasuk(){
        this.tahunMasuk = tahunMasuk;
    }
    public void setissn(){
        this.issn = issn;
    }
    public void setisbn(){
        this.isbn = isbn;
    }
    public void setdoi(){
        this.doi = doi;
    }
    public void setarxivld(){
        this.arxivld = arxivld;
    }
    public void viewData(){
        System.out.println("Pengarang = " + pengarang);
        System.out.println("Tahun Masuk = " + tahunMasuk);
        System.out.println("ISSN = " + issn);
        System.out.println("ISBN = " + isbn);
        System.out.println("DOI = " + doi);
        System.out.println("ARXIVLD = " + arxivld);
        System.out.println("");
    }
}

class Majalah extends Koleksi{
    private String Edisi;

    public Majalah(String idKoleksi, String nama, String penerbit, String tanggalterbit, int jenis, int status, String Edisi){
        super(idKoleksi, nama, penerbit, tanggalterbit, jenis, status);
        this.Edisi = Edisi;
    }

    public String getEdisi(){
        return Edisi;
    }
}

class Koran extends Koleksi{
    public Koran(String idKoleksi, String nama, String penerbit, String tanggalterbit, int jenis, int status){
        super(idKoleksi, nama, penerbit, tanggalterbit, jenis, status);
    }
}

class CakramDigital extends Koleksi{
    private int jenisMedia;

    public CakramDigital(String idKoleksi, String nama, String penerbit, String tanggalterbit, int jenis, int status, int jenisMedia){
        super(idKoleksi, nama, penerbit, tanggalterbit, jenis, status);
        this.jenisMedia = jenisMedia;
    }

    public int getjenisMedia(){
        return jenisMedia;
    }
}