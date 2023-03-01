public class Cliente implements Auntentificador{
    
    private String telefono;
    private String nombre;
    private String documento;

    private AutentificadorUtil util;

    public Cliente() {
        this.util = new AutentificadorUtil();
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getDocumento() {
        return documento;
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