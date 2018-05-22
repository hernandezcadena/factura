
public class Productos {
private int  pro_id;
private String pro_detalle; 
private int  pro_valor;
//colocar primero el constructor
public Productos (int id, String detalle, int valor){
setPro_id(id);
setPro_detalle(detalle);
setPro_valor(valor);
}

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_detalle() {
        return pro_detalle;
    }

    public void setPro_detalle(String pro_detalle) {
        this.pro_detalle = pro_detalle;
    }

    public int getPro_valor() {
        return pro_valor;
    }

    public void setPro_valor(int pro_valor) {
        this.pro_valor = pro_valor;
    }

}
