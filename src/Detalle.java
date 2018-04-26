import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
public class Detalle extends DetalleApp.DetallePOA {
    
    private ORB orb;
    Conexion conex = new Conexion();
    
    @Override
    public boolean insertarDetalle(int det_fac_id,int det_pro_id, int det_cantidad, int det_sub_total) {
      boolean resultado=false;
        try {
            String query ="insert into Cliente(FACTURA,PRODUCTO,CANTIDAD,SUB TOTAL)"
            + "value("+ det_fac_id+","+det_pro_id+","+det_cantidad+","+det_sub_total+")";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error"+e.getMessage());
        }
      return resultado;
    }

    @Override
    public String consultarDetalle(int det_fac_id,int det_pro_id, int det_cantidad, int det_sub_total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarDetalle(int det_fac_id,int det_pro_id, int det_cantidad, int det_sub_total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarDetalle(int det_fac_id,int det_pro_id, int det_cantidad, int det_sub_total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}