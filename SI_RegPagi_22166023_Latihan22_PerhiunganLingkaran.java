/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan22_perhiungan.lingkaran;
import java.util.Scanner;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO22
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Perhitungan Lingkaran
 */
public class SI_RegPagi_22166023_Latihan22_PerhiunganLingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double phi = 3.14;
        System.out.println("============Perhitungan Nilai Lingkaran===========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        
        double diameter= input.nextInt();
        double jarijari = diameter / 2;
        double luas = phi * jarijari*jarijari;
        double keliling = 2 * phi * jarijari;
        System.out.println("Jari-jari Lingkaran = "+jarijari);
        System.out.println("Luas Lingkaran = "+luas);
        System.out.println("Keliling Lingkaran = "+keliling);
    }
    
}
