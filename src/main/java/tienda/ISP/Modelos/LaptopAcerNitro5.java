/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.ISP.Modelos;

import tienda.ISP.Interfaces.IDiscoDuro;
import tienda.ISP.Interfaces.IDiscoM2;
import tienda.ISP.Interfaces.IMemOptane;
import tienda.ISP.Interfaces.ITarjetaVideo;

/**
 *
 * @author Rafael
 */
public class LaptopAcerNitro5 extends Laptop implements ITarjetaVideo,IMemOptane,IDiscoM2,IDiscoDuro{
    
    public LaptopAcerNitro5(String serie, double peso, int año) {
        super(serie, peso, año);
    }
    
        
    public void datos(String marca, String modelo, int memOptane,String marca_Optane, String marca_M2,double costo,double capa){
        System.out.println("===========LAPTOP ACER NITRO 5=============");
        System.out.println("ID :"+getId());
        System.out.println("SERIE :"+getSerie());
         System.out.println("PESO :"+getPeso());
        System.out.println("A�O :"+getAño());
        System.out.println(mostrarVideo(marca,modelo));
        System.out.println(memoriaOptane(memOptane,marca_Optane));
        System.out.println(discoM2(marca_M2,costo));
        System.out.println(capacidaDisco(capa));
                                                                                        }
    
    

    @Override
    public String mostrarVideo(String marca, String modelo) {
       return "Marca Tarjeta "+marca+" y modelo "+modelo;
    }

    @Override
    public String memoriaOptane(int memOptane, String marca) {
         return "Capacidad RamOptane "+memOptane+" y de marca "+marca;
    }

    @Override
    public String discoM2(String marca, double costo) {
          return "Disco M2 de marca "+marca+" y precio "+costo;
    }

    @Override
    public String capacidaDisco(double capacidad) {
       return "Disco duro HDD de :"+capacidad;
    }
    
}
