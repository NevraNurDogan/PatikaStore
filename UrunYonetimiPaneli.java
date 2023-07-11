import java.util.Scanner;
public class UrunYonetimiPaneli {
    private PatikaStore patikaStore;
    public UrunYonetimiPaneli() {
        patikaStore = new PatikaStore();

    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;
        System.out.println("Patika Ürün Yönetim Paneline Hoşgeldiniz!");
        System.out.println("-------------------------------------------");
        while(devam){
        System.out.println("1-Notebook İşlemleri");
        System.out.println("2-Cep Telefonu İşlemleri ");
        System.out.println("3-Marka Listele ");
        System.out.println("4-Çıkış ");
        System.out.println("Tercihinizi seçiniz: ");
            int secim = scanner.nextInt();
        switch(secim){
            case 1:
               int sec;
                System.out.println("İşlem seçiniz: ");
                System.out.println("1-Notebook Listele");
                System.out.println("2-Urun Sil ");
                System.out.println("3-Urun ekle ");
                System.out.println("4-Çıkış ");

                sec= scanner.nextInt();
                scanner.nextLine();
                switch(sec){
                    case 1:
                        patikaStore.notebookEkle();
                        patikaStore.notebooklariListele();
                        break;
                    case 2:
                        System.out.println("Silinecek ürünün id'sini giriniz. ");
                        int id;
                        id= scanner.nextInt();
                        scanner.nextLine();
                        patikaStore.notebookSil(id);
                        break;
                    case 3:
                        patikaStore.yeniNotebookEkle();
                        break;
                    case 4:
                        System.out.println("Çıkışınız başarıyla yapılmıştır." +
                                "\nİyi günler dileriz.");
                        devam = false;
                        break;
                    }
                    break;
            case 2:
                int sec2;
                System.out.println("İşlem seçiniz: ");
                System.out.println("1-Telefonları Listele");
                System.out.println("2-Urun Sil ");
                System.out.println("3-Urun ekle ");
                System.out.println("4-Çıkış ");

                sec2= scanner.nextInt();
                scanner.nextLine();
                switch(sec2){
                    case 1:
                        patikaStore.telEkle();
                        patikaStore.telefonlariListele();
                        break;
                    case 2:
                        System.out.println("Silinecek ürünün id'sini giriniz. ");
                        int id2;
                        id2= scanner.nextInt();
                        scanner.nextLine();
                        patikaStore.telefonSil(id2);
                        break;
                    case 3:
                        patikaStore.yeniTelefonEkle();
                        break;
                    case 4:
                        System.out.println("Çıkışınız başarıyla yapılmıştır." +
                                "\nİyi günler dileriz.");
                        devam = false;
                        break;
                     }
                break;
            case 3:
                patikaStore.markalariListele();
                break;
            case 4:
                System.out.println("Çıkışınız başarıyla yapılmıştır." +
                        "\nİyi günler dileriz.");
                devam = false;
                break;
                }
           }
        }
     }

