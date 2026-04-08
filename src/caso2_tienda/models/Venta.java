package caso2_tienda.models;

public class Venta {

    public Venta() {
    }

    public boolean venderProducto(Producto producto, int cantidadVendida) {
        if (cantidadVendida <= 0) {
            return false;
        }

        if (cantidadVendida > producto.getCantidad()) {
            return false;
        }

        producto.setCantidad(producto.getCantidad() - cantidadVendida);
        return true;
    }

    public float calcularTotal(Producto producto, int cantidadVendida) {
        return producto.getPrecio() * cantidadVendida;
    }

    public String mostrarVenta(Producto producto, int cantidadVendida) {
        return "===== VENTA =====" +
                "\nProducto: " + producto.getNombre() +
                "\nCódigo: " + producto.getCodigo() +
                "\nCantidad vendida: " + cantidadVendida +
                "\nTotal a pagar: " + calcularTotal(producto, cantidadVendida) +
                "\nStock restante: " + producto.getCantidad();
    }
}