public class MapelArray {
    public static void main(String[] args) {
        String mataPelajaran[] = {"1. Matematika", "2. Bahasa Indonesia", "3. IPA", "4. IPS", "5. Bahasa Inggris", "6. PJOK"};
        
        System.out.println("Daftar Mata Pelajaran:");
        for (int i = 0; i < mataPelajaran.length; i++){
            System.out.println(mataPelajaran[i]);
        }
    }
}
