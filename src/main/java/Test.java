import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;
import decorateurs.Caramel;
import decorateurs.Chocolat;
import decorateurs.Noisette;

public class Test {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------");
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("---------------------");

        System.out.println("**********************");
        Boisson b;
        b = new Chocolat(new Caramel(new Noisette(new Noisette(new Espresso()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        //java.io
    }
}
