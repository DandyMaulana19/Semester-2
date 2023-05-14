public class mhs{
    String nama;
    String nim;
    String prodi;
    String alamat;
    String tgllahir;

    public mhs(String nama, String nim, String prodi, String alamat, String tgllahir){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
        this.tgllahir = tgllahir;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setTgllahir(String tgllahir){
        this.tgllahir = tgllahir;
    }

    public String getNama(){
        return nama;
    }
    
    public String getnim(){
        return nama;
    }
    
    public String getProdi(){
        return prodi;
    }

    public String getAlamat(){
        return alamat;
    }

    public String getTgllahir(){
        return tgllahir;
    }
}
