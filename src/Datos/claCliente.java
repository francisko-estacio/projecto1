
package Datos;


public class claCliente {
    private Double idCliente;
    private String Primer_Nombre;
    private String Segundo_Nombre;
    private String Primer_Apellido;
    private String Segundo_Apellido;
    private String Fecha_Nacimiento;
    private int Edad;
    private String Dirección_Domiciliaria;
    private Double Teléfono;
    private String Email;

    public claCliente(Double idCliente, String Primer_Nombre, String Segundo_Nombre, String Primer_Apellido, String Segundo_Apellido, String Fecha_Nacimiento, int Edad, String Dirección_Domiciliaria, Double Teléfono, String Email) {
        this.idCliente = idCliente;
        this.Primer_Nombre = Primer_Nombre;
        this.Segundo_Nombre = Segundo_Nombre;
        this.Primer_Apellido = Primer_Apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Edad = Edad;
        this.Dirección_Domiciliaria = Dirección_Domiciliaria;
        this.Teléfono = Teléfono;
        this.Email = Email;
    }

    public claCliente() {
    }

    public Double getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Double idCliente) {
        this.idCliente = idCliente;
    }

    public String getPrimer_Nombre() {
        return Primer_Nombre;
    }

    public void setPrimer_Nombre(String Primer_Nombre) {
        this.Primer_Nombre = Primer_Nombre;
    }

    public String getSegundo_Nombre() {
        return Segundo_Nombre;
    }

    public void setSegundo_Nombre(String Segundo_Nombre) {
        this.Segundo_Nombre = Segundo_Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDirección_Domiciliaria() {
        return Dirección_Domiciliaria;
    }

    public void setDirección_Domiciliaria(String Dirección_Domiciliaria) {
        this.Dirección_Domiciliaria = Dirección_Domiciliaria;
    }

    public Double getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(Double Teléfono) {
        this.Teléfono = Teléfono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUbicacón() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
