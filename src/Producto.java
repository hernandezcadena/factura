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
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean eliminarProducto(int pro_id, String pro_detalle, int pro_valor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean actualizarProducto(int pro_id, String pro_detalle, int pro_valor) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String listarProducto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
