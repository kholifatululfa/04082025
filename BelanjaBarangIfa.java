import java.util.Scanner;

public class BelanjaBarangIfa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nama Barang");
        String NamaBarang1 = input.nextLine();
        System.out.println("Masukkan Harga Barang");
        Double HargaBarang1 = input.nextDouble();
        System.out.println("Masukkan Nama Barang 2");
        String NamaBarang2 = input.next();
        System.out.println("Masukkan Harga Barang 2");
        double HargaBarang2 = input.nextDouble();

        System.out.println("============");
        System.out.println("Barang yang Dibeli : "+NamaBarang1);
        System.out.println("Harga : "+HargaBarang1);

        System.out.println("Barang yang Dibeli"+NamaBarang2);
        System.out.println("Harga"+HargaBarang2);
        
    }
    
}
