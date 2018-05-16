package DetalleApp;


/**
* DetalleApp/DetalleHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from detalle.idl
* mi�rcoles 25 de abril de 2018 11:17:34 AM COT
*/

abstract public class DetalleHelper
{
  private static String  _id = "IDL:DetalleApp/Detalle:1.0";

  public static void insert (org.omg.CORBA.Any a, DetalleApp.Detalle that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DetalleApp.Detalle extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DetalleApp.DetalleHelper.id (), "Detalle");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DetalleApp.Detalle read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DetalleStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DetalleApp.Detalle value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static DetalleApp.Detalle narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DetalleApp.Detalle)
      return (DetalleApp.Detalle)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DetalleApp._DetalleStub stub = new DetalleApp._DetalleStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DetalleApp.Detalle unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DetalleApp.Detalle)
      return (DetalleApp.Detalle)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      DetalleApp._DetalleStub stub = new DetalleApp._DetalleStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
