public class PeliharaanArray {
    public static void main(String[] args) {
        String namaPeliharaan[] = {"Kucing", "Anjing", "Ikan", "Burung", "Hamster"};
        
        System.out.println("Daftar Jenis Peliharaan:");
        for (int i = 0; i < namaPeliharaan.length; i++){
            if (namaPeliharaan.length > 4) {
                System.out.println(namaPeliharaan[i]);
            } 
        }
            
    }
}

