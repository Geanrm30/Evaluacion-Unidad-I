package caso1_banco.models;

public class Retiro {

    public boolean ejecutar(Cuenta cuenta, double monto) {

        // Validar que el monto sea mayor que 0
        if (monto <= 0) {
            return false;
        }

        // Validar que tenga fondos suficientes
        if (monto > cuenta.consultarSaldo()) {
            return false;
        }

        // Realizar el retiro
        double nuevoSaldo = cuenta.consultarSaldo() - monto;
        cuenta.setSaldo(nuevoSaldo);

        return true;
    }
}