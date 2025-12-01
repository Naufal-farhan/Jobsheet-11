import java.util.*;
public class Kubus20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus : ");
        int sisi = sc.nextInt();

        System.out.println("Volume kubus : "+ volume(sisi));
        System.out.println("Luar Permukaan Kubus : "+ luarPermukaanKubus(sisi));
    }
    public static int volume(int sisi){
        int volume = sisi * sisi *sisi;
        return volume;
    }
    public static int luarPermukaanKubus(int sisi){
        int luas = (sisi*sisi)*6;
        return luas;
    }
}

