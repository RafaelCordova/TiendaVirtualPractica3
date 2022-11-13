package tienda.Lab3_Pregunta2;

public class ConcreteNoche extends AbstractHorarioEntrega{
    public ConcreteNoche() { }
    public void determinarHorarioEntrega() {
        this.setHorario("NOCHE --> HORARIO DE ENTREGA DE 3PM-6PM");
    }
}