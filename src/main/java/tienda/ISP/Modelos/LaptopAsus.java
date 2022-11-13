/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.ISP.Modelos;

import tienda.ISP.Interfaces.IDiscoSolido;
import tienda.ISP.Interfaces.IRam;
import tienda.ISP.Interfaces.ITarjetaVideo;

/**
 *
 * @author Rafael
 */
public class LaptopAsus extends Laptop implements IRam,IDiscoSolido,ITarjetaVideo{
    
    public LaptopAsus(String serie,double peso, int año) {
        super(serie, peso, año);
    }

        public void datos(double ram,double capa,int trans, String marca,String modelo){
        System.out.println("======LAPTOP ASUS=======");
            System.out.println("ID: "+getId());
        System.out.println("SERIE :"+getSerie());
        System.out.println("PESO :"+getPeso());
        System.out.println("A�O :"+getAño());
         System.out.println(cantidadRam(ram));
         System.out.println(capacidadDiscoSolido(capa, trans));
         System.out.println(mostrarVideo(marca,modelo));
       
                                               }   
    
    @Override
    public String cantidadRam(double ram) {
         return "Cantidad de Ram :"+ram;
    }

    @Override
    public String capacidadDiscoSolido(double capacidad, int transferenciaDatos) {
        return "Disco Solido SSD de "+capacidad+" Gigas y velocidad de "+transferenciaDatos+" HZ";
    }

    @Override
    public String mostrarVideo(String marca, String modelo) {
        return "Tarjeta de video de marca "+marca+" y modelo :"+modelo;
    }
    
}
