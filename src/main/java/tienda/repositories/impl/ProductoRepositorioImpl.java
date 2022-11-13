package tienda.repositories.impl;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import java.util.LinkedList;
import java.util.List;


import org.bson.Document;
import org.bson.types.ObjectId;
import tienda.models.Producto;
import tienda.repositories.ProductoRepositorio;

public class ProductoRepositorioImpl implements ProductoRepositorio {

    Producto ob1 = new Producto();

    private static final String COLLECTION_NAME = "productos";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

    private final MongoCollection<Producto> productos;

    public ProductoRepositorioImpl(MongoDatabase database) {
        this.productos = database.getCollection(COLLECTION_NAME, Producto.class);
    }

    @Override
    public void create(Producto product) {
        product.setId((new ObjectId()).toString());
        productos.insertOne(product);
        System.out.println("\nPRODUCTO REGISTRADO");
        System.out.println(ob1.imprimeDatosProducto(product));
                                            }       

    @Override
    public void delete(String id) {
        productos.deleteOne(new Document("_id", id));
    }

    @Override
    public Producto find(String id) {
        return productos.find(eq("_id", id)).first();
    }

    @Override
    public List<Producto> findAll() {
        List<Producto> result = new LinkedList<>();

        for (Producto Product : productos.find()) {
            result.add(Product);
        }

        return result;
    }

    @Override
    public Producto update(Producto post, String id) {
        return productos.findOneAndReplace(new Document("_id", id), post, UPDATE_OPTIONS);
    }
    
   
   

}
