public class Cat {

    private String nome;
    private Integer idade;
    private String genero;

    private Dono dono;


    public Cat(String nome, Integer idade, String genero, Dono dono) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



}


