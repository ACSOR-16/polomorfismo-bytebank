public class TestGerente {
    public static void main(String[] args) {
        //Funcionario gerente = new Funcionario(); //Siempre en cuando funcionario sea el padre
        Gerente gerente = new Gerente(); // accedo a la clase hija Gerente
        gerente.setNombre("oscar");
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setClave("Willfredo");
          
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.inciarSesion("Willfredo"));
    }
}
