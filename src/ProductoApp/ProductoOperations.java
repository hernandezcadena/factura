package ProductoApp;


/**
* ProductoApp/ProductoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Producto.idl
* lunes 21 de mayo de 2018 08:00:26 PM COT
*/

public interface ProductoOperations 
{
  boolean insertarProducto (int pro_id, String pro_detalle, int pro_valor);
  String consultarProducto (int pro_id, String pro_detalle, int pro_valor);
  boolean eliminarProducto (int pro_id, String pro_detalle, int pro_valor);
  boolean actualizarProducto (int pro_id, String pro_detalle, int pro_valor);
  String listarProducto ();
  void shutdown ();
} // interface ProductoOperations
