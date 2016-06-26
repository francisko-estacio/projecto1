
package Logica;

import Datos.claCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fCliente {
   private conexion mysql=new conexion();
   private Connection cn=mysql.conectar();
   private String sSQL="";
   public Integer totalregistros;
   
   
   public DefaultTableModel mostrar (String buscar){
       DefaultTableModel modelo;
       
       String [] titulos = {"ID","Primer Nombre","Segundo Nombre","Primer Apellido","Segundo Apellido", "Fecha Nacimiento","Edad","Dirección Domiciliaria","Teléfono","Email"};
       
       String [] registro =new String[10];
       
       totalregistros=0;
       modelo = new DefaultTableModel (null,titulos);
       
       sSQL="select * from cliente where Primer_Apellido like '%"+ buscar + "%'order by idCliente";
       
       try {
           Statement st= cn.createStatement();
           ResultSet rs=st.executeQuery(sSQL);
           
           while(rs.next()){
               registro[0]=rs.getString("idCliente");
               registro[1]=rs.getString("Primer_Nombre");
               registro[2]=rs.getString("Segundo_Nombre");
               registro[3]=rs.getString("Primer_Apellido");
               registro[4]=rs.getString("Segundo_Apellido");
               registro[5]=rs.getString("Fecha_Nacimiento");
               registro[6]=rs.getString("Edad");
               registro[7]=rs.getString("Dirección_Domiciliaria");
               registro[8]=rs.getString("Teléfono");
               registro[9]=rs.getString("Email");
               
               totalregistros=totalregistros+1;
               modelo.addRow(registro);
               
           } 
           return modelo;
           
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e);
           return null;
       }
   }
   
   public boolean insertar (claCliente dts){
       sSQL="insert into cliente (Primer_Nombre,Segundo_Nombre,Primer_Apellido,Segundo_Apellido,Fecha_Nacimiento,Edad,Dirección_Domiciliaria,Teléfono,Email)"+
                   "values (?,?,?,?,?,?,?,?,?)";
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1,dts.getPrimer_Nombre());
           pst.setString(2,dts.getSegundo_Nombre());
           pst.setString(3,dts.getPrimer_Apellido());
           pst.setString(4,dts.getSegundo_Apellido());
           pst.setString(5,dts.getFecha_Nacimiento());
           pst.setInt(6,dts.getEdad());
           pst.setString(7,dts.getDirección_Domiciliaria());
           pst.setDouble(8,dts.getTeléfono());
           pst.setString(9,dts.getEmail());
           
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
   
   public boolean editar (claCliente dts){
       sSQL="update cliente set Primer_Nombre=?,Segundo_Nombre=?,Primer_Apellido=?,Segundo_Apellido=?,Fecha_Nacimiento=?,Edad=?,Dirección_Domiciliaria=?,Teléfono=?,Email=?"+
               "where idCliente=?";    
       
       
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           pst.setString(1,dts.getPrimer_Nombre());
           pst.setString(2,dts.getSegundo_Nombre());
           pst.setString(3,dts.getPrimer_Apellido());
           pst.setString(4,dts.getSegundo_Apellido());
           pst.setString(5,dts.getFecha_Nacimiento());
           pst.setInt(6,dts.getEdad());
           pst.setString(7,dts.getDirección_Domiciliaria());
           pst.setDouble(8,dts.getTeléfono());
           pst.setString(9,dts.getEmail());
           pst.setDouble(10,dts.getIdCliente());
           
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
   
   public boolean eliminar (claCliente dts){
       
       sSQL="delete from cliente where idCliente=?";
       
       try {
           
           PreparedStatement pst=cn.prepareStatement(sSQL);
           
           pst.setDouble(1,dts.getIdCliente());
           
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
