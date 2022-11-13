package tienda.models;

public class ImpuestoExtranjero extends Impuesto {

    @Override
    public void CalcularImpuesto(Pedido order) {
        double impuestoExtranjero;
        impuestoExtranjero = order.getMontoTotal() * 0.06 + (order.getMontoTotal() * 1.06) * 0.19;
        System.out.println("Impuesto a pagar: " + impuestoExtranjero); //Derecho aduanero 6%, Iva 19%
                                                }
                                                    }


                                                    
