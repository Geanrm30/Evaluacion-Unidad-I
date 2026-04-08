package caso1_banco.models;

public class Deposito {
    public boolean ejecutar(Cuenta cuenta, double monto) {

        // Validar monto
        if (monto <= 0) {
            return false;
        }

        // Realizar depósito usando la cuenta
        double nuevoSaldo = cuenta.consultarSaldo() + monto;
        cuenta.setSaldo(nuevoSaldo);

        return true;
    }
}