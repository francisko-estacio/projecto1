
package Datos;


public class claInmueble {
    private String idInmueble;
    private String Ubicación;
    private String Dirección;
    private String Parroquia;
    private String Ciudad;
    private String Canton;

    public claInmueble(String idInmueble, String Ubicación, String Dirección, String Parroquia, String Ciudad, String Canton) {
        this.idInmueble = idInmueble;
        this.Ubicación = Ubicación;
        this.Dirección = Dirección;
        this.Parroquia = Parroquia;
        this.Ciudad = Ciudad;
        this.Canton = Canton;
    }

    public claInmueble() {
    }

    public String getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(String idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getUbicación() {
        return Ubicación;
    }

    public void setUbicación(String Ubicación) {
        this.Ubicación = Ubicación;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getParroquia() {
        return Parroquia;
    }

    public void setParroquia(String Parroquia) {
        this.Parroquia = Parroquia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    public String getUbicacón() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
