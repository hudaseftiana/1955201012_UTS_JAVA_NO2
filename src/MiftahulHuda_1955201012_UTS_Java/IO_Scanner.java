/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiftahulHuda_1955201012_UTS_Java;

import java.util.Scanner;

/**
 *
 * @author acr
 */
public class IO_Scanner {
    public static void main(String[] args) {
        //membahas IO Scanner
        System.out.println("OPERASI HITUNG VOLUME KUBUS");
        Scanner inputrusuk = new Scanner (System.in);
        System.out.println("Inputkan Nilai rusuk kubus !");
        int nilai = inputrusuk.nextInt();
        int volume = nilai*nilai*nilai;
        System.out.println("Volume Kubus : " + volume + " cm3");
    }
    
}
