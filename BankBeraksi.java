/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.newpakage;

/**
 *
 * @author ASUS
 */
public class BankBeraksi {
    public static void main(String[] args) {
        
        Bank bank = new Bank(100000);
        
      
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
        System.out.println();

    
        bank.simpanUang(500000);
        System.out.println();

       
        bank.ambilUang(150000);
    }
}