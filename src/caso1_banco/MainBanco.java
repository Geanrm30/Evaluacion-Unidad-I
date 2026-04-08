package caso1_banco;

import java.util.Scanner;
import caso1_banco.models.Cuenta;
import caso1_banco.models.Cliente;
import caso1_banco.models.Deposito;
import caso1_banco.models.Retiro;

public class MainBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== CREACIÓN DE CUENTA =====
        System.out.println("===== DATOS DEL CLIENTE =====");

        System.out.print("Ingrese identificación: ");
        String identificacion = sc.nextLine();

        System.out.print("Ingrese nombres: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Ingrese teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Ingrese dirección: ");
        String direccion = sc.nextLine();

        Cliente cliente = new Cliente(identificacion, nombres, apellidos, telefono, direccion);

        System.out.println("\n===== CREACIÓN DE CUENTA =====");

        System.out.print("Ingrese número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Ingrese saldo inicial: ");
        double saldo = sc.nextDouble();

        Cuenta cuenta = new Cuenta(numeroCuenta, saldo, cliente);

        System.out.println("\nCliente registrado correctamente.");
        System.out.println(cliente.mostrarCliente());

        System.out.println("\nCuenta creada correctamente.");
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());

        Retiro retiro = new Retiro();
        Deposito deposito = new Deposito();

        // ===== MENÚ =====
        int opcion;
        double monto;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    break;

                case 2:
                    System.out.println("Depositar dinero");
                    System.out.print("Ingrese el monto: ");
                    monto = sc.nextDouble();

                    if (deposito.ejecutar(cuenta, monto)) {
                        System.out.println("Depósito realizado correctamente.");
                        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    } else {
                        System.out.println("No se pudo realizar el depósito.");
                        System.out.println("Verifique que el monto sea mayor a 0.");
                    }
                    break;

                case 3:
                    System.out.println("Retirar dinero");
                    System.out.print("Ingrese el monto: ");
                    monto = sc.nextDouble();

                    if (retiro.ejecutar(cuenta, monto)) {
                        System.out.println("Retiro realizado correctamente.");
                        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    } else {
                        System.out.println("No se pudo realizar el retiro.");
                        System.out.println("Verifique que el monto sea mayor a 0 y que tenga saldo suficiente.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
