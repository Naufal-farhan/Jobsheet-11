public class PengunjungKafe20 {
    
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar nama Pengunjung : ");
        for(String i : namaPengunjung){
            System.out.println("- "+i);
        }
    }
    public static void main(String[] args) {
         daftarPengunjung("Jono", "jarwo", "Rojali");
         daftarPengunjung("Andi");
         daftarPengunjung("Dono", "Eti", "Fahmi", "Galih");
    }
}
