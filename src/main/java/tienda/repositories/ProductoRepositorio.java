package tienda.repositories;

import java.util.List;
import tienda.models.Producto;

public interface ProductoRepositorio {
    
    void create(Producto producto);

    Producto find(String id);

    List<Producto> findAll();

    Producto update(Producto post, String id);

    void delete(String id);
}
