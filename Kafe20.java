import java.util.*;

public class Kafe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode promo! : ");
        String diskon = sc.nextLine();
        menu("Andi", true, diskon);

        System.out.print("Ingin memesan berapa jenis menu? : ");
        int banyakJenis = sc.nextInt();

        double totalHarga = 0;
        String[] pesanan = new String[banyakJenis];
        for(int i = 0 ; i< banyakJenis; i++){
            System.out.println("====MENU KE-"+(i+1)+"====");
            System.out.print("Masukkan nomor menu yang anda inginkan : ");
            int menu = sc.nextInt();
            System.out.print("Masukkan jumlah yang ingin anda pesan : ");
            int jumlah = sc.nextInt();
            pesanan[i] = ("Anda memesan menu ke-"+(menu)+" Sebanyak "+jumlah+" jumlah !...");
            totalHarga += hitungTotalHarga(menu, jumlah, diskon);
        }
        System.out.println();
        System.out.println("====STRUK PEMBELIAN ANDA===============================================");
        for(int i = 0; i < banyakJenis; i++){
            System.out.println(pesanan[i]);
        }
        System.out.println("Total harga yang harus dibayar adalah : " + totalHarga);
        System.out.println("=======================================================================");
    }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selaamt Datang, " + namaPelanggan + " !");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!!..");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda Mendapatkan diskon tambahan sebesar 50% !!..");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda Mendapatkan diskon tambahan sebesar 30% !!..");
        } else {
            System.out.println("Kode Promo anda tidak valid !!..");

        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15.000");
        System.out.println("2. Capucinno  - RP 13.000");
        System.out.println("3. Latte      - RP 72.000");
        System.out.println("4. Teh Tarik  - RP 25.000");
        System.out.println("5. Roti Bakar - RP 65.000");
        System.out.println("6. Mie Goreng - RP 13.000");
        System.out.println("===========================");
        System.out.println("Silahkan Pilih Menu!!!!...");
    }

    public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String diskon) {
        int[] hargaItem = { 15000, 13000, 72000, 25000, 65000, 13000 };
        double promo = 0;
        if (diskon.equals("DISKON50")) {
            promo = 0.5;
        } else if (diskon.equals("DISKON30")) {
            promo = 0.3;
        } else {
            promo = 0;
        }
        double hargaTotal = ((hargaItem[pilihanMenu - 1] * banyakItem)
                - (hargaItem[pilihanMenu - 1] * banyakItem) * promo);
        return hargaTotal;
    }
}