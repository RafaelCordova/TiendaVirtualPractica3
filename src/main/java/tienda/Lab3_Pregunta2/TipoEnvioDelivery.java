package tienda.Lab3_Pregunta2;

public class TipoEnvioDelivery extends TipoReparto{
    public String definirTipoReparto() {
        this.setTipoR("ENVIO POR DELIVERY AL CLIENTE");
        return this.getTipoR();
    }
    public void definirReparto(AbstractHorarioEntrega horarioEntrega){
        horarioEntrega.determinarHorarioEntrega();
        System.out.println("El tipo de reparto es " + definirTipoReparto() + " y con horario :" + horarioEntrega.getHorario());
    }
}