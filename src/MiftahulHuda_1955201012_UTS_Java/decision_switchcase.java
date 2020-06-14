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
public class decision_switchcase {
    public static void main(String[] args) {
        Scanner bulan = new Scanner (System.in);
        System.out.println("Masukkan nomor bulan :");
        int a = bulan.nextInt();
        Scanner tahun = new Scanner (System.in);
        System.out.println("Masukkan Tahun :");
        int b = tahun.nextInt();
        int jumlahHari = 0;

        switch (a) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                jumlahHari = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                jumlahHari = 30;
                break;
            case 2:
                if (b%4==0){
                    jumlahHari = 29;
                }
                else
                    jumlahHari = 28;
                break;
            default:
                System.out.println("Maaf bulan hanya sampai 12.");
                break;
        }
        System.out.println("Jumlah hari = " + jumlahHari);
        
    }
}
