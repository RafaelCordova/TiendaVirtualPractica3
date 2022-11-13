package tienda.Lab3_Pregunta1;


import tienda.Lab3_Pregunta3.interfaces.IEmpresaInspeccion;
import tienda.models.Cliente;
import tienda.models.Pedido;

public class Inspeccion implements IEmpresaInspeccion {

    @Override
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden) {
        inspeccionEconomica(cliente, montoTotal, orden);
        inspeccionarMultas(cliente);
    }
    public void inspeccionEconomica(Cliente cliente, double montoTotal, Pedido orden) {
        if(cliente.getClienteEmpresa().getCapitalDeTrabajo()<montoTotal) {
            System.out.println("Empresa sin capital de trabajo suficiente");
            orden.setEstado(false);

        }
        else{
            System.out.println("Empresa con capital de trabajo positivo");
            if(cliente.getClienteEmpresa().isLavadoActivos()!=true){
                orden.setEstado(true);
            }
        }
    }

    public void inspeccionarMultas(Cliente cliente) {
        if(cliente.getClienteEmpresa().isMultas()){
            System.out.println("Empresa con multas, tener precaucion.");
        }
        else{
            System.out.println("Empresa sin multas");
        }
    }
}
