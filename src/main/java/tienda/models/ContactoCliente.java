/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.models;

/**
 *
 * @author Rafael
 */
public class ContactoCliente {
    
    private String parentesco;
    private String nombre;
    private String docContact;
    private int numTelefonico;
    

    public ContactoCliente(){ }
    
    public ContactoCliente(String docContact){
        this.docContact = docContact;
    }
    
    public String getParentesco(){
        return parentesco;
    }
    
    public void setParentesco(String parentesco){
        this.parentesco = parentesco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocContact() {
        return docContact;
    }

    public void setDocContact(String docContact) {
        this.docContact = docContact;
    }

    public int getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(int numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    @Override
    public String toString() {
        return "ContactoCliente{" + "parentesco=" + parentesco + ", nombre=" + nombre + ", docContact=" + docContact + ", numTelefonico=" + numTelefonico + '}';
    }

    
    
}
