public class ControlBonificacion {
    
    private double suma;

    public double registrarSalario(Funcionario funcionario) {
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Caculo actual: " + this.suma);
        return this.suma;
    }// funcionario replica los comportamientos no es necesario crear mas mas mas metods hijos
}
