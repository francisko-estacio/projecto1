
package Datos;


public class claCaracteristicasInmueble {
    
    private int idCaracteristicas_Inmueble;
    private String Via_Acceso;
    private String Transporte_Público;
    private String Alumbrado_Público;
    private String Energía_Eléctrica;
    private String Alcantarillado;
    private String Agua_Potable;
    private String Redes_Telefónicas;
    private String Aceras_y_Bordillos;

    public claCaracteristicasInmueble(int idCaracteristicas_Inmueble, String Via_Acceso, String Transporte_Público, String Alumbrado_Público, String Energía_Eléctrica, String Alcantarillado, String Agua_Potable, String Redes_Telefónicas, String Aceras_y_Bordillos) {
        this.idCaracteristicas_Inmueble = idCaracteristicas_Inmueble;
        this.Via_Acceso = Via_Acceso;
        this.Transporte_Público = Transporte_Público;
        this.Alumbrado_Público = Alumbrado_Público;
        this.Energía_Eléctrica = Energía_Eléctrica;
        this.Alcantarillado = Alcantarillado;
        this.Agua_Potable = Agua_Potable;
        this.Redes_Telefónicas = Redes_Telefónicas;
        this.Aceras_y_Bordillos = Aceras_y_Bordillos;
    }

    public claCaracteristicasInmueble() {
    }

    public int getIdCaracteristicas_Inmueble() {
        return idCaracteristicas_Inmueble;
    }

    public void setIdCaracteristicas_Inmueble(int idCaracteristicas_Inmueble) {
        this.idCaracteristicas_Inmueble = idCaracteristicas_Inmueble;
    }

    public String getVia_Acceso() {
        return Via_Acceso;
    }

    public void setVia_Acceso(String Via_Acceso) {
        this.Via_Acceso = Via_Acceso;
    }

    public String getTransporte_Público() {
        return Transporte_Público;
    }

    public void setTransporte_Público(String Transporte_Público) {
        this.Transporte_Público = Transporte_Público;
    }

    public String getAlumbrado_Público() {
        return Alumbrado_Público;
    }

    public void setAlumbrado_Público(String Alumbrado_Público) {
        this.Alumbrado_Público = Alumbrado_Público;
    }

    public String getEnergía_Eléctrica() {
        return Energía_Eléctrica;
    }

    public void setEnergía_Eléctrica(String Energía_Eléctrica) {
        this.Energía_Eléctrica = Energía_Eléctrica;
    }

    public String getAlcantarillado() {
        return Alcantarillado;
    }

    public void setAlcantarillado(String Alcantarillado) {
        this.Alcantarillado = Alcantarillado;
    }

    public String getAgua_Potable() {
        return Agua_Potable;
    }

    public void setAgua_Potable(String Agua_Potable) {
        this.Agua_Potable = Agua_Potable;
    }

    public String getRedes_Telefónicas() {
        return Redes_Telefónicas;
    }

    public void setRedes_Telefónicas(String Redes_Telefónicas) {
        this.Redes_Telefónicas = Redes_Telefónicas;
    }

    public String getAceras_y_Bordillos() {
        return Aceras_y_Bordillos;
    }

    public void setAceras_y_Bordillos(String Aceras_y_Bordillos) {
        this.Aceras_y_Bordillos = Aceras_y_Bordillos;
    }
    
    
    
}
