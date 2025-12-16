package Soal10;


public class main {
    public static void main(String[] args) {
          System.out.println("=== MENAMPUNG DATA BERBAGAI TIPE ===\n");
        
        // Cara paling simple: Array Object
        Object[] data = {19, 0.2, 'C', "Java", true};
        
        System.out.println("Data yang ditampung: (19, 0.2, C, Java, true)\n");
        
        // Tampilkan semua data
        System.out.println("Isi array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }
        
        System.out.println("\n=== SELESAI ===");
    }  
    }

