import java.util.ArrayList;
import java.util.List;

public class Notebook extends Urun {
    List<Notebook> notebooks = new ArrayList<>();
    public Notebook(int id,
                    String name ,
                    String marka,
                    int fiyat,
                    int indirim,
                    int stok,
                    int RAM,
                    double ekran ,
                    String depolama) {
        super(id,name,marka,fiyat,indirim,stok,RAM,ekran,depolama);
    }
    public void notdisplayInfo() {
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

