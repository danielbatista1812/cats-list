import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {

        // fazer a mesma coisa pra dog FEITO !
        // fazer a mensagem do metodo abstrato ser dinamica
        // passar valor como parametro e imprimi-lo


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

        List <Dog> dogs = new ArrayList<>();

        final Dog dog = new Dog("Bolonhas",4, "Macho", dono1, true, true, false, true);
        final Dog dog1 = new Dog("Bola de neve", 3, "Femea", dono3, false,true,true,false);
        final Dog dog2 = new Dog("Chimbinha", 2,"Femea", dono2, false,false,false,true);

        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);

        showDogsName(dogs);

        List <Cat> cats = new ArrayList<>();

        final Cat cat = new Cat("Latrel", 5, "Macho", dono3, true);
        final Cat cat0 = new Cat("Gon", 12, "Femea", dono2, true);
        final Cat cat1 = new Cat("Vegeta", 25, "Macho", dono1, true);

        cats.add(cat);
        cats.add(cat0);
        cats.add(cat1);

//        showCatsName(cats);

    }

    public static void showDogsName(final List<Dog> dogs){
        for (Dog dog : dogs) {
            System.out.println("Nome do dog: " + dog.getNome());
            System.out.println("Idade do dog: " + dog.getIdade());
            System.out.println("Genero do dog: " + dog.getGenero());
            System.out.println("Dono do dog: " + dog.getDono().getNomeDono());

            // a frase eu passo como parametro do dog
            //  vou fzr umas brincadeiras aqui
            dog.fazerMerda("Chupa europa!");
            System.out.println("--------------------");

        }
    }


    public static void showCatsName(final List<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println("Nome do gato: " + cat.getNome());
            System.out.println("Idade do gato: " + cat.getIdade());
            System.out.println("Genero do gato: " + cat.getGenero());
            System.out.println("Dono do gato: " + cat.getDono().getNomeDono());

            // a frase eu passo como parametro
            cat.fazerMerda("Caga e esconde na areia");
            System.out.println("--------------------");
        }

    }

}
