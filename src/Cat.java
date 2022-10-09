public class Cat extends Animal {

    private boolean fede; // true or false

    public Cat(String nome, Integer idade, String genero, Dono dono, boolean fede) {
        super(nome, idade, genero, dono);
        this.fede = fede;
    }

    // Aqui eu fiz uma implementação do metodo fazer merda para cat
    @Override
    public void fazerMerda(final String tipoDaMerda) {
        System.out.println(tipoDaMerda);
    }
}


