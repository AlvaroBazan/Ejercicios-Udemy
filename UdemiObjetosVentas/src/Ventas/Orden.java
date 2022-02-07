package Ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final  int MAXPRODUCTOS=10;

    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        //Esta linea es para inicializar el array.
        this.productos=new Producto[Orden.MAXPRODUCTOS];
    }
    public void agregarProducto(Producto producto){
        //Condicionamos que si el contador es mayor que MAXIMO DE PRODUCTOS QUE NO SE GUARDE
        if(this.contadorProductos<Orden.MAXPRODUCTOS){
            //para agregar el producto al array hay que indicar en que posicion se mete
            //Y por cada objeto de tipo producto que meta se va a incremetar el contador.
            this.productos[this.contadorProductos++]=producto;
        }else{
            System.out.println("se ha superado el máximo de productos"+ Orden.MAXPRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total=0;
        //hacemos un for con la dimension de los productos que esten en el array
        for (int i = 0; i < this.contadorProductos; i++) {
          //  Ventas.Producto producto=this.productos[i];// con esta variable obtenemos el producto en cada posicion del for
          //  total +=producto.getPrecio();// aqui llamo a la clase producto pero refiriendo
            // a la variable que he creado en la linea anterior producto
            total+=this.productos[i].getPrecio();// esta linea es la misma que las dos anteriores pero mas reducido
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("IdVentas: "+this.idOrden);
        double totalOrden=this.calcularTotal();

        System.out.println("Productos: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("Produtos: "+this.productos[i]);

        }
        System.out.println("Total de la orden: "+totalOrden);
    }
}
