/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiftahulHuda_1955201012_UTS_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author acr
 */
public class IO_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MENGHITUNG LUAS LINGKARAN");
        System.out.println("Masukkan jari-jari lingkaran = ");
        int r =Integer.parseInt(input.readLine());
        int luaslingkaran = (int) (3.14*r*r);
        System.out.println("Luas Lingkaran adalah = " + luaslingkaran + " cm2");
        
    }
    
}
