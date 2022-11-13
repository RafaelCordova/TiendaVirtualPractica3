package tienda.Lab3_Pregunta4.controllers.Impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.http.Context;
import tienda.Lab3_Pregunta4.controllers.EntregasController;
import tienda.Lab3_Pregunta4.models.Entrega;
import tienda.Lab3_Pregunta4.models.Producto;
import tienda.Lab3_Pregunta4.models.Interfaces.IItemEntregable;
import tienda.Lab3_Pregunta4.repositories.EntregasRepositorio;
import tienda.config.Paths;

public class EntregasControllerImpl implements EntregasController{

    private static final String ID = "id";

    private EntregasRepositorio entregasRepositorio;

    public EntregasControllerImpl(EntregasRepositorio entregasRepositorio){
        this.entregasRepositorio = entregasRepositorio;
    }

    @Override
    public void create(Context context) {
        // TODO Auto-generated method stub

        String nombreTest = context.formParam("nombreEntrega");
        //ObjectMapper Obj = new ObjectMapper();
        
        //Entrega entregaPadre2 = context.bodyValidator(Entrega.class).get();
      //  List<IItemEntregable> itemsEntregables = new ArrayList<IItemEntregable>();

       // System.out.println("probando nombre: "+entregaPadre2.getNombreEntrega());
     //   System.out.println("probando nombre: "+entregaPadre2.getItemsEntregables());
       // itemsEntregables = entregaPadre2.getItemsEntregables();

        //Entrega entregaHijo = ((Entrega)entregaPadre2.getItemsEntregables().get(0));
     //   System.out.println("probando nombre2: "+itemsEntregables.toString());
       // System.out.println("NombreEntrega21: "+testMap.get("nombreEntrega"));
       //entregaPadre2.agregarItemEntregable(itemsEntregables);
        
        System.out.println("------------------");
        Entrega entregaPadre = context.bodyAsClass(Entrega.class);
        ArrayList<IItemEntregable> items = new ArrayList<>();
        
        Entrega entregaFrutas = new Entrega("Entrega Frutas", 50.00);
        Entrega entregaTelefonos = new Entrega("Entrega Telefonos", 5000.00);
        

        Producto producto1 = new Producto("Papaya");
        Producto producto2 = new Producto("Uvas");
        Producto producto3 = new Producto("Sandia");
        Producto iphone = new Producto("Iphone 13");

        entregaFrutas.agregarItemEntregable(producto1);
        entregaFrutas.agregarItemEntregable(producto2);
       
        entregaTelefonos.agregarItemEntregable(iphone);

      items.add(entregaFrutas);
      items.add(entregaTelefonos);

        entregaPadre.setItemsEntregables(items);
        //entregaPadre.setPrecio(null);
      //System.out.println("Precio total: "+entregaPadre.priceEntrega());

        System.out.println("EntregaC: " + entregaPadre);
        entregaPadre.imprimir();
     // entregaPadre.setPrecio(entregaFrutas.);
    // entregaFrutas.priceEntrega();
      
      System.out.println("precioTotal: " + entregaFrutas.getPrecio());

        entregasRepositorio.create(entregaPadre);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(entregaPadre.getId().toString()));
    }
    
    @Override
    public void findAll(Context context) {
        context.json(entregasRepositorio.findAll());
    }

}
