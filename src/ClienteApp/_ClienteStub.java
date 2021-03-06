package ClienteApp;


public class _ClienteStub extends org.omg.CORBA.portable.ObjectImpl implements ClienteApp.Cliente
{

  public boolean insertarCliente (int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarCliente", true);
                $out.write_long (CL_ID);
                $out.write_wstring (CL_NOMBRE);
                $out.write_wstring (CL_DIRECCION);
                $out.write_long (CL_TEL);
                $out.write_wstring (CL_ESTADO);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarCliente

  public String consultarCliente (int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarCliente", true);
                $out.write_long (CL_ID);
                $out.write_wstring (CL_NOMBRE);
                $out.write_wstring (CL_DIRECCION);
                $out.write_long (CL_TEL);
                $out.write_wstring (CL_ESTADO);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarCliente

  public boolean eliminarCliente (int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarCliente", true);
                $out.write_long (CL_ID);
                $out.write_wstring (CL_NOMBRE);
                $out.write_wstring (CL_DIRECCION);
                $out.write_long (CL_TEL);
                $out.write_wstring (CL_ESTADO);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarCliente

  public boolean actualizarCliente (int CL_ID, String CL_NOMBRE, String CL_DIRECCION, int CL_TEL, String CL_ESTADO)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarCliente", true);
                $out.write_long (CL_ID);
                $out.write_wstring (CL_NOMBRE);
                $out.write_wstring (CL_DIRECCION);
                $out.write_long (CL_TEL);
                $out.write_wstring (CL_ESTADO);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarCliente

  public String listarCliente ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarCliente", true);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarCliente (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarCliente

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ClienteApp/Cliente:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ClienteStub
