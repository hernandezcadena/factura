import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;
public class Persona extends PersonaApp.PersonaPOA {
    
    private ORB orb;
    Conexion conex = new Conexion();
    
    @Override
    public boolean insertarPersona(int id, String nombre, String apellido, String telefono, String direccion, int identificacion) {
       
        boolean resultado = false;
        try {
            String query = "insert into persona (id, nombre, apellido, telefono, direccion, identificacion)" + "values ('"+id+"','"+nombre+"','"+apellido+"','"+telefono+"','"+direccion+"','"+identificacion+"')";
            
             conex.conexion();
             Statement st = conex.conex.createStatement();
             int valor = st.executeUpdate(query);
             if(valor > 0) {
                 resultado = true;
                 JOptionPane.showMessageDialog(null, "dato insertado");
             }
             //cerramos los recursos
             st.close();
             conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error"+e.getMessage());
        }
        return resultado;
    }

    @Override
    public String consultarPersona(int id) {
        String resultado="";
        try {
            String query = "SELECT * FROM persona WHERE id=" + id;
            conex.conexion();
            Statement st=conex.conex.createStatement();
            ResultSet rs= st.executeQuery(query);
            while (rs.next()){
                resultado+= rs.getLong(1)+" - "
                        +rs.getString(2)+" - "
                        +rs.getString(3)+" - "
                        +rs.getLong(4)+" - "
                        +rs.getString(5)+" - "
                        +rs.getLong(6) +"\n";
                        
            }
            //cerrramos los recursos
            st.close();
            rs.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+ e.getMessage());
        }
        return resultado;
    }
    

        @Override
    public boolean eliminarPersona(int id) {
             boolean resultado = false;
        try {
            String query = "DELETE FROM persona WHERE id="+id; 
                conex.conexion();
             Statement st = conex.conex.createStatement();
             int valor = st.executeUpdate(query);
             if(valor > 0) {
                 resultado = true;
                 JOptionPane.showMessageDialog(null, "dato eliminado");
             }
             //cerramos los recursos
             st.close();
             conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error"+e.getMessage());
        }
       
        return resultado;
    }

    @Override
    public boolean actualizarPersona(int id, String nombre, String apellido, String telefono, String direccion, int identificacion) {
        boolean resultado = false;
        try {
            String query = "update persona set nombre ='"+nombre+"', apellido ='"+apellido+"', telefono = '"+telefono+"', direccion ='"+direccion+"' , identificacion = '"+identificacion+"' where id ="+id; 
                conex.conexion();
             Statement st = conex.conex.createStatement();
             int valor = st.executeUpdate(query);
             if(valor > 0) {
                 resultado = true;
                 JOptionPane.showMessageDialog(null, "dato actualizado");
             }
             //cerramos los recursos
             st.close();
             conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error"+e.getMessage());
        }
       
        return resultado;
                
    }

    @Override
    public String listarPersonas() {
       String resultado="";
        try {
            String query = "SELECT * FROM persona";
            conex.conexion();
            Statement st=conex.conex.createStatement();
            ResultSet rs= st.executeQuery(query);
            while (rs.next()){
                resultado+= rs.getLong(1)+" - "
                        +rs.getString(2)+" - "
                        +rs.getString(3)+" - "
                        +rs.getLong(4)+" - "
                        +rs.getString(5)+" - "
                        +rs.getLong(6) +"\n";
                        
            }
            //cerrramos los recursos
            st.close();
            rs.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+ e.getMessage());
        }
        return resultado;
    
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ResultSet listaEstados(){
        ResultSet resultado = null;
        
        try {
            String query = "Select id, nombre from estado";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado =st.executeQuery(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrio un error"+ e.getMessage());
        }
        return resultado;
        
    }
}
