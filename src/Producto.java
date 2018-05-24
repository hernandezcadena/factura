import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
public class Producto extends ProductoApp.ProductoPOA {
     
    private ORB orb;
    Conexion conex = new Conexion();
    
    @Override
    public boolean insertarProducto(int pro_id, String pro_detalle, int pro_valor) {
      boolean resultado=false;
        try {
            
            String query ="insert into Producto(pro_id,pro_detalle,pro_valor)" + "value('"+ pro_id+"','"+pro_detalle+"','"+pro_valor+"')";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor =st.executeUpdate(query);
            if (valor >0){
                resultado=true;
                JOptionPane.showMessageDialog(null, "datos insertados correctamente");
            }
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public String consultarProducto(int pro_id, String pro_detalle, int pro_valor) {
        String resultado =""; 
        try {
            String query="Select * from producto WHERE pro_id="+pro_id;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - " 
                        + rs.getString(2)+ " - "
                        + rs.getLong(3)+ "\n";
                         
            }
            st.close();
            rs.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean eliminarProducto(int pro_id, String pro_detalle, int pro_valor) {
         boolean resultado=false;
        try {  
        String query ="delete from producto where pro_id = "+pro_id;
        conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor =st.executeUpdate(query);
            if (valor >0){
                resultado=true;
                JOptionPane.showMessageDialog(null, "datos eliminado correctamente");
            }
            st.close();
            conex.conex.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public boolean actualizarProducto(int pro_id, String pro_detalle, int pro_valor) {
        boolean resultado=false;
        try {
        String query ="update producto set pro_detalle = '"+pro_detalle+"',pro_valor= '"+pro_valor+"' where pro_id='"+pro_id+"'";
         conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor =st.executeUpdate(query);
            if (valor >0){
                resultado=true;
                JOptionPane.showMessageDialog(null, "datos insertados correctamente");
            }
            st.close();
            conex.conex.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public String listarProducto() {
        String resultado ="";
        
        try {
            String query="Select * from producto";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - " 
                        + rs.getString(2)+ " - "
                        + rs.getLong(3)+ "\n";
                       
            }
            st.close();
            rs.close();
            conex.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public ResultSet listaProductoss (){
        ResultSet resultado = null;
        
      try {
            String query = "Select pro_id, pro_detalle, pro_valor from producto";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado =st.executeQuery(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+ e.getMessage());
        }
        return resultado;
        
    }
}
