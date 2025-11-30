public class PengunjungKafe20 {
    
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar nama Pengunjung : ");
        for(int i = 0; i< namaPengunjung.length ; i++){
            System.out.println("- "+namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
         daftarPengunjung("Jono", "jarwo", "Rojali");
         daftarPengunjung("Andi");
         daftarPengunjung("Dono", "Eti", "Fahmi", "Galih");
    }
}
