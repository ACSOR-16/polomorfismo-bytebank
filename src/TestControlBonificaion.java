public class TestControlBonificaion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente oscar = new Gerente();
        oscar.setSalario(10000);

        Contador alex = new Contador();
        alex.setSalario(5000);

        ControlBonificacion salarios = new ControlBonificacion();
        salarios.registrarSalario(diego);
        salarios.registrarSalario(oscar);
        salarios.registrarSalario(alex);
    }
}
