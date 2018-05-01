import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
public class Cliente extends ClienteApp.ClientePOA {
    
    private ORB orb;
    Conexion conex = new Conexion();
    
    @Override
    public boolean insertarCliente(int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO) {
      boolean resultado=false;
        try {
            
            String query ="insert into Cliente(CL_ID,CL_NOMBRE,CL_DIRECCION,CL_TEL,CL_ESTADO)"
            + "value('"+ CL_ID+"','"+CL_NOMBRE+"','"+CL_DIRECCION+"','"+CL_TEL+"','"+CL_ESTADO+"')";
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
    public String consultarCliente(int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO) {
       String resultado ="";
        
        try {
            String query="Select * from cliente WHERE CL_ID="+CL_ID;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - " 
                        + rs.getString(2)+ " - "
                        + rs.getString(3)+ " - "
                        + rs.getLong(4)+ " - "
                        + rs.getString(5)+ "\n";
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
    public boolean eliminarCliente(int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarCliente(int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarCliente() {
        String resultado ="";
        
        try {
            String query="Select * from cliente";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                resultado += rs.getLong(1)+ " - " 
                        + rs.getString(2)+ " - "
                        + rs.getString(3)+ " - "
                        + rs.getLong(4)+ " - "
                        + rs.getString(5)+ "\n";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
