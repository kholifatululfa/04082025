import java.util.Scanner;

public class PerhitunganDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double totalBeli,diskon,hargaAkhir,bayar,kembalian;
        System.out.println("Masukkan Total pembayaran: ");
        totalBeli = input.nextDouble();

        if(totalBeli > 500000){
            System.out.println("Mendapatkan diskon 20% ");
            diskon = (0.2)*totalBeli;
        }else if (totalBeli > 300000){
            System.out.println("Mendapatkan diskon 15% ");
            diskon = (0.15)*totalBeli;
        }else if(totalBeli > 100000){
            System.out.println("Mendapatkan diskon 10% ");
            diskon= (0.1)*totalBeli;
        }else{
            System.out.println("Tidak ada diskon");
            diskon = 0;
        }

        hargaAkhir = totalBeli - diskon;
        System.out.println("Harga Akhir "+hargaAkhir);
        System.out.println("Masukkan Pembayaran ");
        bayar = input.nextDouble();
        kembalian = bayar - hargaAkhir;
        System.out.println("Kembalian Anda "+kembalian);
        
        }
        
    }
    

