import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Magaza magaza = new Magaza();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1-Ürün Ekle");
            System.out.println("2-Ürün Listele");
            System.out.println("3-Ürün Sil");
            System.out.println("4-Marka Listeleme");
            System.out.println("5-Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Ürün Adı:");
                    String urunAdi = scanner.nextLine();
                    System.out.print("Birim Fiyatı: ");
                    double birimFiyati = scanner.nextDouble();
                    System.out.print("Stok Miktarı: ");
                    int stokMiktari = scanner.nextInt();
                    System.out.print("Marka ID: ");
                    int markaId = scanner.nextInt();
                    System.out.println("Cep telefonu eklemek için 1'e basın..");
                    System.out.println("Notebook eklemek için 2'ye basın..");
                    int techSecim = scanner.nextInt();
                    scanner.nextLine();
                    Marka marka = magaza.getMarkaByID(markaId);
                    if (marka != null) {
                        int depolama, kamera, ram;
                        double ekranBoyutu, pilGucu;
                        if (techSecim == 1) {
                            System.out.print("Depolama (GB):");
                            depolama = scanner.nextInt();
                            System.out.print("Ekran Boyutu: ");
                            ekranBoyutu = scanner.nextDouble();
                            System.out.print("Kamera: ");
                            kamera = scanner.nextInt();
                            System.out.print("Pil Gücü: ");
                            pilGucu = scanner.nextInt();
                            scanner.nextLine();
                            Urun cepTelefonu = new Urun(birimFiyati, stokMiktari, urunAdi, marka, depolama, ekranBoyutu, kamera, pilGucu);
                            magaza.urunEkle(cepTelefonu, techSecim);
                        } else {
                            System.out.print("Depolama (GB): ");
                            depolama = scanner.nextInt();
                            System.out.print("RAM (GB): ");
                            ram = scanner.nextInt();
                            System.out.print("Ekran Boyutu (inç): ");
                            ekranBoyutu = scanner.nextDouble();
                            scanner.nextLine();
                            Urun notebook = new Urun(birimFiyati, stokMiktari, urunAdi, marka, depolama, ekranBoyutu, ram);
                            magaza.urunEkle(notebook, techSecim);
                        }
                        System.out.println("Ürün Eklendi");
                    } else {
                        System.out.println("Geçersiz Marka ID");
                    }
                    break;
                case 2:
                    magaza.urunListele();
                    break;
                case 3:
                    System.out.print("Silmek istediğiniz Ürünü Seçin: ");
                    int silinecekId = scanner.nextInt();
                    magaza.urunSil(silinecekId);
                    System.out.println("Urün Silindi");
                    break;
                case 4:
                    magaza.markaListele();
                    break;
                case 5:
                    System.out.println("Programdan Çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz Seçim...");

            }

        }
    }
}
