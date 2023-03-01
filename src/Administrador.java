public class Administrador extends Funcionario implements Auntentificador  {

    private AutentificadorUtil util;
    
    public Administrador() {
        this.util = new AutentificadorUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public boolean inciarSesion(String clave) {
        return this.util.inciarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }
}
