package Soal4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Bersihkan buffer
        
        // Array untuk menyimpan data mahasiswa
        String[] nama = new String[jumlah];
        double[] nilai = new double[jumlah];
        String[] status = new String[jumlah];
        
        // Input data mahasiswa
        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = input.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = input.nextDouble();
            input.nextLine(); // Bersihkan buffer
            
            // Tentukan status
            if (nilai[i] < 50) {
                status[i] = "Tidak Lulus";
            } else if (nilai[i] == 50) {
                status[i] = "Tidak Lulus";
            } else if (nilai[i] > 50) {
                status[i] = "Lulus";
            }
        }
        
        // Tampilkan tabel data mahasiswa
        System.out.println("\n========================================");
        System.out.println("       DAFTAR NILAI MAHASISWA");
        System.out.println("========================================");
        System.out.printf("%-5s %-20s %-10s %-15s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-20s %-10.0f %-15s\n", 
                (i + 1), nama[i], nilai[i], status[i]);
        }
        
        System.out.println("========================================");
        
        // Hitung statistik
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        for (int i = 0; i < jumlah; i++) {
            if (status[i].equals("Lulus")) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        
        System.out.println("\n=== STATISTIK ===");
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus);
        
        input.close();
    }
}
