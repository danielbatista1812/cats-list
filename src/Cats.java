import java.util.ArrayList;
import java.util.List;


public class Cats {
    public static void main(String[] args) {

        Dono dono1 = new Dono();
        dono1.setNomeDono("Goku");
        dono1.setTelefone(979235666);
        dono1.setEndereco("Rua Esfera do Dragão 666");
        dono1.setEmail("KakarotoSayajin@gmail.com");

        Dono dono2 = new Dono();
        dono2.setNomeDono("Hisoka");
        dono2.setTelefone(123456789);
        dono2.setEndereco("Rua ao lado do Gon 69");
        dono2.setEmail("BungeGumRubber@hotmail.com");

        Dono dono3 = new Dono();
        dono3.setNomeDono("Julius");
        dono3.setTelefone(741852963);
        dono3.setEndereco("Rua logo ali 199");
        dono3.setEmail("Euestareilá@broke.com.br");


        List<Cat> cats = new ArrayList<>();

        final Cat cat = new Cat("Latrel", 5, "Macho", dono3);
        final Cat cat0 = new Cat("Gon", 12, "Femea", dono2);
        final Cat cat1 = new Cat("Vegeta", 25, "Macho", dono1);

        cats.add(cat);
        cats.add(cat0);
        cats.add(cat1);

        showCatsName(cats);

    }

    public static void showCatsName(final List<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println("Nome do gato: " + cat.getNome());
            System.out.println("Idade do gato: " + cat.getIdade());
            System.out.println("Genero do gato: " + cat.getGenero());
            System.out.println("Dono do gato: " + cat.getDono().getNomeDono());
            System.out.println("--------------------");
        }

    }

}
