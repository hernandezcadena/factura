package ClienteApp;

public abstract class ClientePOA extends org.omg.PortableServer.Servant
 implements ClienteApp.ClienteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarCliente", new java.lang.Integer (0));
    _methods.put ("consultarCliente", new java.lang.Integer (1));
    _methods.put ("eliminarCliente", new java.lang.Integer (2));
    _methods.put ("actualizarCliente", new java.lang.Integer (3));
    _methods.put ("listarCliente", new java.lang.Integer (4));
    _methods.put ("shutdown", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ClienteApp/Cliente/insertarCliente
       {
         int CL_ID = in.read_long ();
         String CL_NOMBRE = in.read_wstring ();
         String CL_DIRECCION = in.read_wstring ();
         int CL_TEL = in.read_long ();
         String CL_ESTADO = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // ClienteApp/Cliente/consultarCliente
       {
         int CL_ID = in.read_long ();
         String CL_NOMBRE = in.read_wstring ();
         String CL_DIRECCION = in.read_wstring ();
         int CL_TEL = in.read_long ();
         String CL_ESTADO = in.read_wstring ();
         String $result = null;
         $result = this.consultarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 2:  // ClienteApp/Cliente/eliminarCliente
       {
         int CL_ID = in.read_long ();
         String CL_NOMBRE = in.read_wstring ();
         String CL_DIRECCION = in.read_wstring ();
         int CL_TEL = in.read_long ();
         String CL_ESTADO = in.read_wstring ();
         boolean $result = false;
         $result = this.eliminarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // ClienteApp/Cliente/actualizarCliente
       {
         int CL_ID = in.read_long ();
         String CL_NOMBRE = in.read_wstring ();
         String CL_DIRECCION = in.read_wstring ();
         int CL_TEL = in.read_long ();
         String CL_ESTADO = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarCliente (CL_ID, CL_NOMBRE, CL_DIRECCION, CL_TEL, CL_ESTADO);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 4:  // ClienteApp/Cliente/listarCliente
       {
         String $result = null;
         $result = this.listarCliente ();
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 5:  // ClienteApp/Cliente/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ClienteApp/Cliente:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Cliente _this() 
  {
    return ClienteHelper.narrow(
    super._this_object());
  }

  public Cliente _this(org.omg.CORBA.ORB orb) 
  {
    return ClienteHelper.narrow(
    super._this_object(orb));
  }


} // class ClientePOA
