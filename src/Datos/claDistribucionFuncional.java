
package Datos;


public class claDistribucionFuncional {
    private String idDistribución_Funcional_Bien;
    private String Exteriores;
    private String Planta_Alta;
    private String Planta_Baja;
    private String Distribucion_Actual;
    private String Fecha_Distribución_Actual;
    private String Distribución_Alternativa;
    private String Exteriores_Alternativos;
    private String Planta_Alta_Alternativa;
    private String Planta_Baja_Alternativa;

    public claDistribucionFuncional(String idDistribución_Funcional_Bien, String Exteriores, String Planta_Alta, String Planta_Baja, String Distribucion_Actual, String Fecha_Distribución_Actual, String Distribución_Alternativa, String Exteriores_Alternativos, String Planta_Alta_Alternativa, String Planta_Baja_Alternativa) {
        this.idDistribución_Funcional_Bien = idDistribución_Funcional_Bien;
        this.Exteriores = Exteriores;
        this.Planta_Alta = Planta_Alta;
        this.Planta_Baja = Planta_Baja;
        this.Distribucion_Actual = Distribucion_Actual;
        this.Fecha_Distribución_Actual = Fecha_Distribución_Actual;
        this.Distribución_Alternativa = Distribución_Alternativa;
        this.Exteriores_Alternativos = Exteriores_Alternativos;
        this.Planta_Alta_Alternativa = Planta_Alta_Alternativa;
        this.Planta_Baja_Alternativa = Planta_Baja_Alternativa;
    }

    public claDistribucionFuncional() {
    }

    public String getIdDistribución_Funcional_Bien() {
        return idDistribución_Funcional_Bien;
    }

    public void setIdDistribución_Funcional_Bien(String idDistribución_Funcional_Bien) {
        this.idDistribución_Funcional_Bien = idDistribución_Funcional_Bien;
    }

    public String getExteriores() {
        return Exteriores;
    }

    public void setExteriores(String Exteriores) {
        this.Exteriores = Exteriores;
    }

    public String getPlanta_Alta() {
        return Planta_Alta;
    }

    public void setPlanta_Alta(String Planta_Alta) {
        this.Planta_Alta = Planta_Alta;
    }

    public String getPlanta_Baja() {
        return Planta_Baja;
    }

    public void setPlanta_Baja(String Planta_Baja) {
        this.Planta_Baja = Planta_Baja;
    }

    public String getDistribucion_Actual() {
        return Distribucion_Actual;
    }

    public void setDistribucion_Actual(String Distribucion_Actual) {
        this.Distribucion_Actual = Distribucion_Actual;
    }

    public String getFecha_Distribución_Actual() {
        return Fecha_Distribución_Actual;
    }

    public void setFecha_Distribución_Actual(String Fecha_Distribución_Actual) {
        this.Fecha_Distribución_Actual = Fecha_Distribución_Actual;
    }

    public String getDistribución_Alternativa() {
        return Distribución_Alternativa;
    }

    public void setDistribución_Alternativa(String Distribución_Alternativa) {
        this.Distribución_Alternativa = Distribución_Alternativa;
    }

    public String getExteriores_Alternativos() {
        return Exteriores_Alternativos;
    }

    public void setExteriores_Alternativos(String Exteriores_Alternativos) {
        this.Exteriores_Alternativos = Exteriores_Alternativos;
    }

    public String getPlanta_Alta_Alternativa() {
        return Planta_Alta_Alternativa;
    }

    public void setPlanta_Alta_Alternativa(String Planta_Alta_Alternativa) {
        this.Planta_Alta_Alternativa = Planta_Alta_Alternativa;
    }

    public String getPlanta_Baja_Alternativa() {
        return Planta_Baja_Alternativa;
    }

    public void setPlanta_Baja_Alternativa(String Planta_Baja_Alternativa) {
        this.Planta_Baja_Alternativa = Planta_Baja_Alternativa;
    }
    
    
    
}
