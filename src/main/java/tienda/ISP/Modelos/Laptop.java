
package tienda.ISP.Modelos;

import org.bson.types.ObjectId;
import tienda.models.Producto;

public class Laptop extends Producto{
    
    private String serie;
    private double peso;
    private int año;


    
    public Laptop(String marca, double peso, int año) {
        this.serie = marca;
        this.peso = peso;
        this.año = año;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }


    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Laptop{" + "serie=" + serie + ", peso=" + peso + ", a�o lanzamiento=" + año + '}';
    }
    
    
    
}
