package tienda.Lab3_Pregunta4.repositories;

import java.util.List;

import tienda.Lab3_Pregunta4.models.Entrega;

public interface EntregasRepositorio {
    
    void create(Entrega entrega); 

    List<Entrega> findAll();
}
