package tienda.models;

public class PagaloYaMetodoPago implements MetodoPago{
   
    private String CodigoCip;
    
    @Override
    public  void pagarPedido(Pedido order){    CodeCipPayOrder(order); }

    public double devolverComision(Double montoTotal){ return montoTotal*0.10; }

    public void CodeCipPayOrder(Pedido order){
        System.out.println("Procesando el pago con Cip PagaloYa :"+getCipCodigo()+
        "\nTotal: "+order.getMontoTotal() + "\nComision: " +this.devolverComision(order.getMontoTotal()));
                                            }

    public String getCipCodigo() {
        if(this.CodigoCip == null){ setCipCodigo("A000000000000001"); }
        return CodigoCip;        }

    public void setCipCodigo(String CipCodigo){  this.CodigoCip=CipCodigo;  }
                                        }

