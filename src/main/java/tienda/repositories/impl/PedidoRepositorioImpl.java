package tienda.repositories.impl;

import tienda.Lab3_Pregunta1.AuditoriaFiDecorator;
import tienda.Lab3_Pregunta1.AuditoriaReDecorator;
import tienda.Lab3_Pregunta1.Inspeccion;
import tienda.Lab3_Pregunta1.LavadoActivosDecorator;
import tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion;
import tienda.models.Cliente;
import tienda.models.PagaloYaMetodoPago;
import tienda.models.Pedido;
import tienda.repositories.PedidoRepositorio;

import java.util.List;
import java.util.LinkedList;

//import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;
import org.bson.types.ObjectId;

public class PedidoRepositorioImpl implements PedidoRepositorio {

    private static final String COLLECTION_NAME = "pedidos";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

    private final MongoCollection<Pedido> pedidos;

    public PedidoRepositorioImpl(MongoDatabase database) {
        this.pedidos = database.getCollection(COLLECTION_NAME, Pedido.class);
    }

    @Override
    public void create(Pedido pedido) {

        pedido.setId((new ObjectId()).toString());
        inspeccionEmpresa(pedido.getClienteObj(), pedido.getMontoTotal(), pedido);

        if(pedido.isEstado()){
            PagaloYaMetodoPago paymentMethod = new PagaloYaMetodoPago();
            pedido.pagar(paymentMethod);
        }
        else{
            System.out.println("Order stopped");
        }
        pedidos.insertOne(pedido);
    }

    @Override
    public void delete(String id) {
        pedidos.deleteOne(new Document("_id", id));
    }

    @Override
    public Pedido find(String id) {
        //System.out.println("_id: " + id);
        return pedidos.find(eq("_id", id)).first();
    }

    @Override
    public List<Pedido> findAll() {
        List<Pedido> result = new LinkedList<>();

        for (Pedido Order : pedidos.find()) {
            //System.out.println("Order: " + Order);
            result.add(Order);
        }

        return result;
    }

    @Override
    public Pedido update(Pedido post, String id) {
        return pedidos.findOneAndReplace(new Document("_id", id), post, UPDATE_OPTIONS);
    }

    public void inspeccionEmpresa(Cliente cliObj, double montoTotal, Pedido order){
        IEmpresaInspeccion inspeccion;
        if(order.getMontoTotal()<10000){ //inspeccion basica
            inspeccion = new Inspeccion();
            inspeccion.inspeccionBasica(cliObj, order.getMontoTotal(),order);
            System.out.println("\n\nPedido Procesado?: "+order.isEstado());

        } else if (order.getMontoTotal()>=10000 && order.getMontoTotal()<20000) {
            //inspeccion basica + lavados de activos
            inspeccion = new LavadoActivosDecorator(new Inspeccion());
            inspeccion.inspeccionBasica(cliObj, order.getMontoTotal(), order);
            System.out.println("\n\nPedido Procesado?: "+order.isEstado());

        } else if (order.getMontoTotal()>=20000 && order.getMontoTotal()<40000) {
            //inspeccion basica + auditoria financera
            inspeccion = new AuditoriaFiDecorator(new Inspeccion());
            inspeccion.inspeccionBasica(cliObj, order.getMontoTotal(), order);
            System.out.println("\n\nPedido Procesado?: "+order.isEstado());

        } else if (order.getMontoTotal()>=40000) {
            //inspeccion basica + lavado de activos + auditoria financiera + auditoria reputacion
            inspeccion = new AuditoriaReDecorator(new AuditoriaFiDecorator(
                    new LavadoActivosDecorator(new Inspeccion())));
            inspeccion.inspeccionBasica(cliObj, order.getMontoTotal(), order);
            System.out.println("\n\nPedido Procesado?: "+order.isEstado());
        }
    }
    
}