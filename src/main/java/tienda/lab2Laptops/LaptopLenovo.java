/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;


import tienda.Lab2Interfaces.IConexionHDMI;
import tienda.Lab2Interfaces.IDiscoSolido;
import tienda.Lab2Interfaces.ITarjetaIntegrada;
import tienda.Lab2Interfaces.ITecladoLuminoso;

/**
 *
 * @author Rafael
 */

public class LaptopLenovo extends Laptop implements IDiscoSolido,ITarjetaIntegrada,ITecladoLuminoso,IConexionHDMI {

    public LaptopLenovo(double precio, int año, float peso) {
        super(precio, año, peso);
    }

    @Override
    public void disponibilidad() {
       
        System.out.println("La laptop Lenovo tiene conexion HDMI");
        
    }

    @Override
    public String tipo(String tipo) {

        return tipo;
            
    }

    @Override
    public String procesador(String procesador) {  
        
        return procesador;
        
    }

    @Override
    public String tipoDeInterfaz(String tipoDeInterfaz) {
        
        return tipoDeInterfaz;
        
    }

    public void mostrardatos(String tipo,String procesador,String tipoDeInterfaz){
        
        System.out.println("El precio de la laptop Lenovo es de: "+getPrecio());
        System.out.println("El a�o de la laptop Lenovo es de: "+getAño());
        System.out.println("El peso de la laptop Lenovo es de: "+getPeso());
        System.out.println("El tipo de teclado de la laptop Lenovo es de: "+tipo(tipo));
        System.out.println("El procesador con tarjeta integrada de la laptop Lenovo es de: "+procesador(procesador));
        System.out.println("El tipo de interfaz del disco de la laptop Lenovo es de: "+tipoDeInterfaz(tipoDeInterfaz));
        System.out.println("La laptop Lenovo tiene conexion HDMI");
        System.out.println("La laptop Lenovo tiene disco solido");
        
    }


}
