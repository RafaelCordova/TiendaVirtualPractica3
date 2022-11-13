/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;

import tienda.Lab2Interfaces.ICamaraWeb;
import tienda.Lab2Interfaces.IDiscoSolido;
import tienda.Lab2Interfaces.IPantallaTactil;
import tienda.Lab2Interfaces.ITarjetaDedicada;

/**
 *
 * @author Rafael
 */

public abstract class LaptopAsus extends Laptop implements IDiscoSolido,ITarjetaDedicada,ICamaraWeb,IPantallaTactil{

    public LaptopAsus(double precio, int año, float peso) {
        super(precio, año, peso);
    }


    @Override
    public void grabarVideo() {

        System.out.println("La camara web de la laptop Asus graba videos");
        
    }

    @Override
    public String version(String version) {
        
        
        return version;
        
    }

    public String tipoDeInterfaz(String tipoDeInterfaz) {
        
        return tipoDeInterfaz;
        
    }

    public void mostrardatos(String tamaño,String version,String tipoDeInterfaz){
        
        System.out.println("El precio de la laptop Asus es de "+getPrecio());
        System.out.println("El a�o de la laptop Asus es de "+getAño());
        System.out.println("El peso de la laptop Asus es de "+getPeso());
        System.out.println("La version de la tarjeta dedicada de la laptop Asus es de "+version(version));
        System.out.println("El tipo de interfaz del disco solido de la laptop Asus es de "+tipoDeInterfaz(tipoDeInterfaz));
        
    }

 
    
}

