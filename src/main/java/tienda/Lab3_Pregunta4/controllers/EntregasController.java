package tienda.Lab3_Pregunta4.controllers;



import org.jetbrains.annotations.NotNull;

import io.javalin.http.Context;

public interface EntregasController {
    void create(@NotNull Context context);

    void findAll(@NotNull Context context);
}


