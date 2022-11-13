package tienda.models;

public class BancoMetodoPago implements MetodoPago {

    private String bankId;
    
    @Override
    public  void pagarPedido(Pedido order){
        bankPayOrder(order);            }

    public double devolverComision(Double montoTotal){    return montoTotal*0.15;  }

    public void bankPayOrder(Pedido order){
        System.out.println("Procesando el pago con Banco "+getBankId()+
        " | total: "+order.getMontoTotal() + " comision: " +this.devolverComision(order.getMontoTotal())); }

    public String getBankId() {
        if(this.bankId == null){ setBankId("B90000000001"); }
        return bankId;
                             }

    public void setBankId(String bankId){   this.bankId = bankId; }
                                                    }