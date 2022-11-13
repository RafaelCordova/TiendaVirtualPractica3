/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;

/**
 *
 * @author Rafael
 */
public class TestMainLaptop {
    
      public static void main(String args[]) {
        
        LaptopAcer laptopAcer = new LaptopAcer(2000.0,2018,3.5f);
        LaptopToshiba laptopToshiba = new LaptopToshiba(3000.0,2019,4.5f);


        LaptopLenovo laptopLenovo = new LaptopLenovo(4000.0,2020,5.0f);

        laptopAcer.mostrardatos(2000, "gtx 3090", "mecanico");
        System.out.println();
        laptopLenovo.mostrardatos("mecanico", "Ryzen 5 5600g", "SATA3");
        System.out.println();
        laptopToshiba.mostrardatos("lector blueray","ryzen 3 3200g",400);

    }
}
