
package Datos;


public class claLinderosyDimensiones {
    
    private int idLinderos_Dimensiones;
    private String Norte;
    private String Sur;
    private String Este;
    private String Oeste;
    private float Area_Total;

    public claLinderosyDimensiones(int idLinderos_Dimensiones, String Norte, String Sur, String Este, String Oeste, float Area_Total) {
        this.idLinderos_Dimensiones = idLinderos_Dimensiones;
        this.Norte = Norte;
        this.Sur = Sur;
        this.Este = Este;
        this.Oeste = Oeste;
        this.Area_Total = Area_Total;
    }

    public claLinderosyDimensiones() {
    }

    public int getIdLinderos_Dimensiones() {
        return idLinderos_Dimensiones;
    }

    public void setIdLinderos_Dimensiones(int idLinderos_Dimensiones) {
        this.idLinderos_Dimensiones = idLinderos_Dimensiones;
    }

    public String getNorte() {
        return Norte;
    }

    public void setNorte(String Norte) {
        this.Norte = Norte;
    }

    public String getSur() {
        return Sur;
    }

    public void setSur(String Sur) {
        this.Sur = Sur;
    }

    public String getEste() {
        return Este;
    }

    public void setEste(String Este) {
        this.Este = Este;
    }

    public String getOeste() {
        return Oeste;
    }

    public void setOeste(String Oeste) {
        this.Oeste = Oeste;
    }

    public float getArea_Total() {
        return Area_Total;
    }

    public void setArea_Total(float Area_Total) {
        this.Area_Total = Area_Total;
    }
    
    
    
}
