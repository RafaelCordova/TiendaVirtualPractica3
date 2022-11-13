package tienda.models;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class BlockChainMetodoPago implements MetodoPago {

    private String walletId;
    
    @Override
    public  void pagarPedido(Pedido order){   walletPayOrder(order); }

    public double devolverComision(Double montoTotal){ return montoTotal*0.05; }

    public void walletPayOrder(Pedido order){
        System.out.println("Procesando el pago con wallet "+getWalletId()+
        " | total: "+order.getMontoTotal() + " comision: " +this.devolverComision(order.getMontoTotal()));  }

    public String getWalletId() {
        if(this.walletId == null){
            UUID uuid = Generators.timeBasedGenerator().generate();
            setWalletId(uuid.toString());
                                 }
        return walletId;
                                }

    public void setWalletId(String walletId){   this.walletId = walletId; }
}
