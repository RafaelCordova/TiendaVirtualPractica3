package tienda.models;

public class ClienteEmpresa {
    private double capitalDeTrabajo; //inspeccion economica
    private boolean multas; //inspeccion multas
    private boolean lavadoActivos; //inspeccion lavado de activos
    private double fondoDeSeguridad; // inspeccion financiera
    private double eva; //auditoria reputacional mala <0 - auditoria financiera buena > 0 (genera +ganancias)

    public ClienteEmpresa() {
    }

    public double getCapitalDeTrabajo() {
        return capitalDeTrabajo;
    }

    public void setCapitalDeTrabajo(double capitalDeTrabajo) {
        this.capitalDeTrabajo = capitalDeTrabajo;
    }

    public boolean isMultas() {
        return multas;
    }

    public void setMultas(boolean multas) {
        this.multas = multas;
    }

    public boolean isLavadoActivos() {
        return lavadoActivos;
    }

    public void setLavadoActivos(boolean lavadoActivos) {
        this.lavadoActivos = lavadoActivos;
    }

    public double getFondoDeSeguridad() {
        return fondoDeSeguridad;
    }

    public void setFondoDeSeguridad(double fondoDeSeguridad) {
        this.fondoDeSeguridad = fondoDeSeguridad;
    }

    public double getEva() {
        return eva;
    }

    public void setEva(double eva) {
        this.eva = eva;
    }

    @Override
    public String toString() {
        return "Informacion Financiera ClienteEmpresa {" +
                "\nCapitalDeTrabajo= " + capitalDeTrabajo +
                "\nMultas= " + multas +
                "\nLavadoActivos= " + lavadoActivos +
                "\nFondoDeSeguridad= " + fondoDeSeguridad +
                "\nEva=" +eva+
                "\n";
    }
}
