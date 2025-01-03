/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika.Class;

/**
 *
 * @author ASUS
 */
class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pertambahan(int a, int b, int c) {
        return a + b + c;
    }

    public double pertambahan(double a, double b) {
        return a + b;
    }

    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public double pengurangan(double a, double b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return (double) a / b;
    }

    public double pembagian(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }
}

