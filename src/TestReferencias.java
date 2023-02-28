public class TestReferencias {
    public static void main(String[] args) {
        // elemento mas generico puede ser adaptado al elemento especifico
        Funcionario carlitos = new Gerente();//ref madre - hijo
        carlitos.setNombre("Carlitos");

        Gerente oscar = new Gerente();//no ref hijo - madre
        oscar.setNombre("Oscar");

        carlitos.setSalario(1800);
        oscar.setSalario(2500);
        oscar.setClave("Willfredo");
        //carlitos.inciarSesion();// la referencia es de tipo generico

        System.out.println(oscar.inciarSesion("Willfredo"));
    }
}
