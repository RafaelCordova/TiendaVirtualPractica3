package tienda.Lab3_Pregunta2;

public abstract class TipoReparto {
    private String tipoR;
    private AbstractHorarioEntrega horarioEntrega;
    public abstract String definirTipoReparto();
    public abstract void definirReparto(AbstractHorarioEntrega horarioEntrega);
    public String getTipoR() {
        return tipoR;
    }
    public void setTipoR(String tipoR) {
        this.tipoR = tipoR;
    }
    @Override
    public String toString() {
        return "TipoReparto{" + "tipoR='" + tipoR + '\'' + ", abstractHorarioEntrega=" + horarioEntrega + '}';
    }
}