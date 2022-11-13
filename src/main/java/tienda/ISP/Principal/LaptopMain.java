
package tienda.ISP.Principal;

import tienda.ISP.Modelos.LaptopAcerNitro5;
import tienda.ISP.Modelos.LaptopAsus;
import tienda.ISP.Modelos.LaptopHP;
import tienda.ISP.Modelos.LaptopPredator;
import tienda.ISP.Modelos.LaptopToshiba;

/**
 *
 * @author Rafael
 */
public class LaptopMain {
    
    public static void main(String args []) {
        
        //String id, Double precio, String serie, double peso, int año
        
    LaptopAcerNitro5 ob1 = new LaptopAcerNitro5("ACER4125234", 2.2, 2019);
    LaptopAsus       ob2 = new LaptopAsus("ASU5424314", 3.1 , 2018);
    LaptopHP         ob3 = new LaptopHP("HP5345374", 2.8, 2020);
    LaptopToshiba ob5 = new LaptopToshiba("E341SA34",2.4,2009);
    LaptopPredator ob4 = new LaptopPredator("PDT1423W45", 3.5,2020);
    
      
    ob1.datos("AMERICAN","AMD RADEON 34", 32, "EXPRESS", "KINGSTON",1500,2200);
        System.out.println();
    ob2.datos(16,512, 128,"AMD", "RX 6800 XT");
        System.out.println();
    ob3.datos("CENTURION","AMR 2400",1048,8);
        System.out.println();
    ob4.datos("NIVIDIA", "RTX 3050 Ti", 1024, 32, "KINGSTON", 1100);
        System.out.println();
    ob5.datos(256,8);
       
     
    }
    
}
