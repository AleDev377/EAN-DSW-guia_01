import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Tienda tienda = new Tienda("Mi Tienda", "Calle Principal 123", "123-456-7890");

        // Crear algunos productos
        Producto producto1 = new Producto(1, "Leche", TipoProducto.LACTEO, new Date(),
                "Fabricante1", 100, 2500);
        Producto producto2 = new Producto(2, "Carne", TipoProducto.CARNICO, new Date(),
                "Fabricante2", 50, 5000);
        Producto producto3 = new Producto(3, "Manzana", TipoProducto.FRUTA, new Date(),
                "Fabricante3", 200, 1000);
        Producto producto4 = new Producto(4, "Atún", TipoProducto.ENLATADO, new Date(),
                "Fabricante4", 80, 3000);

        // Agregar los productos a la tienda
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        tienda.agregarProducto(producto4);

        // Mostrar la información de la tienda
        System.out.println("Información de la tienda:");
        System.out.println("Nombre: " + tienda.getNombre());
        System.out.println("Dirección: " + tienda.getDireccion());
        System.out.println("Teléfono: " + tienda.getTelefono());
        System.out.println();

        // Mostrar la información de los productos en la tienda
        System.out.println("Productos en la tienda:");
        for (Producto producto : tienda.getProductos()) {
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Tipo: " + producto.getTipo());
            System.out.println("Fecha de Expiración: " + producto.getFechaExpiracion());
            System.out.println("Fabricante: " + producto.getFabricante());
            System.out.println("Cantidad en Inventario: " + producto.getCantidadInventario());
            System.out.println("Precio Unitario: " + producto.getPrecioUnitario());
            System.out.println();
        }
    }
}