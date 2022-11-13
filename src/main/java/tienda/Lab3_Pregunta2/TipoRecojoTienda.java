package tienda.Lab3_Pregunta2;

public class TipoRecojoTienda extends TipoReparto{
    public String definirTipoReparto() {
        this.setTipoR("RECOJO EN TIENDA POR PARTE DEL CLIENTE");
        return this.getTipoR();
    }
    public void definirReparto(AbstractHorarioEntrega horarioEntrega){
        horarioEntrega.determinarHorarioEntrega();
        System.out.println("El tipo de reparto es " + definirTipoReparto() + " y con horario :" + horarioEntrega.getHorario());
    }
}