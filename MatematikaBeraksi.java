/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author ASUS
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mat = new Matematika();

        // Menjalankan metode dan menampilkan hasil
        int hasilPertambahan = mat.pertambahan(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + hasilPertambahan);

        int hasilPengurangan = mat.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);

        int hasilPerkalian = mat.perkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);

        double hasilPembagian = mat.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);
    }
}