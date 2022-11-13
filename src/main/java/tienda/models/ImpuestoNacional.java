package tienda.models;

public class ImpuestoNacional extends Impuesto {
    @Override
    public void CalcularImpuesto(Pedido order) {
        double impuestoNacional;
        impuestoNacional = 0.18 * order.getMontoTotal();
        System.out.println("Impuesto a pagar: " + impuestoNacional); //18%
                                                }
                                                    }
