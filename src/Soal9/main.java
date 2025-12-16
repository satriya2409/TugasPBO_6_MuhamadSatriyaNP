package Soal9;


public class main {
     public static void main(String[] args) {
        // Deklarasi array
        int[] age = {12, 4, 5, 2, 6};
        
        System.out.println("==================================================");
        System.out.println("    MENAMPILKAN ARRAY DENGAN 2 MACAM PERULANGAN");
        System.out.println("==================================================");
        System.out.println();
        
        // Array yang akan ditampilkan
        System.out.print("Array age: {");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i]);
            if (i < age.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        System.out.println();
        
        // ============================================
        // PERULANGAN 1: FOR LOOP (dengan indeks)
        // ============================================
        System.out.println("==================================================");
        System.out.println("PERULANGAN 1: FOR LOOP (dengan indeks)");
        System.out.println("==================================================");
        
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }
        
        System.out.println();
        
        // ============================================
        // PERULANGAN 2: FOR-EACH LOOP (Enhanced For)
        // ============================================
        System.out.println("==================================================");
        System.out.println("PERULANGAN 2: FOR-EACH LOOP (Enhanced For)");
        System.out.println("==================================================");
        
        int index = 0;
        for (int nilai : age) {
            System.out.println("age[" + index + "] = " + nilai);
            index++;
        }
        
        System.out.println();
        
        
        System.out.println();
        System.out.println("==================================================");
        System.out.println("                  PROGRAM SELESAI");
        System.out.println("==================================================");
    }
}
