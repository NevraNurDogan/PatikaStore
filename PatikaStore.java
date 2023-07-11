import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    final List<Marka> markalar;
    final List<Notebook> notebooks;
    final List<Telefon> telefonlar;
    final List<Urun> urunler;

    Scanner scanner = new Scanner(System.in);
    public PatikaStore() {

        markalar = new ArrayList<>();
        notebooks = new ArrayList<>();
        telefonlar = new ArrayList<>();
        urunler= new ArrayList<>();
        markalar.add(new Marka(1, "Samsung"));
        markalar.add(new Marka(2, "Lenovo"));
        markalar.add(new Marka(3, "Apple"));
        markalar.add(new Marka(4, "Huawei"));
        markalar.add(new Marka(5, "Casper"));
        markalar.add(new Marka(6, "Asus"));
        markalar.add(new Marka(7, "HP"));
        markalar.add(new Marka(8, "Xiaomi"));
        markalar.add(new Marka(9, "Monster"));

    }

    public void markalariListele() {
        System.out.println("Markalar:");
        System.out.println("--------------------");
        for (Marka marka : markalar) {
            System.out.println("-" + marka.getName());
        }
    }

    public void notebookEkle() {
        notebooks.add(new Notebook(1, "HUAWEI Matebook 14", "Huawei", 7000, 13, 2, 16, 14, "512 GB"));
        notebooks.add(new Notebook(2, "LENOVO V14 IGL", "Lenova", 3699, 11, 3, 8, 14, "1024 GB"));
        notebooks.add(new Notebook(3, "ASUS Tuf Gaming", "Asus", 8199, 15, 7, 32, 15.6, "2048 GB"));
        urunler.addAll(notebooks);
    }


    public void telEkle() {
        telefonlar.add(new Telefon(1, "SAMSUNG GALAXY A51 ", "Samsung   ", 3199, 10, 5, 6, 6.5, "128 GB", 4000,"Siyah" ));
        telefonlar.add(new Telefon(2, "iPhone 11 64 GB", "Apple", 7379, 14, 4, 6, 6.1, "64 GB",3800, "Mavi" ));
        telefonlar.add(new Telefon(3, "Redmi Note 10 Pro 8GB", "Xiaomi", 4012, 12, 2, 12, 6.5, "128 GB",4010, "Yeşil"));
        urunler.addAll(telefonlar);
    }


    public void notebooklariListele() {
        List<Notebook> aktifNotebooks = new ArrayList<>(notebooks);
        for (Notebook notebook : aktifNotebooks) {
            notebook.notdisplayInfo();
        }
    }

    public void telefonlariListele() {
        List<Telefon> aktifTelefonlar = new ArrayList<>(telefonlar);
        for (Telefon telefon : aktifTelefonlar) {
            telefon.teldisplayInfo();
        }
    }

   public void notebookSil(int id) {
        boolean finished = false;
        for (Notebook notebook : notebooks) {
            if (notebook.getId() == id) {
                notebooks.remove(notebook);
                urunler.remove(notebook);
                System.out.println("Ürün başarıyla silindi.");
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("Böyle bir ürün bulunamadı.");
        }
        urunleriGuncelle();
    }
    public void telefonSil(int id) {
        boolean finished = false;
        for (Telefon telefon : telefonlar) {
            if (telefon.getId() == id) {
                telefonlar.remove(telefon);
                urunler.remove(telefon);
                System.out.println("Ürün başarıyla silindi.");
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("Böyle bir ürün bulunamadı.");
        }
        urunleriGuncelle();
    }


    private void urunleriGuncelle() {
        urunler.clear();
        urunler.addAll(notebooks);
        urunler.addAll(telefonlar);
    }
    public void yeniNotebookEkle() {
        int id,fiyat,indirim,stok,ram;
        String isim,marka,depo;
        double ekran;
        System.out.println("Yeni ürünün ismini giriniz:");
        isim=scanner.nextLine();
        System.out.println("Yeni ürünün id giriniz:");
        id= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni ürünün markasını giriniz:");
        marka=scanner.nextLine();
        System.out.println("Yeni ürünün fiyatını giriniz:");
        fiyat= scanner.nextInt();
        System.out.println("Yeni ürünün indirimini giriniz:");
        indirim= scanner.nextInt();
        System.out.println("Yeni ürünün stoğunu giriniz:");
        stok= scanner.nextInt();
        System.out.println("Yeni ürünün RAM  giriniz:");
        ram= scanner.nextInt();
        System.out.println("Yeni ürünün ekranını  giriniz:");
        ekran= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Yeni ürünün deposunu giriniz:");
        depo=scanner.nextLine();
        Notebook yeniNotebook = new Notebook(id, isim, marka, fiyat, indirim, stok, ram, ekran, depo);
        notebooks.add(yeniNotebook);
        urunler.add(yeniNotebook);
        System.out.println("Yeni ürün başarıyla ekrendi!");
        notebooklariListele();
    }
    public void yeniTelefonEkle() {
        int id,fiyat,indirim,stok,ram,telpil;
        String isim,marka,depo, renk;
        double ekran;
        System.out.println("Yeni ürünün ismini giriniz:");
        isim=scanner.nextLine();
        System.out.println("Yeni ürünün id giriniz:");
        id= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni ürünün markasını giriniz:");
        marka=scanner.nextLine();
        System.out.println("Yeni ürünün fiyatını giriniz:");
        fiyat= scanner.nextInt();
        System.out.println("Yeni ürünün indirimini giriniz:");
        indirim= scanner.nextInt();
        System.out.println("Yeni ürünün stoğunu giriniz:");
        stok= scanner.nextInt();
        System.out.println("Yeni ürünün RAM  giriniz:");
        ram= scanner.nextInt();
        System.out.println("Yeni ürünün ekranını  giriniz:");
        ekran= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Yeni ürünün deposunu giriniz:");
        depo=scanner.nextLine();
        System.out.println("Yeni ürünün pil giriniz:");
        telpil= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Yeni ürünün rengini giriniz:");
        renk=scanner.nextLine();
        Telefon yeniTelefon = new Telefon(id, isim, marka, fiyat, indirim, stok, ram, ekran, depo, telpil, renk);
        telefonlar.add(yeniTelefon);
        urunler.add(yeniTelefon);
        System.out.println("Yeni ürün başarıyla ekrendi!");

        telefonlariListele();
    }
}