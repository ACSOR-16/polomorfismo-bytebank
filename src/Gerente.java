public class Gerente extends Funcionario {// con la palabra extends se hereda la clase padre
    //  Extedens para extender o seleccionar clase madre
    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }
    public String getClave() {
        return clave;
    }

    public boolean inciarSesion(String clave){
        return clave == "Willfredo";
    }

    // sobrescritura de metodo
    public double getBonificacion() {
        System.out.println("Ejecutando test Gerente");
        return super.getSalario() + super.getBonificacion();
    }
}
