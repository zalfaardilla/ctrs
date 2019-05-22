/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajaltoklurr;

import java.util.Scanner;

/**
 *
 * @author Septian
 */
public class persegih implements bangunDatar{

    private int sisi ;
    int L,K;
    
    Scanner inputan = new Scanner (System.in);
    
    /**
     * @return the sisi
     */
    public int getSisi() {
        return sisi;
    }

    /**
     * @param sisi the sisi to set
     */
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
   

    @Override
    public double Keliling() {
         try {
            System.out.println("Itung Keliling");
            System.out.println("Masukkan sisi =");
            sisi = inputan.nextInt();
                    
            K = 4*sisi;
            System.out.println("Keliling persegih adalah " + K);
            }
        catch (Exception e) {
            System.out.println("Lebokno ongko ae su!");
        }
        return K;
    }

    @Override
    public double Luas() {
        try {
            System.out.println("Itung Luas");
            System.out.println("Masukkan sisi =");
            sisi = inputan.nextInt();
                    
            L = sisi*sisi;
            System.out.println("Luas persegih adalah " + L);
            }
        catch (Exception e) {
            System.out.println("Lebokno ongko ae su!");
        }
        return L;
    } 
}
