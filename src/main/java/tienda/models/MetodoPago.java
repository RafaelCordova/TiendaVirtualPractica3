package tienda.models;

public interface MetodoPago {
    public void pagarPedido(Pedido order);
    public double devolverComision(Double montoTotal);   
                            }
