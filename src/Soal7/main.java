package Soal7;

// Kelas yang mewarisi Thread
class ThreadKu extends Thread {
    private String namaThread;
    
    // Constructor
    public ThreadKu(String nama) {
        this.namaThread = nama;
    }
    
    // Override method run() - titik entri untuk thread baru
    @Override
    public void run() {
        System.out.println(namaThread + " dimulai...");
        
        try {
            // Simulasi proses dengan loop
            for (int i = 1; i <= 5; i++) {
                System.out.println(namaThread + " - Iterasi ke-" + i);
                
                // Thread sleep selama 500 millisecond
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(namaThread + " diinterupsi.");
        }
        
        System.out.println(namaThread + " selesai.");
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM THREAD DIMULAI ===\n");
        
        // Menciptakan objek dari kelas ThreadKu
        ThreadKu thread1 = new ThreadKu("Thread-1");
        ThreadKu thread2 = new ThreadKu("Thread-2");
        ThreadKu thread3 = new ThreadKu("Thread-3");
        
        // Memanggil method start() untuk memulai eksekusi thread
        thread1.start();
        thread2.start();
        thread3.start();
        
        System.out.println("\nSemua thread telah dijalankan!");
        System.out.println("Thread akan berjalan secara concurrent...\n");
        
        try {
            // Menunggu semua thread selesai
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread diinterupsi.");
        }
        
        System.out.println("\n=== PROGRAM THREAD SELESAI ===");
    }
}
