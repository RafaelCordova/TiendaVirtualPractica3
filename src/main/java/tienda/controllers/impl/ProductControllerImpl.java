package tienda.controllers.impl;

import io.javalin.http.BadRequestResponse;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;
import tienda.config.Paths;
import tienda.controllers.ProductController;
import tienda.models.Producto;
import tienda.repositories.ProductoRepositorio;

public class ProductControllerImpl implements ProductController{
    private static final String ID = "id";

    private ProductoRepositorio productRepository;

    public ProductControllerImpl(ProductoRepositorio postRepository) {
        this.productRepository = postRepository;
    }

    @Override
    public void create(Context context) {
        
        Producto product = context.bodyAsClass(Producto.class);
        System.out.println("Producto: " + product);

        
        //System.out.println("pruebaProductoValidator: "+context.bodyValidator(Producto.class));

       // Producto product2 = context.bodyValidator(Producto.class));

        productRepository.create(product);
        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(product.getId().toString()));
                System.out.println("pruebaProducto: "+context.formParam("producto"));
    }

    @Override
    public void delete(Context context) {
        productRepository.delete(context.pathParam(ID));

    }

    @Override
    public void find(Context context) {
        String id = context.pathParam(ID);
        Producto Product = productRepository.find(id);
        
        if (Product == null) {
            throw new NotFoundResponse(String.format("A Product with id '%s' is not found", id));
        }
        context.json(Product);

    }

    @Override
    public void findAll(Context context) {
        context.json(productRepository.findAll());
    }

    @Override
    public void update(Context context) {
        Producto product = context.bodyAsClass(Producto.class);
        String id = context.pathParam(ID);

        if (product.getId() != null && !product.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }

        productRepository.update(product, id);

    }
}

