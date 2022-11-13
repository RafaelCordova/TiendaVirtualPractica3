package tienda.Lab3_Pregunta4.repositories.Impl;

import java.util.LinkedList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;

import tienda.Lab3_Pregunta4.models.Entrega;
import tienda.Lab3_Pregunta4.repositories.EntregasRepositorio;

public class EntregasRepositorioImpl implements EntregasRepositorio{

    Entrega entrega1 = new Entrega();

    private static final String COLLECTION_NAME = "entregas";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

    private final MongoCollection<Entrega> entregas;

    public EntregasRepositorioImpl(MongoDatabase database) {
        this.entregas = database.getCollection(COLLECTION_NAME, Entrega.class);
    }


    @Override
    public void create(Entrega entrega) {
        entrega.setId((new ObjectId()).toString());
        entregas.insertOne(entrega);
        System.out.println("\nEntrega registrada");
       // System.out.println(entrega1.imprimeDatosEntrega(entrega));
        
    }
    
    @Override
    public List<Entrega> findAll() {
        List<Entrega> result = new LinkedList<>();

        for (Entrega entrega : entregas.find()) {
            result.add(entrega);
        }

        return result;
    }


}
