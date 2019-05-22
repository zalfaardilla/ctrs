package jajaltoklurr;
import java.util.Scanner;

/**
 *
 * @author Septian
 */
public class mainYuk {
    public static void main(String [] args){
        persegihPanjang PP = new persegihPanjang();
        persegih P = new persegih ();
        balock B = new balock();
        koeboes KB = new koeboes ();
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("1.Bangun Datar");
        System.out.println("2.Bangun Rwang");
        System.out.println("Masukkan pilihan anda : ");
        int x = inputan.nextInt();
        switch (x){
            case 1:
                System.out.println("1. hitung persegih panjang");
                System.out.println("2. hitung persegih");
                System.out.println("Masukkan pilihan anda : ");
                int y = inputan.nextInt();
                
                switch (y) {
                    case 1:
                        PP.Luas();
                        PP.Keliling();
                        mainYuk.main(args);
                        break;
                    case 2:
                        P.Luas();
                        P.Keliling();
                        mainYuk.main(args);
                        break;   
                }
            case 2:
                System.out.println("1. hitung balock");
                System.out.println("2. hitung koeboes");
                System.out.println("Masukkan pilihan anda : ");
                int z = inputan.nextInt();
                
                switch (z) {
                    case 1:
                        B.Volume();
                        mainYuk.main(args);
                        break;
                    case 2:
                        KB.Volume();
                        mainYuk.main(args);
                        break;    
                }    
        }        
    }    
}
