public class Gerente extends Funcionario {// con la palabra extends se hereda la clase padre
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

    public double getBonificacion() {
        return super.getSalario();
    }
}
