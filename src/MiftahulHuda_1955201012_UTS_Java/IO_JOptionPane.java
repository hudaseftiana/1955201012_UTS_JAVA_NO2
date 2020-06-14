/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiftahulHuda_1955201012_UTS_Java;

import javax.swing.JOptionPane;

/**
 *
 * @author acr
 */
public class IO_JOptionPane {
    public static void main(String[] args) {
       //IO versi JOption
        System.out.println("LUAS PERMUKAAN BALOK");
        String inputpanjang = JOptionPane.showInputDialog("input panjang balok =");
        int p = Integer.parseInt(inputpanjang);
        String inputlebar = JOptionPane.showInputDialog("input lebar balok =");
        int l = Integer.parseInt(inputlebar);
        String inputtinggi = JOptionPane.showInputDialog("input tinggi balok =");
        int t = Integer.parseInt(inputtinggi);
        int lpbalok = 2*((p*l)+(p*t)+(l*t));
        System.out.println("Nilai Luas Permukaan Balok adalah " + lpbalok + " cm3");
        
    }
    
}
