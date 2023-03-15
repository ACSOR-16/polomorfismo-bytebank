public class TestCuentaExpectionSaldo {
    public static void main(String[] args) {
        Cuenta cuentaA = new CuentaAhorros(123, 1243);
        cuentaA.depositar(200);
        cuentaA.retirar(220);// se crea una expection
    }
}
