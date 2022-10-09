public class Dog extends Animal {

    private boolean lambe;
    private boolean irrita;
    private boolean morde;
    private boolean encheOSaco;

    public Dog(String nome,
               Integer idade,
               String genero,
               Dono dono,
               boolean lambe,
               boolean irrita,
               boolean morde,
               boolean encheOSaco) {

        super(nome, idade, genero, dono);
        this.lambe = lambe;
        this.irrita = irrita;
        this.morde = morde;
        this.encheOSaco = encheOSaco;
    }

    // Aqui eu fiz uma implementação do metodo fazer merda para dog
    // Vou fazer mais umas brincadeiras nesse metodo para diferencia-lo
    // do metodo do gato
    @Override
    public void fazerMerda(final String tipoDaMerda) {

        // Ou seja, eu posso fazer uma implementação diferente para
        // o mesmo metodo. Como assim? Se sao abstratos, eu vou la
        // estendo ou extendo da classe pai, e faço a implementação
        // q eu quiser. Vamos comparar.
        if ("Ser infernal".equals(tipoDaMerda)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Loira do banheiro!");
            }
        }

        // aqui eu neguei a operação com !
        if (!"Ser infernal".equals(tipoDaMerda)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Candy Man");
            }

            System.out.println("Fodeu!");
            System.out.println("Olha para tras!");
        }

        System.out.println(
                String.format("O que o cachorro é?? %s", tipoDaMerda)
        );
    }

    /*
    * Repara que o metodo "fazerMerda" esta sendo implementado
    * de formas totalmente diferente. A do cachorro eu fiz umas brincadeiras
    * a do gato eu nao fiz brincadeira nhm, so fiz a impressão no console.
    * Entendeu?
    * Mano, n to entendendo nd
    * manda no zap
    * */
}
