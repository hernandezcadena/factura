package ClienteApp;

/**
* ClienteApp/ClienteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cliente.idl
* lunes 23 de abril de 2018 07:41:14 PM COT
*/

public final class ClienteHolder implements org.omg.CORBA.portable.Streamable
{
  public ClienteApp.Cliente value = null;

  public ClienteHolder ()
  {
  }

  public ClienteHolder (ClienteApp.Cliente initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ClienteApp.ClienteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ClienteApp.ClienteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ClienteApp.ClienteHelper.type ();
  }

}
