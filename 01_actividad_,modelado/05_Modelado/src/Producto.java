import java.util.Date;

public class Producto {
    private int codigo;
    private String nombre;
    private TipoProducto tipo;
    private Date fechaExpiracion;
    private String fabricante;
    private int cantidadInventario;
    private double precioUnitario;
    
    // Constructor
    public Producto(int codigo, String nombre, TipoProducto tipo, Date fechaExpiracion, String fabricante, int cantidadInventario, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.fabricante = fabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }
    
    // Métodos para obtener y establecer los atributos del producto
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public TipoProducto getTipo() {
        return tipo;
    }
    
    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }
    
    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }
    
    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    
    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public int getCantidadInventario() {
        return cantidadInventario;
    }
    
    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }
    
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
