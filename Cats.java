import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cats {
    public static void main(String[] args) {

        final List<Cat> cats = new ArrayList<>();

        final Cat cat = new Cat("Latrel", 5, "Macho","Julius");
        final Cat cat0 = new Cat("Gon",12,"Femea", "Hisoka");
        final Cat cat1 = new Cat("Vegeta",25, "Macho","Goku");

        cats.add(cat);
        cats.add(cat0);
        cats.add(cat1);

        showCatsName(cats);

    }
    public static void showCatsName(final List<Cat> cats){
        for (Cat dog: cats) {
            System.out.println("Nome do gato: " + dog.getNome());
            System.out.println("Idade do gato: " + dog.getIdade());
            System.out.println("Genero do gato: " + dog.getGenero());
            System.out.println("Dono do gato: " + dog.getDono());
            System.out.println("--------------------");
        }

    }
}
