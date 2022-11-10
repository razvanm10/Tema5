package repository;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static List<Animal> animalsZooOne = List.of(
            new Elephant("ElephantOne", 3000.0, "big elephant, he eats kinda much", 150.0),
            new Elephant("ElephantTwo", 1000.0, "small elephant, he eats kinda much", 120.0),
            new Lion("LionOne", 450.0, "big lion, from South Africa", 20.0),
            new Lion("LionTwo", 250.0, "small lion, from East Africa", 5.0),
            new Tiger("TigetOne", 300.0, "big tiger, from South Asia", 58.0),
            new Tiger("TigetOne", 100.0, "small tiger, from South Asia", 58.0),
            new Flamingo("FlamingoOne", 40.3, "breed X flamingo", 3.0),
            new Flamingo("FlamingoTwo", 39.0, "breed Z flaming", 4.0)
    );

    private static List<Animal> animalsZooTwo = List.of(
            new Elephant("ElephantOne", 4000.0, "very big elephant, he eats kinda much", 200.0),
            new Lion("LionOne", 450.0, "big lion from zooTwo, from South Africa", 20.0),
            new Lion("LionTwo", 250.0, "small lion from zooTwo, from East Africa", 5.0),
            new Tiger("TigetOne", 300.0, "big tiger from zooTwo, from South Asia", 58.0),
            new Flamingo("FlamingoOne", 40.3, "breed X flamingo", 3.0)
    );

    public static Zoo zooOne = new Zoo("Zoo One", animalsZooOne);

    public static Zoo zooTwo = new Zoo("Zoo Two", animalsZooTwo);

    public static List<Elephant> listaElefantiTest = List.of(
            new Elephant("ElephantOne", 3000.0, "big elephant, he eats kinda much", 150.0),
            new Elephant("ElephantTwo", 1000.0, "small elephant, he eats kinda much", 120.0)
    );

    public static List<Flamingo> listaFlamingoTest = List.of(
            new Flamingo("FlamingoOne", 40.3, "breed X flamingo", 3.0),
            new Flamingo("FlamingoTwo", 39.0, "breed Z flaming", 4.0)
    );

    public static List<Lion> listaLeiTest = List.of(
            new Lion("LionOne", 450.0, "big lion, from South Africa", 20.0),
            new Lion("LionTwo", 250.0, "small lion, from East Africa", 5.0)
    );

    public static List<Tiger> listaTigriiTest = List.of(
            new Tiger("TigetOne", 300.0, "big tiger, from South Asia", 58.0),
            new Tiger("TigetOne", 100.0, "small tiger, from South Asia", 58.0)
    );

}
