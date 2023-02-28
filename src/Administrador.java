public class Administrador extends Funcionario implements Auntentificador  {

    private String clave;

    public Administrador() {
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
       this.clave = clave;
    }

    @Override
    public boolean inciarSesion(String clave) {
        if (this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }
}
