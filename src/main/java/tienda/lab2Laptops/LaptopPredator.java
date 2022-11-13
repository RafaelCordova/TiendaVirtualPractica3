/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;

import tienda.Lab2Interfaces.ICamaraWeb;
import tienda.Lab2Interfaces.IConexionHDMI;
import tienda.Lab2Interfaces.IDiscoM2;
import tienda.Lab2Interfaces.IPantallaTactil;
import tienda.Lab2Interfaces.ITarjetaDedicada;
import tienda.Lab2Interfaces.ITecladoLuminoso;

/**
 *
 * @author Rafael
 */

public abstract class LaptopPredator extends Laptop implements ITarjetaDedicada,IDiscoM2,IConexionHDMI,ITecladoLuminoso,ICamaraWeb,IPantallaTactil{

    public LaptopPredator(double precio, int año, float peso) {
        super(precio, año, peso);
    }



    @Override
    public String tipo(String tipo) {
            
        return tipo;
            
    }

    @Override
    public void disponibilidad() {
                
        System.out.println("La laptop Predator tiene conexion HDMI");
                
    }

    @Override
    public int velocidad(int velocidad) {
       
        return velocidad;
        
    }

    @Override
    public String version(String version) {
        
        return version;
        
    }

    @Override
    public void grabarVideo() {
       
        System.out.println("La laptop Predator tiene camara web que graba en 4K");
        
    }
    public void mostrardatos(String tamaño,String tipo,int velocidad,String version){
        
        System.out.println("El precio de la laptop Predator es de: "+getPrecio());
        System.out.println("El a�o de la laptop Predator es de: "+getAño());
        System.out.println("El peso de la laptop Predator es de: "+getPeso());
        System.out.println("El tipo de teclado de la laptop Predator es de: "+tipo(tipo));
        System.out.println("La velocidad del discoM2 de la laptop Predator es de: "+velocidad(velocidad));
        System.out.println("La version de la tarjeta dedicada de la laptop Predator es de: "+version(version));
        System.out.println("La laptop Predator tiene conexion HDMI");
        System.out.println("La laptop Predator tiene camara web que graba en 4K");
        
    }
}
