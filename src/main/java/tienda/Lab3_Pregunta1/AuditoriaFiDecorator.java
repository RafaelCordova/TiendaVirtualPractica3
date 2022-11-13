package tienda.Lab3_Pregunta1;


import tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion;
import tienda.models.*;
import tienda.repositories.*;
import tienda.Lab3_Pregunta3.*;
import tienda.models.Cliente;
import tienda.models.Pedido;

public class AuditoriaFiDecorator extends BaseDecoratorInspeccion{
    public AuditoriaFiDecorator(){

    }
    public AuditoriaFiDecorator(IEmpresaInspeccion empresaInspeccion) {
        super(empresaInspeccion);
    }

    @Override
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden) {
        empresaInspeccion.inspeccionBasica(cliente, montoTotal, orden);
        inspeccionAFinanciera(cliente);
    }
    public static void inspeccionAFinanciera(Cliente cliente){
        if(cliente.getClienteEmpresa().getFondoDeSeguridad()<20000){
            System.out.println("Auditoria Financiera: Empresa, No cuenta con un fondo de seguridad apropiado");
        }
        else{
            System.out.println("Auditoria Financiera: Fondo de seguridad de deudas amplio");
        }
    }
}
