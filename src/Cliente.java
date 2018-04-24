import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
public class Cliente extends ClienteApp.ClientePOA {
    
    private ORB orb;
    
    @Override
    public boolean insertarCliente(int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO) {
      boolean resultado=false;
        try {
            String query ="insert into Cliente(CL_ID,CL_NOMBRE,CL_DIRECCION,CL_TEL,CL_ESTADO)"
            + "value("+ CL_ID+","+CL_NOMBRE+","+CL_DIRECCION+","+CL_TEL+","+CL_ESTADO+")";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public String consultarCliente(int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
