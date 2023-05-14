public class Dealer {
    public static void main(String[] args) throws Exception {
        Sepeda Yamaha = new Sepeda("Yamaha", "Naked", "10000", "123", "4 Cylinder");
    }
}

class Sepeda{
    String Merk;
    String Type;
    String Harga;
    String Nomor_rangka;
    String Mesin;

    public Sepeda(String Merk, String Type, String Harga, String Nomor_rangka, String Mesin){
        this.Merk = Merk;
        this.Type = Type;
        this.Harga = Harga;
        this.Nomor_rangka = Nomor_rangka;
        this.Mesin = Mesin;
        
        
        System.out.println("Merk Sepeda : " +Merk);
        System.out.println("Type Sepeda : " +Type);
        System.out.println("Harga Sepeda : " +Harga);
        System.out.println("Nomor_rangka Sepeda : " +Nomor_rangka);
        System.out.println("Mesin Sepeda : " +Mesin);
    }
}