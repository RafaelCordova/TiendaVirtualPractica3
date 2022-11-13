package tienda.Lab3_Pregunta1;

import tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion;
import tienda.models.Cliente;
import tienda.models.Pedido;
import tienda.Lab3_Pregunta3.interfaces.*;

public class LavadoActivosDecorator extends BaseDecoratorInspeccion{
    public LavadoActivosDecorator(){

    }
    public LavadoActivosDecorator(IEmpresaInspeccion empresaInspeccion) {
        super(empresaInspeccion);
    }

    @Override
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden) {
        empresaInspeccion.inspeccionBasica(cliente, montoTotal, orden);
        inspeccionLavadoActivos(cliente);
    }

    public static void inspeccionLavadoActivos(Cliente cliente){
        if(cliente.getClienteEmpresa().isLavadoActivos()){
            System.out.println("Inspeccion Lavado Activos: Empresa en investigacion por lavado de activos");
        }
        else{
            System.out.println("Inspeccion Lavado Activos: Empresa en orden, " +
                    "sin investigacion por lavado de activos");
        }
    }
}
