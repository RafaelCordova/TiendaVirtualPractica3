package tienda.Lab3_Pregunta4.models;

import java.util.ArrayList;
import java.util.List;

import tienda.Lab3_Pregunta4.models.Interfaces.IItemEntregable;

public class Entrega implements IItemEntregable{
    String id;
    String nombreEntrega;
    Double precio;
    ArrayList<IItemEntregable> itemsEntregables = new ArrayList<IItemEntregable>();
    

    public Entrega(){
        
    }

    public Entrega(String nombreEntrega, Double precio){
        this.nombreEntrega = nombreEntrega;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombreEntrega() {
        return nombreEntrega;
    }
    public void setNombreEntrega(String nombreEntrega) {
        this.nombreEntrega = nombreEntrega;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ArrayList<IItemEntregable> getItemsEntregables() {
        return itemsEntregables;
    }

    public void setItemsEntregables(ArrayList<IItemEntregable> itemsEntregables) {
        this.itemsEntregables = itemsEntregables;
    }
    
   

    @Override
    public Double priceEntrega() {
        // TODO Auto-generated method stub
        Double price = 0.0;

        for(IItemEntregable item: itemsEntregables){
            price+=item.priceEntrega();
        }

        return price;
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("Nombre: "+getNombreEntrega()+" Precio: "+getPrecio());
        for(IItemEntregable item: itemsEntregables){
            System.out.print("\t");
            item.imprimir();
        }
    }

    public void agregarItemEntregable(IItemEntregable iItemEntregable){
        
        if(!itemsEntregables.contains(iItemEntregable)){
            
            itemsEntregables.add(iItemEntregable);
        }          
        else{
            System.out.println("Ya contiene esta entrega");
        }
    }

    
  
    
}
