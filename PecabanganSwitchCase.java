import java.util.Scanner;

public class PecabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama lampu :");
        String lampu = input.next();

        switch (lampu) {
            case "Merah":
                System.out.println("Anda Harus Berhenti!!");
                break;
            case "Kuning" :
                System.out.println("Anda Harus Bersiap-siap");
                break;
            case"Hijau" :
                System.out.println("Anda Boleh Jalan");
                break;
            default:
            System.out.println("Salah ketik yaa!!");
                break;
        }
    }
    
}
