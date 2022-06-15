import animalkingdom.Animal;
import animalkingdom.Crocodile;
import animalkingdom.Eagle;
import animalkingdom.Eal;

public class Main {
    public static void main(String[] args) throws Exception {

        Crocodile croc = new Crocodile();
        System.out.println(croc.showInfo());

        Eal eal = new Eal();
        System.out.println(eal.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
    }
}
