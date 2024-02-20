import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Producto> productos;
    
    // Constructor
    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }
    
    // Método para agregar un producto a la tienda
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    // Método para obtener la lista de productos de la tienda
    public List<Producto> getProductos() {
        return productos;
    }
    
    // Métodos para obtener y establecer el nombre, dirección y teléfono
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
