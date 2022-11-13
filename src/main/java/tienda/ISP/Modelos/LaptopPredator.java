/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.ISP.Modelos;

import tienda.ISP.Interfaces.IDiscoDuro;
import tienda.ISP.Interfaces.IDiscoM2;
import tienda.ISP.Interfaces.IRam;
import tienda.ISP.Interfaces.ITarjetaVideo;

/**
 *
 * @author Rafael
 */
public class LaptopPredator extends Laptop implements ITarjetaVideo,IDiscoDuro,IRam,IDiscoM2{
    
    public LaptopPredator(String serie, double peso, int año) {
        super(serie, peso, año);
    }

    public void datos(String marcaVideo,String modeloVideo,double capa,double ram,String marcaM2,double costoM2){
        System.out.println("\033[32m============LAPTOP PREDATOR===========");
        System.out.println("ID : "+getId());
        System.out.println("SERIE :"+getSerie());
         System.out.println("PESO :"+getPeso());
        System.out.println("A�O :"+getAño());
        System.out.println(mostrarVideo(marcaVideo,modeloVideo));
        System.out.println(capacidaDisco(capa));
        System.out.println(cantidadRam(ram));
        System.out.println(discoM2(marcaM2,costoM2));
    }
    
    
    
    @Override
    public String mostrarVideo(String marca, String modelo) {
      return "Marca de la tarjeta Video "+marca+" y modelo "+modelo;
              }

    @Override
    public String capacidaDisco(double capacidad) {
        return "Capacidad Disco HDD "+capacidad+"GB";
    }

    @Override
    public String cantidadRam(double ram) {
        return "Cantidad de RAM :"+ram+"GB"; 
    }

    @Override
    public String discoM2(String marca, double costo) {
        return "Disco Solido M2 de marca "+marca+" y con costo de "+costo+" soles";
    }
    
}
