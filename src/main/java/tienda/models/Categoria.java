
package tienda.models;

import java.util.List;

public class Categoria {
    private String id,categoria;
    private List<Producto> productos;
    
    public Categoria() {}

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) {  this.categoria = categoria; }

    public List<Producto> getProductos() {   return productos; }

    public void setProductos(List<Producto> productos) {  this.productos = productos; }
}
