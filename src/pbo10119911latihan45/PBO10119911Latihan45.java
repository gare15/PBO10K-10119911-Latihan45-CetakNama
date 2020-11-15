/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911latihan45;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Mochamad Tegar
 * NIM : 10119911
 * Kelas : IF 10K
 * 
 */
public class PBO10119911Latihan45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int jumlah;
        Printer cetak = new Printer();
        Scanner scanner = new Scanner(System.in);

        //proses pengisian data
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda\t\t\t: ");
        cetak.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali?\t: ");
        cetak.setJmlCetak(scanner.nextInt());

        //proses pemanggilan method
        nama = cetak.getNama();
        jumlah = cetak.getJmlCetak();
        cetak.cetak(nama);
        cetak.cetak(jumlah,nama);
    }
    
}
