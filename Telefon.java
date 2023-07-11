public class Telefon extends Urun{
    private int telPil;
    private String telRenk;

    public Telefon(int id,String name ,String marka,int fiyat, int indirim, int stok,int RAM,double ekran ,String depolama,int telPil,String telRenk) {
        super(id,
                name,
                marka,
                fiyat,
                indirim,
                stok,
                RAM,
                ekran,
                depolama);

        this.telPil = telPil;
        this.telRenk = telRenk;
    }
    public int getTelPil() {
        return telPil;
    }
    public void setTelPil(int telPil) {
        this.telPil = telPil;
    }
    public String getTelRenk() {
        return telRenk;
    }

    public void setTelRenk(String telRenk) {
        this.telRenk = telRenk;
    }

    public void teldisplayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("ID: " + getName());
        System.out.println("Marka: " + getMarka());
        System.out.println("Fiyat: " + getFiyat());
        System.out.println("RAM: " + getRAM());
        System.out.println("Depolama: " + getDepolama());
        System.out.println("Ekran: " + getEkran());
        System.out.println("---------------------------");
    }
}
