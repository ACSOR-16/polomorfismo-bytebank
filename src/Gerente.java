public class Gerente extends Funcionario {
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
}
