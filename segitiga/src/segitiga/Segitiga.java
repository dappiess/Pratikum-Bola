/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

import java.util.Scanner;

/**
 *
 * @author MOKLET-02
 */
public class Segitiga {
    
    double alas;
    double tinggi;
    
    void input(){
    Scanner input = new Scanner (System.in);
    System.out.print("Masukan alas segitiga : ");
    alas = input.nextDouble();
    System.out.print("Masukan tinggi segitiga : ");
    tinggi = input.nextDouble();
  
    }
    void hitung(){
    int luas;
    luas = (int) (alas * tinggi/2);
    System.out.print("Luas segitiga = ");  
}
    float hasil(){
        double hasil = alas*tinggi/2;  
        return (float) hasil;
        
        
    }
}
