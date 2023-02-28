public class Gerente extends Funcionario implements Auntentificador{// con la palabra extends se hereda la clase padre
    //  Extedens para extender o seleccionar clase madre
    // sobrescritura de metodo
    public double getBonificacion() {
        System.out.println("Ejecutando test Gerente");
        return super.getSalario() + (super.getSalario() * 0.5);
    }

    @Override
    public void setClave(String clave) {
    }

    @Override
    public boolean inciarSesion(String clave) {
        return false;    
    }
}
