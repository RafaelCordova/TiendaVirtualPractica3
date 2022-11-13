package tienda.Lab3_Pregunta1;

import tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion;
import tienda.models.Cliente;
import tienda.models.Pedido;
import tienda.Lab3_Pregunta3.interfaces.*;

public class AuditoriaReDecorator extends BaseDecoratorInspeccion{
    public AuditoriaReDecorator(){

    }
    public AuditoriaReDecorator(IEmpresaInspeccion empresaInspeccion) {
        super(empresaInspeccion);
    }
    @Override
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden) {
        empresaInspeccion.inspeccionBasica(cliente, montoTotal, orden);
        inspeccionAReputacional(cliente);
    }

    public static void inspeccionAReputacional(Cliente cliente){
        if(cliente.getClienteEmpresa().getEva()>0){
            System.out.println("Auditoria Reputacional: Empresa con superavit en ganancias");
        }
        else{
            System.out.println("Auditoria Reputacional: Empresa sin superavit de ganancias. Tener precaucion");
        }
    }
}
