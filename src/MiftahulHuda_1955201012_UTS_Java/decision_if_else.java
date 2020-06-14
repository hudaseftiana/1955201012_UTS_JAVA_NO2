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
public class decision_if_else {
public static void main(String[] args) {
        String a = "Tahun Kabisat";
        String b = "Bukan Tahun Kabisat";
        int tahun;
        
        Scanner input=new Scanner(System.in);
        System.out.println("PROGRAM MENENTUKAN JENIS TAHUN");
        System.out.print("Masukan Angka Tahun: ");
        tahun=input.nextInt();
        
        if (tahun%4==0){
            System.out.println("Tahun " + tahun + " Adalah " + a);
        }
        else{
            System.out.println("Tahun " + tahun + " " + b);
        }       
    }
}
    