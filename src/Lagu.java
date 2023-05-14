public class Lagu{
    String Penyanyi;
    String Judul;
    int jam;
    int menit;
    int detik;

    public Lagu(String Penyanyi, String Judul, int jam, int menit, int detik){
        this.Penyanyi = Penyanyi;
        this.Judul = Judul;
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public void setPenyanyi(String Penyanyi) {
        this.Penyanyi = Penyanyi;
    }

    public void setJudul(String Judul){
        this.Judul = Judul;
    }

    public void setjam(int jam){
        this.jam = jam;
    }

    public void setmenit(int menit){
        this.menit = menit;
    }

    public void setdetik(int detik){
        this.detik = detik;
    }

    public String getPenyanyi(){
        return Penyanyi;
    }
    
    public String getJudul(){
        return Judul;
    }
    
    public int getjam(){
        return jam;
    }

    public int getmenit(){
        return menit;
    }

    public int getdetik(){
        return detik;
    }
}
