package tienda.Lab3_Pregunta3;


import tienda.models.Cliente;

import java.util.HashMap;
import java.util.Map;

public class AbreviaturasFlyweightFactory extends Cliente {

    private static HashMap<String, String> cacheAbreviaturas = new HashMap<String, String>();

    public AbreviaturasFlyweightFactory() { }

    public static String getOperacionAbreviatura(String pais) {
        HashMap<String, String> abreviaturaPais = AbreviaturasFlyweightFactory.cacheAbreviaturas;
        AbreviaturasFlyweightFactory obj = new AbreviaturasFlyweightFactory();
        obj.cargaMemoriaCache();
        String paisAbreviado = "";
        for (Map.Entry<String, String> entry : abreviaturaPais.entrySet()) {
            String clave = entry.getKey();
            String valorAbreviado = entry.getValue();
            if (clave.equalsIgnoreCase(pais)) {
                paisAbreviado = valorAbreviado;
                return paisAbreviado;
            }
        }
        paisAbreviado = String.valueOf(pais.charAt(0)) + String.valueOf(pais.charAt(1));
        cacheAbreviaturas.put(pais,paisAbreviado);
        return paisAbreviado;
    }

    public static HashMap<String, String> getCacheAbreviaturas() {
        return cacheAbreviaturas;
    }

    public void cargaMemoriaCache() {
        cacheAbreviaturas.put("PERU", "PE");
        cacheAbreviaturas.put("BOLIVIA", "BOL");
        cacheAbreviaturas.put("ECUADOR", "EC");
        cacheAbreviaturas.put("ESTADOS UNIDOS", "EEUU");
        cacheAbreviaturas.put("VENEZUELA", "VEN");
        cacheAbreviaturas.put("CHILE", "CH");
        cacheAbreviaturas.put("BRASIL", "BR");
        cacheAbreviaturas.put("URUGUAY", "URU");
        cacheAbreviaturas.put("ARGENTINA", "ARG");
        cacheAbreviaturas.put("EL SALVADOR", "ES");
        cacheAbreviaturas.put("MEXICO", "MEX");
        cacheAbreviaturas.put("RUSIA", "RUS");
        cacheAbreviaturas.put("FRANCIA", "FRA");
        cacheAbreviaturas.put("INGLATERRA", "ING");
        cacheAbreviaturas.put("LA INDIA", "LA");
    }

}
