public class Inheritance{
    public static void main(String[] args) throws Exception {
        PegawaiInheritance a = new PegawaiInheritance("Halo", 10);
        System.out.println("Nama Pegawai : " + a.getnama() + ". Jumlah Gaji " + a.getgaji());
        PegawaiKontrak b = new PegawaiKontrak("Hola", 10, 2);
        System.out.println("Nama Pegawai : " + b.getnama() + ". Jumlah Gaji " + b.getgaji() + ". Waktu Lembur " + b.getlembur() + ". Total Gaji " + b.gaji());
        PegawaiTetap c = new PegawaiTetap("Aloha", 10, 10, 10);
        System.out.println("Nama Pegawai : " + c.getnama() + ". Jumlah Gaji " + c.getgaji() + ". Jumlah Tunjangan " + c.gettunjangan() + ". Jumlah Bonus " + c.getbonus() + ". Total Gaji " + c.gaji());
    }

}

class PegawaiInheritance {
    protected String nama;
    protected double gaji;

    public PegawaiInheritance(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getnama(){
        return nama;
    }
    public double getgaji(){
        return gaji;
    }
    public void setnama(){
        this.nama = nama;
    }
    public void setgaji(){
        this.gaji = gaji;
    }
}

class PegawaiKontrak extends PegawaiInheritance{
    protected double lembur;

    public PegawaiKontrak(String nama, double gaji, double lembur){
        super(nama, gaji);
        this.lembur = lembur;
    }
    
    public double getlembur(){
        return lembur;
    }
    public void setlembur(){
        this.lembur = lembur;
    }
    public double gaji(){
        return gaji * lembur;
    }
}

class PegawaiTetap extends PegawaiInheritance{
    protected double tunjangan;
    protected double bonus;

    public PegawaiTetap(String nama, double gaji, double tunjangan, double bonus){
        super(nama, gaji);
        this.tunjangan = tunjangan;
        this.bonus = bonus;
    }
    
    public double gettunjangan(){
        return tunjangan;
    }
    public void settunjangan(){
        this.tunjangan = tunjangan;
    }
    public double getbonus(){
        return bonus;
    }
    public void setbonus(){
        this.bonus = bonus;
    }
    public double gaji(){
        return gaji + tunjangan + bonus;
    }
}

