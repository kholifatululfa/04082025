import java.util.Scanner;

public class BelanjaBuah {
    public static void main(String[] args) {
        int anggur=12,mangga =15;
        double hargaAnggur =14500, hargaMangga =10500;
        double total, bayar, kembalian;
        
        total=(anggur*hargaAnggur)+(mangga*hargaMangga);
        System.out.println("Jumlah Anggur yang Dibeli : "+anggur+"dan Mangga : "+mangga);
        System.out.println("Total Pembayaran : "+total);
        Scanner Input = new Scanner (System.in);
        System.out.println("Masukkan Pembayaran : ");
        bayar=Input.nextDouble();
        kembalian = bayar-total;
        System.out.println("Kembalian anda adalah : "+kembalian);
        
    }
    
}
