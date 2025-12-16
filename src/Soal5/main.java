package Soal5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah baris dan kolom dari pengguna
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriks = new int[baris][kolom];

        // Memasukkan elemen matriks
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        // Menghitung jumlah semua elemen
        int jumlah = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                jumlah += matriks[i][j];
            }
        }

        // Menampilkan matriks
        System.out.println("\nMatriks yang dimasukkan:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan hasil penjumlahan
        System.out.println("\nJumlah semua elemen matriks: " + jumlah);

        input.close();
    }
}
