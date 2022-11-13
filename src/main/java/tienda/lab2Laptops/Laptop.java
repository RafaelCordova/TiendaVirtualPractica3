/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.lab2Laptops;

/**
 *
 * @author Rafael
 */
public abstract class Laptop {
    
    private double precio;
    private int año;
    private float peso;

    public Laptop(double precio, int año, float peso) {
        this.precio = precio;
        this.año = año;
        this.peso = peso;
    }
    
    public Laptop() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Laptop{" + "precio=" + precio + ", a\u00f1o=" + año + ", peso=" + peso + '}';
    }
    
}
