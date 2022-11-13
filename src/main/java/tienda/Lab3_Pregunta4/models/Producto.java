package tienda.Lab3_Pregunta4.models;

import tienda.Lab3_Pregunta4.models.Interfaces.IItemEntregable;

public class Producto implements IItemEntregable{
    String id;
    String nombreProducto;
    Double precio;

    public Producto(){

    }

    public Producto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    

    public String imprimeDatosProducto(Producto producto) {
        StringBuilder salida = new StringBuilder();
        salida.append("Producto Id: ").append(producto.id);
        salida.append("\nProducto: ").append(producto.nombreProducto);
       
        return salida.toString();
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("\tProducto: "+this.nombreProducto+" Precio: "+this.precio);
        
    }

    @Override
    public Double priceEntrega() {
        // TODO Auto-generated method stub
        return this.precio;
    }

   
    

}
