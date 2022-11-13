package tienda.Lab3_Pregunta2;

public abstract class AbstractHorarioEntrega {
    private String horario;
    public abstract void determinarHorarioEntrega();
    public AbstractHorarioEntrega() { }
    public AbstractHorarioEntrega(String horario) {
        this.horario = horario;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    @Override
    public String toString() { return "AbstractHorarioEntrega{" +  "horario='" + horario + '\'' + '}'; }

}


