package Ventas;

public class Producto {
    // se le pone final para poder leerla pero no modificarla
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto(){
        this.idProducto=++Producto.contadorProductos;
    }
    public Producto(String nombre, double precio){
        //Con este dis obtengo que se inicialice la variable de idproducto
        this();
        this.nombre=nombre;
        this.precio=precio;

    }

    public int getIdProducto() {
        return idProducto;
    }
    //Este metodo no lo voy a usar porque tengo la id con final por lo que no voy a pooder modificar el id.
   /* public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ventas.Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
