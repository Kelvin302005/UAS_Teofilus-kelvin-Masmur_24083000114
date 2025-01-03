/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.newpakage;

/**
 *
 * @author ASUS
 */
class Bank {
    private double saldo;

   
    public Bank(double saldo) {
        this.saldo = saldo;
    }

    
    public void simpanUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + getSaldo());
    }

   
    public void ambilUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        } else {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
            System.out.println("Saldo saat ini: Rp. " + getSaldo());
        }
    }

    
    public double getSaldo() {
        return saldo;
    }
}

