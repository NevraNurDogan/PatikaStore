import java.util.ArrayList;
import java.util.List;

public class Urun {
    private int id;
    private String name;
    private String marka;
    private int fiyat;
    private int indirim;
    private int stok;
    private int RAM;
    private double ekran;
    private String depolama;



    public Urun(int id, String name, String marka, int fiyat, int indirim, int stok, int RAM, double ekran,String depolama) {
        this.id = id;
        this.name = name;
        this.marka = marka;
        this.fiyat = fiyat;
        this.indirim = indirim;
        this.stok = stok;
        this.RAM = RAM;
        this.ekran = ekran;
        this.depolama=depolama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getIndirim() {
        return indirim;
    }

    public void setIndirim(int indirim) {
        this.indirim = indirim;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getEkran() {
        return ekran;
    }

    public void setEkran(double ekran) {
        this.ekran = ekran;
    }

    public String getDepolama() {
        return depolama;
    }

    public void setDepolama(String depolama) {
        this.depolama = depolama;
    }

    }

