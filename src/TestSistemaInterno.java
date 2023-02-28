public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerenteUno = new Gerente();
        Administrador admin = new Administrador();

        sistema.autentificar(gerenteUno);
        sistema.autentificar(admin);
    } 
}