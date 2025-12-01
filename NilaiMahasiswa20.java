import java.util.*;

public class NilaiMahasiswa20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();
        int[] mahasiswa = new int[jumlah];
        
        isianArray(mahasiswa);
        tampilArray(mahasiswa);

        System.out.println("Jumlah total nilai seluruh mahasiswa adalah : "+ hitTot(mahasiswa));
    }

    public static void isianArray(int[] isi) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < isi.length; i++) {
            System.out.print("Input nilai Mahasiswa-" + (i + 1 )+ " : ");
            isi[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] tampil){
        for(int i =  0; i < tampil.length;i++){
            String output = "NILAI MAHASISWA-"+(i+1)+" Adalah : "+tampil[i];
            System.out.println(output);
        }
    }

    public static int hitTot(int[] hitung){
        int total = 0;
        for (int i = 0; i < hitung.length;i++){
            total += hitung[i];
        }
        return total;
    }
}
