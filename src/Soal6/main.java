package Soal6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah;

        // Meminta jumlah bilangan
        while (true) {
            try {
                System.out.print("Masukkan jumlah bilangan: ");
                jumlah = input.nextInt();
                if (jumlah <= 0) {
                    System.out.println("Jumlah bilangan harus lebih dari 0. Coba lagi.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input salah! Masukkan bilangan bulat.");
                input.next(); // membersihkan input yang salah
            }
        }

        double[] angka = new double[jumlah];
        int i = 0;

        // Memasukkan elemen ke dalam array
        while (i < jumlah) {
            try {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = input.nextDouble();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Input salah! Masukkan bilangan valid.");
                input.next(); // membersihkan input yang salah
            }
        }

        // Menghitung rata-rata
        double total = 0;
        for (double num : angka) {
            total += num;
        }
        double rataRata = total / jumlah;

        // Menampilkan hasil
        System.out.println("\nBilangan yang dimasukkan:");
        for (double num : angka) {
            System.out.print(num + " ");
        }
        System.out.println("\nRata-rata: " + rataRata);

        input.close();
    }
}
