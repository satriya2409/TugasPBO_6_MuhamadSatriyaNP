package Soal3;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // a. Masukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();
        
        int[] array = new int[jumlah];
        
        // b. Memasukkan nilai elemen
        System.out.println("\nMasukkan nilai elemen:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            array[i] = input.nextInt();
        }
        
        // Tampilkan array yang diinputkan
        System.out.println("\n=== ARRAY YANG DIINPUTKAN ===");
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // c. Tampilkan nilai terbesar dan terkecil beserta indeksnya
        int nilaiTerbesar = array[0];
        int indeksTerbesar = 0;
        int nilaiTerkecil = array[0];
        int indeksTerkecil = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > nilaiTerbesar) {
                nilaiTerbesar = array[i];
                indeksTerbesar = i;
            }
            if (array[i] < nilaiTerkecil) {
                nilaiTerkecil = array[i];
                indeksTerkecil = i;
            }
        }
        
        System.out.println("\n=== NILAI TERBESAR DAN TERKECIL ===");
        System.out.println("Nilai Terbesar: " + nilaiTerbesar + " (Indeks: " + indeksTerbesar + ")");
        System.out.println("Nilai Terkecil: " + nilaiTerkecil + " (Indeks: " + indeksTerkecil + ")");
        
        // d. Jumlahkan semua data array dan cari rata-ratanya
        int jumlahTotal = 0;
        for (int i = 0; i < array.length; i++) {
            jumlahTotal += array[i];
        }
        double rataRata = (double) jumlahTotal / array.length;
        
        System.out.println("\n=== JUMLAH DAN RATA-RATA ===");
        System.out.println("Jumlah semua elemen: " + jumlahTotal);
        System.out.println("Rata-rata: " + rataRata);
        
        // e. Jumlahkan semua elemen yang berindeks ganjil (untuk NPM genap)
        int jumlahIndeksGanjil = 0;
        System.out.println("\n=== PENJUMLAHAN ELEMEN INDEKS GANJIL ===");
        System.out.print("Elemen dengan indeks ganjil: ");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print("array[" + i + "]=" + array[i] + " ");
            jumlahIndeksGanjil += array[i];
        }
        System.out.println("\nJumlah elemen indeks ganjil: " + jumlahIndeksGanjil);
        
        // g. Check apakah hasil penjumlahan ganjil atau genap
        System.out.println("\n=== PENGECEKAN GANJIL/GENAP ===");
        if (jumlahIndeksGanjil % 2 == 0) {
            System.out.println("Hasil penjumlahan " + jumlahIndeksGanjil + " adalah GENAP");
        } else {
            System.out.println("Hasil penjumlahan " + jumlahIndeksGanjil + " adalah GANJIL");
        }
        
        // h. Urutkan elemen array
        int[] arrayTerurut = array.clone(); // Copy array agar array asli tidak berubah
        Arrays.sort(arrayTerurut);
        
        System.out.println("\n=== ARRAY SETELAH DIURUTKAN ===");
        System.out.print("Array terurut (ascending): ");
        for (int i = 0; i < arrayTerurut.length; i++) {
            System.out.print(arrayTerurut[i] + " ");
        }
        System.out.println();
        
        input.close();
        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}
