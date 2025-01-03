/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika.Class;

/**
 *
 * @author ASUS
 */
public class MatematikaBeraksiOverloading {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

       
        System.out.println("Pertambahan (int): 12 + 28 + 14 = " + matematika.pertambahan(12, 28, 14));
        System.out.println("Pertambahan (double): 12.5 + 28.7 + 14.2 = " + matematika.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (int): 23 + 34 = " + matematika.pertambahan(23, 34));
        System.out.println("Pertambahan (double): 3.4 + 4.9 = " + matematika.pertambahan(3.4, 4.9));

        
    }
}