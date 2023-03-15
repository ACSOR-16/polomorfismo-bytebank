public class TestCuentaExpectionSaldo {
    public static void main(String[] args) {
        Cuenta cuentaA = new CuentaAhorros(123, 1243);
        cuentaA.depositar(200);
        try {
            cuentaA.retirar(220);
            cuentaA.retirar(20);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }// se crea una expection
    }
}
