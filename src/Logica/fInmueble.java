
package Logica;

import Datos.claInmueble;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fInmueble {
    
     private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar (String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Ubicacion","Direccion","Parroquia","Ciudad", "Canton"};
       
       String [] registro =new String[6];
       
       totalregistros=0;
       modelo = new DefaultTableModel (null,titulos);
       
       sSQL="select * from Inmueble where idInmueble '%"+ buscar + "%'order by idInmueble";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro[0]=rs.getString("idInmueble");
               registro[1]=rs.getString("Ubicación");
               registro[2]=rs.getString("Dirección");
               registro[3]=rs.getString("Parroquia");
               registro[4]=rs.getString("Ciudad");
               registro[5]=rs.getString("Canton");
               
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           } 
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
   }
   
   public boolean insertar (claInmueble dts){
       sSQL="insert into Inmueble (Ubicación,Dirección,Parroquia,Ciudad,Canton)"+
                   "values (?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1,dts.getUbicacón());
           pst.setString(2,dts.getDirección());
           pst.setString(3,dts.getParroquia());
           pst.setString(4,dts.getCiudad());
           pst.setString(5,dts.getCanton());
           
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else{
               return false;
           }
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
       
       
   }
   
   public boolean editar (claInmueble dts){
       sSQL="update Cliente set Primer_Nombre=?,Segundo_Nombre=?,Primer_Apellido=?,Segundo_Apellido=?,Fecha_Nacimiento=?,Edad=?,Dirección_Domiciliaria=?,Teléfono=?,Email=?"+
               "where idCliente=?";    
       
       
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1,dts.getUbicacón());
           pst.setString(2,dts.getDirección());
           pst.setString(3,dts.getParroquia());
           pst.setString(4,dts.getCiudad());
           pst.setString(5,dts.getCanton());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else{
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
       
   }
   
   public boolean eliminar (claInmueble dts){
       
       sSQL="delete from Cliente where idCliente=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setString(1,dts.getIdInmueble());
           
           int n=pst.executeUpdate();
           
           if (n!=0){
               return true;
           }
           else{
               return false;
           }
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return false;
       }
       
   }
    
}
