import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Magaza {
    private List<Marka> markalar;
    private List<Urun> cepTelefonlari;
    private List<Urun> noteBooklar;

    public Magaza() {
        this.markalar = new ArrayList<>();
        this.cepTelefonlari = new ArrayList<>();
        this.noteBooklar = new ArrayList<>();
        markalar.add(new Marka(1, "Apple"));
        markalar.add(new Marka(2, "Asus"));
        markalar.add(new Marka(3, "Casper"));
        markalar.add(new Marka(4, "HP"));
        markalar.add(new Marka(5, "Huawei"));
        markalar.add(new Marka(6, "Lenovo"));
        markalar.add(new Marka(7, "Monster"));
        markalar.add(new Marka(8, "Samsung"));
        markalar.add(new Marka(9, "Xiaomi"));
        markalar.sort(Comparator.comparing(Marka::getName));
    }

    public void urunEkle(Urun urun, int techSecim) {
        if (urun instanceof Urun) {
            for (Marka marka : markalar) {
                if (urun.getMarka().getName().equals(marka.getName())) {
                    if (techSecim == 1) {
                        cepTelefonlari.add(urun);
                    } else {
                        noteBooklar.add(urun);
                    }
                    break;
                }
            }
        }
    }

    public void urunSil(int urunid) {

        //cepTelefonlari.removeIf(urun -> urun.getId()==urunid);
        Iterator<Urun> iterator = cepTelefonlari.iterator();
        while (iterator.hasNext()) {
            Urun urun = iterator.next();
            if (urun.getId() == urunid) {
                iterator.remove();
            }
        }
    }

    public  void urunListele(){

        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Urun urun : noteBooklar) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-11d |\n", urun.getId(), urun.getUrunAdi(), urun.getBirimFiyati(), urun.getMarka().getName(), urun.getDepolama(), urun.getEkranBoyutu(), urun.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\nCep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Urun urun : cepTelefonlari) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-9d | %-9.1f | %-9d | %-9s |\n", urun.getId(), urun.getUrunAdi(), urun.getBirimFiyati(), urun.getMarka().getName(), urun.getDepolama(), urun.getEkranBoyutu(), urun.getKamera(), urun.getPilGucu(), urun.getRam(), urun.getRenk());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

    }

    public  void markaListele(){
        System.out.println("| ID | Marka Adı  |");
        for (Marka marka : markalar) {
            System.out.format("| %-1d  | %-1s    |\n",marka.getId(),marka.getName());
        }
    }

    public Marka getMarkaByID(int id){
        for (Marka marka: markalar){
            if (marka.getId() == id){
                return marka;
            }
        }
        return null;
    }

}