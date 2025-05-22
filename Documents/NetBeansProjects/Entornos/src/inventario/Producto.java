package inventario;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public void crearProducto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }

    public void borrarDatos() {
        nombre = "";
        precio = 0.0;
        stock = 0;
    }
}