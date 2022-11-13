package tienda.Lab3_Pregunta3.interfaces;

import tienda.models.Cliente;
import tienda.models.Pedido;

public interface IEmpresaInspeccion {
    public void inspeccionBasica(Cliente cliente, double montoTotal, Pedido orden);
}
