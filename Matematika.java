/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author ASUS
 */
class Matematika {
    
    public int pertambahan(int a, int b) {
        return a + b;
    }

  
    public int pengurangan(int a, int b) {
        return a - b;
    }

   
    public int perkalian(int a, int b) {
        return a * b;
    }

    
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return (double) a / b;
    }
}

