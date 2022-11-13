
package tienda.models;

import java.util.List;

public class Familia {
    private String id, familia;
    private List<Categoria> categorias;
    
    public Familia() {}

    public String getId() {  return id; }

    public void setId(String id) {    this.id = id;}

    public String getFamilia() { return familia;}

    public void setFamilia(String familia) { this.familia = familia; }

    public List<Categoria> getCategorias() {    return categorias; }

    public void setCategorias(List<Categoria> categorias) {   this.categorias = categorias;  }
}
