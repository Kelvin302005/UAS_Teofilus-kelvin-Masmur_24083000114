/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika.newpagkage;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksiInterhance {
    public static void main(String[] args) {
        MatematikaCanggihInterhance matematikaCanggih = new MatematikaCanggihInterhance();

        // Memanggil metode pertambahan
        int hasilPertambahan = matematikaCanggih.pertambahan(45, 30);
        System.out.println("Pertambahan: 45 + 30 = " + hasilPertambahan);

        // Memanggil metode perkalian
        int hasilPerkalian = matematikaCanggih.perkalian(20, 20);
        System.out.println("Perkalian: 20 * 20 = " + hasilPerkalian);

        // Memanggil metode modulus
        int hasilModulus = matematikaCanggih.modulus(15, 2);
        System.out.println("Modulus: 15 % 2 = " + hasilModulus);
    }
}
