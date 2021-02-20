/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119083.rafsanzenmustaofa.pkg1;

import java.util.Scanner;

/**
 *
 * NAMA : RAFSAN ZEN MUSTAOFA
 * NIM : 10119083
 * KELAS : IF2
 * UAS SOAL no 1
 */
public class UASIF210119083RAFSANZENMUSTAOFA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai Akhir Anda : ");
        
        double nilai = userInput.nextDouble();
        
        if (nilai > 80 & nilai <= 100) {
            System.out.println("Indeks Anda = A");
        } 
            else if (nilai > 68 & nilai <= 80) {
            System.out.println("Indeks Anda = B");
        } 
            else if (nilai > 56 & nilai <= 68) {
            System.out.println("Indeks Anda = C");
        } 
            else if (nilai > 45 & nilai <= 56) {
            System.out.println("Indeks Anda = D");
        } 
            else if (nilai >= 0 & nilai <= 45) {
            System.out.println("Indeks Anda = E");
        } 
            else {
            System.out.println("Nilai yang harus di Input bernilai 0 - 100");
        }
        
    }
    
}
