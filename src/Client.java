import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {

        // criar classe bird extendendo de Animal
        // criar parametro chamado voa do tipo boolean
        /* O método fazerMerda deve receber o tipo da ave
        *  Se a ave for tucano, imprimir "ola tucano, lambecano"
        *  Se a ave for bentivi, imprimir "bentivi" 3 vezes
        *  Se for pombo, imprimir "pegue pombo"
        *  Se vor galinha imprimir "pega a galinha"
        *  Imprimir se a ave voa ou nao
        *  */


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

        List <Bird> birds = new ArrayList<>();

        final Bird bird = new Bird("Narigudo", 5, "Macho", dono2, true,"Tucano");
        final Bird bird1 = new Bird("Teviu", 2, "Macho", dono1, true,"Bentivi");
        final Bird bird2 = new Bird("Mané galinha", 3,"Macho", dono3, false,"Galinha");
        final Bird bird3 = new Bird("Richarlison", 23, "Femea", dono1, false,"Pombo");

        birds.add(bird);
        birds.add(bird1);
        birds.add(bird2);
        birds.add(bird3);

        showBirdsName(birds);


        List <Dog> dogs = new ArrayList<>();

        final Dog dog = new Dog("Bolonhas",4, "Macho", dono1, true, true, false, true);
        final Dog dog1 = new Dog("Bola de neve", 3, "Femea", dono3, false,true,true,false);
        final Dog dog2 = new Dog("Chimbinha", 2,"Femea", dono2, false,false,false,true);

        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);

       // showDogsName(dogs);

        List <Cat> cats = new ArrayList<>();

        final Cat cat = new Cat("Latrel", 5, "Macho", dono3, true);
        final Cat cat0 = new Cat("Gon", 12, "Femea", dono2, true);
        final Cat cat1 = new Cat("Vegeta", 25, "Macho", dono1, true);

        cats.add(cat);
        cats.add(cat0);
        cats.add(cat1);

//        showCatsName(cats);

    }


    public static void showBirdsName(final List<Bird> birds){
        for (Bird bird : birds){
            System.out.println("Nome do bird: " + bird.getNome());
            System.out.println("Idade do bird: " + bird.getIdade());
            System.out.println("Genero do bird: " + bird.getGenero());
            System.out.println("Dono do bird: " + bird.getDono().getNomeDono());
            System.out.println("Voa ? " + bird.isVoa());

            bird.fazerMerda("Tucano");
            System.out.println("---------------");

        }
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
