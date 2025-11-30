public class Kafe20{
    public static void main(String[] args) {
        menu("Andi",true);
    }
    public static void menu(String namaPelanggan, boolean isMember){
        System.out.println("Selaamt Datang, "+namaPelanggan+" !");
        if(isMember){
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!!..");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15.000");
        System.out.println("2. Capucinno  - RP 13.000");
        System.out.println("3. Latte      - RP 72.000");
        System.out.println("4. Teh Tarik  - RP 25.000");
        System.out.println("5. Roti Bakar - RP 65.000");
        System.out.println("6. Mie Goreng - RP 13.000");
        System.out.println("7. Kopi Hitam - RP 16.000");
        System.out.println("===========================");
        System.out.println("Silahkan Pilih Menu!!!!...");
    }   
}