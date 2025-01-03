/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACC;

/**
 *
 * @author ASUS
 */
public class ACBeraksi implements AC {

    @Override
    public void matikanAC() {
        System.out.println("AC dimatikan.");
    }

    @Override
    public void hidupkanAC() {
        System.out.println("AC dihidupkan.");
    }

    @Override
    public void dinginkanAC() {
        System.out.println("AC didinginkan.");
    }

    @Override
    public void panaskanAC() {
        System.out.println("AC dipanaskan.");
    }

    public static void main(String[] args) {
        ACBeraksi ac = new ACBeraksi();

        ac.hidupkanAC();
        ac.dinginkanAC();
        ac.matikanAC();
        ac.hidupkanAC();
        ac.panaskanAC();
    }
}
