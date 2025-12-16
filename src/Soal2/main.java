package Soal2;

public class main {
    public static void main(String[] args) {
        // Deklarasi array mobil
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        
        // Tampilkan array sebelum diubah
        System.out.println("Array sebelum diubah:");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + ": " + mobil[i]);
        }
        
        // Ubah nilai "Suzuki" pada indeks 1
        mobil[1] = "Toyota";
        
        // Tampilkan nilai yang telah diubah
        System.out.println("\nArray setelah diubah:");
        System.out.println("Indeks 1: " + mobil[1]);
        
        // Tampilkan seluruh array setelah perubahan
        System.out.println("\nSeluruh array setelah diubah:");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + ": " + mobil[i]);
        }
    }
}
}
