package tienda.models;

import org.bson.types.ObjectId;

public class Producto {

    private String id, producto, unidadMedida, marca;
    private Double precio;
    private int cantidadMaxima;
    
    public Producto(String id) {
        this.id = id;
    }

    public Producto(String id, Double precio) {
        this.id = id;
        this.precio = precio;
    }
    
    
   
    public Producto() {
    }
    
    public String getId() {
        return new ObjectId().toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String imprimeDatosProducto(Producto product) {
        StringBuilder salida = new StringBuilder();
        salida.append("Producto Id: ").append(product.id);
        salida.append("\nProducto: ").append(product.producto);
        salida.append("\nPrecio: ").append(product.precio);
        salida.append("\nUnidad de medida: ").append(product.unidadMedida);
        salida.append("\nMarca: ").append(product.marca);
        salida.append("\nCantidad Maxima: ").append(product.cantidadMaxima);
        return salida.toString();
    }
}
