public abstract class Cuenta{
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total; 

    public Cuenta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        total ++;
    }

    public abstract void depositar(double valor);
    
    public void retirar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo = this.saldo - valor;
    }
    
    public boolean transferir(double valor, Cuenta cuentaDestino){
        if (this.saldo >= valor) {
            try {
                this.retirar(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            cuentaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }
    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal() {
        return total;
        //para accedet a total parte de la clase y no de la instancia
    }
}