package Soal8;
import java.util.Scanner;

// Kelas yang mewarisi Thread
class MyThread extends Thread {
    private int threadNumber;
    
    // Constructor
    public MyThread(int number) {
        this.threadNumber = number;
    }
    
    // Override method run() - titik entri untuk thread baru
    @Override
    public void run() {
        System.out.println("Thread-" + threadNumber + " MULAI BERJALAN");
        
        try {
            // Simulasi proses
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-" + threadNumber + " >> Proses ke-" + i);
                
                // Sleep dengan waktu random
                Thread.sleep((long)(Math.random() * 800 + 200));
            }
        } catch (InterruptedException e) {
            System.out.println("Thread-" + threadNumber + " terganggu!");
        }
        
        System.out.println("Thread-" + threadNumber + " SELESAI ✓✓✓");
    }
}

// Main class
public class main {
    
    // Method helper untuk repeat string (kompatibel dengan Java 8)
    public static String repeat(String str, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(str);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Header program
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║     PROGRAM MEMBUAT BANYAK THREAD SEKALIGUS  ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();
        
        // Input dari user
        System.out.print("Berapa banyak thread yang ingin Anda buat? ");
        int jumlahThread = scanner.nextInt();
        
        // Validasi
        if (jumlahThread <= 0) {
            System.out.println("ERROR: Jumlah thread harus lebih dari 0!");
            scanner.close();
            return;
        }
        
        System.out.println();
        System.out.println(repeat("═", 50));
        System.out.println("Membuat dan menjalankan " + jumlahThread + " thread...");
        System.out.println(repeat("═", 50));
        System.out.println();
        
        // Buat array untuk menyimpan semua thread
        MyThread[] arrayThread = new MyThread[jumlahThread];
        
        // Buat dan jalankan semua thread menggunakan loop
        System.out.println(">>> MEMULAI SEMUA THREAD <<<");
        System.out.println();
        
        for (int i = 0; i < jumlahThread; i++) {
            arrayThread[i] = new MyThread(i + 1);
            arrayThread[i].start();  // Panggil start() untuk memulai thread
        }
        
        System.out.println("----> " + jumlahThread + " thread sedang berjalan CONCURRENT! <----");
        System.out.println();
        System.out.println(repeat("═", 50));
        System.out.println();
        
        // Tunggu semua thread selesai
        try {
            for (int i = 0; i < jumlahThread; i++) {
                arrayThread[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread terganggu!");
        }
        
        // Summary
        System.out.println();
        System.out.println(repeat("═", 50));
        System.out.println("         ✓ SEMUA THREAD TELAH SELESAI ✓");
        System.out.println(repeat("═", 50));
        System.out.println("Total thread yang dieksekusi: " + jumlahThread);
        System.out.println("Status: SUKSES");
        System.out.println(repeat("═", 50));
        
        scanner.close();
    }
}