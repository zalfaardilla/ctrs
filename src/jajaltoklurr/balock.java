/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajaltoklurr;

/**
 *
 * @author Septian
 */
import java.util.Scanner;
public class balock implements bangunRwang {

    private double panjang ;
    private double lebar ;
    private double tinggi ;
    
    double V;
    Scanner inputan = new Scanner (System.in);
    
    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double Volume() {
        try {
            System.out.println("Itung Polum");
            System.out.println("Masukkan dowo =");
            panjang = inputan.nextDouble();
            System.out.println("Masukkan lebar =");
            lebar = inputan.nextDouble();
            System.out.println("Masukkan duwur =");
            tinggi = inputan.nextDouble();
            
            V = panjang*lebar*tinggi;
            System.out.println("Volume balock adalah " + V);
            }
        catch (Exception e) {
            System.out.println("Lebokno ongko ae su!");
        }
        return V;
    }    
    
}
