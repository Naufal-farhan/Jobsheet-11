import java.util.*;

public class RekapPenjualanKafe {
    public static void main(String[] args) {
        int menu = menu();
        int hari = hari();
        int[][] kafe = new int[menu][hari];

        rekapData(kafe);
        terbanyak(kafe);
        Rata(kafe);
    }

    public static int hari() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Hari : ");
        int hari = sc.nextInt();
        return hari;
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Menu : ");
        int menu = sc.nextInt();
        return menu;
    }

    public static void rekapData(int[][] rekap) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rekap.length; i++) {
            for (int j = 0; j < rekap[i].length; j++) {
                System.out.print("Masukkan jumlah penjualan menu ke-" + (i + 1) + " hari ke-" + (j + 1) + " : ");
                rekap[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void terbanyak(int[][] banyak) {
        int terbanyak = 0;
        int hasil = 0;
        int key = 0;
        for (int i = 0; i < banyak.length; i++) {
            int total = 0;
            for (int j = 0; j < banyak[i].length; j++) {
                total += banyak[i][j];
            }
            if (total > terbanyak) {
                terbanyak = total;
                key = i;
            }
        }
        System.out.println("Menu dengan penjualan terbanyak adalah menu ke-" + (key + 1));
        System.out.println("Dengan total terjual : " + terbanyak);
    }

    public static void Rata(int[][] banyak) {

        for (int i = 0; i < banyak.length; i++) {
            int total = 0;
            for (int j = 0; j < banyak[i].length; j++) {
                total += banyak[i][j];
            }
            int rerata = total / banyak[i].length;
            System.out.println("Rata rata penjualan menu ke-" + (i + 1) + " : " + rerata);
        }
    }

}
