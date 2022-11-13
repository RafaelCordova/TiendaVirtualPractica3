package tienda.models;

public class Direccion {
    private String pais;
    private String referencia;
    private int lote;
    private String manzana;

    public Direccion() { }

    public Direccion(String pais, String referencia, int lote, String manzana) {
        this.pais = pais;
        this.referencia = referencia;
        this.lote = lote;
        this.manzana = manzana;
    }

    public int getLote() {
        return lote;
    }
    public void setLote(int lote) {
        this.lote = lote;
    }
    public String getManzana() {
        return manzana;
    }
    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
