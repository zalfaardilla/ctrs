package jajaltoklurr;

/**
 *
 * @author Septian
 */
import java.util.Scanner;
public class koeboes implements bangunRwang {


    private double rusok ;
    
    double V;
    Scanner inputan = new Scanner (System.in);
    
    /**
     * @return the rusok
     */
    public double getRusok() {
        return rusok;
    }

    /**
     * @param rusok the rusok to set
     */
    public void setRusok(double rusok) {
        this.rusok = rusok;
    }

    @Override
    public double Volume() {
        try {
            System.out.println("Itung Polum");
            System.out.println("Masukkan rusok =");
            rusok = inputan.nextDouble();
            
            V = rusok*rusok*rusok;
            System.out.println("Volume koeboes adalah " + V);
            }
        catch (Exception e) {
            System.out.println("Lebokno ongko ae su!");
        }
        return V;
    }    

}

