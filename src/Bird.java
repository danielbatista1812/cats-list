public class Bird extends Animal {

    private final String tipo;
    private final boolean voa;

    public boolean isVoa() {
        return voa;
    }

    public Bird(String nome, Integer idade, String genero, Dono dono, boolean voa, String tipo) {
        super(nome, idade, genero, dono);
        this.voa = voa;
        this.tipo = tipo;

    }

    @Override
    public void fazerMerda(String tipoDaMerda) {

        if ("Tucano".equals(tipo)) {
            System.out.println("Ola Tucano, lambecano");
        }
        if ("Bentivi".equals(tipo)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("BENTIVI");

            }
        }
        if ("Pombo".equals(tipo)) {
            System.out.println("Pegue o pombo");

        }
        if ("Galinha".equals(tipo)){
            System.out.println("PEGA GALINHA !");
        }


    }



}
