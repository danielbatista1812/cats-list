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

        switch(tipo){
            case "Tucano":
                System.out.println("Ola TUcano, lambecano");
                break;
            case "Bentivi":
                for (int i = 0; i < 3; i++) {
                    System.out.println("BENTIVI");
                }
                break;
            case "Pombo":
                System.out.println("Pegue o pombo");
                break;
            case "Galinha":
                System.out.println("Pega galinha");
                break;
            default:
                System.out.println("Tipo não encontrado");
        }


    }


}
