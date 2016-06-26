
package Datos;


public class claEdadBien {
    private int idEdad_Bien;
    private String Fecha_de_Construcción;
    private String Mantenimiento;
    private String Implantación;

    public claEdadBien(int idEdad_Bien, String Fecha_de_Construcción, String Mantenimiento, String Implantación) {
        this.idEdad_Bien = idEdad_Bien;
        this.Fecha_de_Construcción = Fecha_de_Construcción;
        this.Mantenimiento = Mantenimiento;
        this.Implantación = Implantación;
    }

    public claEdadBien() {
    }

    public int getIdEdad_Bien() {
        return idEdad_Bien;
    }

    public void setIdEdad_Bien(int idEdad_Bien) {
        this.idEdad_Bien = idEdad_Bien;
    }

    public String getFecha_de_Construcción() {
        return Fecha_de_Construcción;
    }

    public void setFecha_de_Construcción(String Fecha_de_Construcción) {
        this.Fecha_de_Construcción = Fecha_de_Construcción;
    }

    public String getMantenimiento() {
        return Mantenimiento;
    }

    public void setMantenimiento(String Mantenimiento) {
        this.Mantenimiento = Mantenimiento;
    }

    public String getImplantación() {
        return Implantación;
    }

    public void setImplantación(String Implantación) {
        this.Implantación = Implantación;
    }
    
    
    
    
    
}
