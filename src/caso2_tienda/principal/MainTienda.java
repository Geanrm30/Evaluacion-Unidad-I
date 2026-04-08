package caso2_tienda.principal;

import java.util.Scanner;
import caso2_tienda.models.Producto;
import caso2_tienda.models.Venta;

public class MainTienda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Venta venta = new Venta();

        System.out.println("===== REGISTRO DE PRODUCTOS =====");
        System.out.print("¿Cuántos productos desea registrar?: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Producto[] productos = new Producto[n];

        // Registrar productos uno por uno con for
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Producto " + (i + 1) + " ---");

            System.out.print("Ingrese código del producto: ");
            String codigo = sc.nextLine();

            System.out.print("Ingrese nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese precio del producto: ");
            float precio = sc.nextFloat();

            System.out.print("Ingrese cantidad en stock: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            productos[i] = new Producto(codigo, nombre, precio, cantidad);
        }

        int opcion;

        do {
            System.out.println("\n===== MENÚ TIENDA =====");
            System.out.println("1. Mostrar todos los productos");
            System.out.println("2. Vender producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("\n===== LISTA DE PRODUCTOS =====");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println("\nProducto #" + (i + 1));
                        System.out.println(productos[i].mostrarProducto());
                    }
                    break;

                case 2:
                    System.out.println("\n===== PRODUCTOS DISPONIBLES =====");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i].getNombre() +
                                " | Código: " + productos[i].getCodigo() +
                                " | Stock: " + productos[i].getCantidad());
                    }

                    System.out.print("\nSeleccione el número del producto a vender: ");
                    int indice = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    if (indice >= 1 && indice <= productos.length) {
                        Producto productoSeleccionado = productos[indice - 1];

                        System.out.print("Ingrese cantidad a vender: ");
                        int cantidadVendida = sc.nextInt();
                        sc.nextLine(); // limpiar buffer

                        boolean vendido = venta.venderProducto(productoSeleccionado, cantidadVendida);

                        if (vendido) {
                            System.out.println("\nVenta realizada con éxito.");
                            System.out.println(venta.mostrarVenta(productoSeleccionado, cantidadVendida));
                        } else {
                            System.out.println("\nNo se pudo realizar la venta.");
                            System.out.println("Verifique la cantidad ingresada o el stock disponible.");
                        }

                    } else {
                        System.out.println("\nProducto no válido.");
                    }
                    break;

                case 3:
                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:
                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}