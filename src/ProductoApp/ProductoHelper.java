package ProductoApp;


/**
* ProductoApp/ProductoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Producto.idl
* lunes 21 de mayo de 2018 08:00:26 PM COT
*/

abstract public class ProductoHelper
{
  private static String  _id = "IDL:ProductoApp/Producto:1.0";

  public static void insert (org.omg.CORBA.Any a, ProductoApp.Producto that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ProductoApp.Producto extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ProductoApp.ProductoHelper.id (), "Producto");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ProductoApp.Producto read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ProductoStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ProductoApp.Producto value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ProductoApp.Producto narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProductoApp.Producto)
      return (ProductoApp.Producto)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ProductoApp._ProductoStub stub = new ProductoApp._ProductoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ProductoApp.Producto unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProductoApp.Producto)
      return (ProductoApp.Producto)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ProductoApp._ProductoStub stub = new ProductoApp._ProductoStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
