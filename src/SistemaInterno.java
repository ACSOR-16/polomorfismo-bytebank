public class SistemaInterno{
    private String clave = "2344";
    public boolean autentificar(Auntentificador gerente) {
        boolean puedeIniciarSesion = gerente.inciarSesion(clave);
        if (puedeIniciarSesion) {
            System.out.println("login exitoso");
            return true;
        } else {
            System.out.println("error en autentificacion");
            return false;
        }
    }
}
