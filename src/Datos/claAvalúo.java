
package Datos;


public class claAvalúo {
    private int idAvaluo;
    private double Area_Terreno;
    private double Area_Construccion;
    private double Depreciacion;
    private double Costo_Terreno;
    private double Costo_Construccion;
    private double Avalúo_Casa;
    private double Avalúo_Terreno;

    public claAvalúo(int idAvaluo, double Area_Terreno, double Area_Construccion, double Depreciacion, double Costo_Terreno, double Costo_Construccion, double Avalúo_Casa, double Avalúo_Terreno) {
        this.idAvaluo = idAvaluo;
        this.Area_Terreno = Area_Terreno;
        this.Area_Construccion = Area_Construccion;
        this.Depreciacion = Depreciacion;
        this.Costo_Terreno = Costo_Terreno;
        this.Costo_Construccion = Costo_Construccion;
        this.Avalúo_Casa = Avalúo_Casa;
        this.Avalúo_Terreno = Avalúo_Terreno;
    }

    public claAvalúo() {
    }

    public int getIdAvaluo() {
        return idAvaluo;
    }

    public void setIdAvaluo(int idAvaluo) {
        this.idAvaluo = idAvaluo;
    }

    public double getArea_Terreno() {
        return Area_Terreno;
    }

    public void setArea_Terreno(double Area_Terreno) {
        this.Area_Terreno = Area_Terreno;
    }

    public double getArea_Construccion() {
        return Area_Construccion;
    }

    public void setArea_Construccion(double Area_Construccion) {
        this.Area_Construccion = Area_Construccion;
    }

    public double getDepreciacion() {
        return Depreciacion;
    }

    public void setDepreciacion(double Depreciacion) {
        this.Depreciacion = Depreciacion;
    }

    public double getCosto_Terreno() {
        return Costo_Terreno;
    }

    public void setCosto_Terreno(double Costo_Terreno) {
        this.Costo_Terreno = Costo_Terreno;
    }

    public double getCosto_Construccion() {
        return Costo_Construccion;
    }

    public void setCosto_Construccion(double Costo_Construccion) {
        this.Costo_Construccion = Costo_Construccion;
    }

    public double getAvalúo_Casa() {
        return Avalúo_Casa;
    }

    public void setAvalúo_Casa(double Avalúo_Casa) {
        this.Avalúo_Casa = Avalúo_Casa;
    }

    public double getAvalúo_Terreno() {
        return Avalúo_Terreno;
    }

    public void setAvalúo_Terreno(double Avalúo_Terreno) {
        this.Avalúo_Terreno = Avalúo_Terreno;
    }
    
    
    
    
}
