/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.Matematika;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBangetBeraksiInterhance2 {
    public static void main(String[] args) {
        MatematikaCanggihBangetInterhance2 matematikaCanggihBanget = new MatematikaCanggihBangetInterhance2();

       
        int hasilPertambahan = matematikaCanggihBanget.pertambahan(20, 30);
        System.out.println("Pertambahan: 20 + 30 = " + hasilPertambahan);

        
        int hasilPerkalian = matematikaCanggihBanget.perkalian(10, 5);
        System.out.println("Perkalian: 10 * 5 = " + hasilPerkalian);

       
        int hasilModulus = matematikaCanggihBanget.modulus(10, 3);
        System.out.println("Modulus: 10 % 3 = " + hasilModulus);

        
        int hasilPertambahanTiga = matematikaCanggihBanget.pertambahanTiga(5, 10, 15);
        System.out.println("Pertambahan Tiga: 5 + 10 + 15 = " + hasilPertambahanTiga);
    }
}
