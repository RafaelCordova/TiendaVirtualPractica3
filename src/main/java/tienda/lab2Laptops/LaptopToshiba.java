/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;

import tienda.Lab2Interfaces.ICamaraWeb;
import tienda.Lab2Interfaces.IDiscoHDD;
import tienda.Lab2Interfaces.ILectorDisco;
import tienda.Lab2Interfaces.ITarjetaIntegrada;

/**
 *
 * @author Rafael
 */

public class LaptopToshiba extends  Laptop implements IDiscoHDD,ITarjetaIntegrada,ICamaraWeb,ILectorDisco{
    

    public LaptopToshiba(double precio, int año, float peso) {
        super(precio, año, peso);
    }

    @Override
    public String tipo(String tipo) {

        return tipo;

    }

    @Override
    public void grabarVideo() {
       
        System.out.println("La camara web de la laptop Toshiba es de 4K");
        
    }

    @Override
    public String procesador(String procesador) {
       
        return procesador;
        
    }

    @Override
    public int capacidad(int capacidad) {
       
        return capacidad;
        
    }
    public void mostrardatos(String tipo,String procesador,int capacidad){
        
        System.out.println("El precio de la laptop Toshiba es de: "+getPrecio());
        System.out.println("El a�o de la laptop Toshiba es de: "+getAño());
        System.out.println("El peso de la laptop Toshiba es de: "+getPeso());
        System.out.println("El tipo de lector de disco de la laptop Toshiba es de: "+tipo);
        System.out.println("El procesador de la tarjeta integrada de la laptop Toshiba es de: "+procesador);
        System.out.println("La capacidad del disco de la laptop Toshiba es de: "+capacidad);
        
    }
    
}
