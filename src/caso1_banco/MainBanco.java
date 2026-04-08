package caso1_banco;

import java.util.Scanner;
import caso1_banco.models.Cuenta;

public class MainBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== CREACIÓN DE CUENTA =====
        System.out.println("===== CREACIÓN DE CUENTA =====");

        System.out.print("Ingrese número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Ingrese saldo inicial: ");
        double saldo = sc.nextDouble();

        Cuenta cuenta = new Cuenta(numeroCuenta, saldo);

        System.out.println("\nCuenta creada correctamente.");
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());

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

                    // TODO: implementar lógica en clase Deposito
                    System.out.println("Monto ingresado: " + monto);
                    System.out.println("Función depósito aún no disponible.");
                    break;

                case 3:
                    System.out.println("Retirar dinero");
                    System.out.print("Ingrese el monto: ");
                    monto = sc.nextDouble();

                    // TODO: implementar lógica en clase Retiro
                    System.out.println("Monto ingresado: " + monto);
                    System.out.println("Función retiro aún no disponible.");
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
