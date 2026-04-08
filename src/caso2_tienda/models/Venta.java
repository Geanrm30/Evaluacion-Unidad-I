package caso2_tienda.models;

public class Venta {

    private float totalInventario;


    public Venta() {
        this.totalInventario = 0;
    }

// Procesar producto
    public void procesarProducto(Producto producto) {

        System.out.println("\n" + producto.mostrarProducto());

        float monto = producto.calcularMonto();
        System.out.println("Valor total: " + monto);

        if (producto.disponible()) {
            System.out.println("Disponible: Sí");
        } else {
            System.out.println("Disponible: No");
        }

        // Acumular total
        totalInventario += monto;
    }

    // Mostrar total final
    public void mostrarTotalInventario() {
        System.out.println("\n===== TOTAL INVENTARIO =====");
        System.out.println("Total acumulado: " + totalInventario);
    }
}