package tienda.Lab3_Pregunta1;

import tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion;
import tienda.models.Cliente;
import tienda.models.Pedido;
import tienda.Lab3_Pregunta3.interfaces.*;

public class BaseDecoratorInspeccion implements tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion {
    protected tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion empresaInspeccion;
    public BaseDecoratorInspeccion(){
    }

    public BaseDecoratorInspeccion(tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion empresaInspeccion){

        this.empresaInspeccion = empresaInspeccion;
    }

    @Override
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden) {
        this.empresaInspeccion.inspeccionBasica(cliente, montoTotal, orden);
    }

    protected IEmpresaInspeccion getInspeccion(){
        return empresaInspeccion;
    }
}
