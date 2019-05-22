package jajaltoklurr;
import java.util.Scanner;

/**
 *
 * @author Septian
 */
public class persegihPanjang implements bangunDatar{

    private int panjang ;
    private int lebar ;
    int L,K;
    
    Scanner inputan = new Scanner (System.in);
    
    /**
     * @return the panjang
     */
    public int getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public int getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public double Keliling() {
        try {
            System.out.println("Itung Keliling");
            System.out.println("Masukkan panjang =");
            panjang = inputan.nextInt();
            System.out.println("Masukkan lebar =");
            lebar = inputan.nextInt();
            
            K = 2*(panjang+lebar);
            System.out.println("Keliling persegih panjang adalah " + K);
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
            System.out.println("Masukkan panjang =");
            panjang = inputan.nextInt();
            System.out.println("Masukkan lebar =");
            lebar = inputan.nextInt();
            
            L = panjang*lebar;
            System.out.println("Luas persegih panjang adalah " + L);
            }
        catch (Exception e) {
            System.out.println("Lebokno ongko ae su!");
        }
        return L;
    }
}
