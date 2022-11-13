package tienda.Lab3_Pregunta1;

import tienda.models.Cliente;
import tienda.models.Pedido;

public interface IEmpresaInspeccion {
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden);
}
