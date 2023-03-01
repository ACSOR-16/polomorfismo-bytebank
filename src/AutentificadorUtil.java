public class AutentificadorUtil {
    private String clave;
    
    public boolean inciarSesion(String clave) {
        return this.clave == clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}

