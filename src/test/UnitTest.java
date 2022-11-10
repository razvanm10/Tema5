package test;

import animal_type.AnimalType;
import cerinta.Cerinta;
import model.Zoo;
import org.testng.Assert;
import org.testng.annotations.Test;
import repository.Repository;

import javax.management.InvalidAttributeValueException;

import java.util.List;

import static repository.Repository.zooOne;

public class UnitTest {

    @Test
    void testRapoarte(){
        Assert.assertEquals(zooOne.getReport(AnimalType.ELEPHANT), "Animal Type:ELEPHANT\n" +
                "Current number of: elephants in Zoo One 2\n" +
                "Animals with theirs description: Elephant{name='ElephantOne', weight=3000.0, details='big elephant, he eats kinda much', quantityOfFoodNeededPerDay=150.0}\n" +
                "Elephant{name='ElephantTwo', weight=1000.0, details='small elephant, he eats kinda much', quantityOfFoodNeededPerDay=120.0}\n" +
                "Lion{name='LionOne', weight=450.0, details='big lion, from South Africa', quantityOfFood=20.0}\n" +
                "Lion{name='LionTwo', weight=250.0, details='small lion, from East Africa', quantityOfFood=5.0}\n" +
                "Tiger{name='TigetOne', weight=300.0, details='big tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Tiger{name='TigetOne', weight=100.0, details='small tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Flamingo{name='FlamingoOne', weight=40.3, details='breed X flamingo', quantityOfFood=3.0}\n" +
                "Flamingo{name='FlamingoTwo', weight=39.0, details='breed Z flaming', quantityOfFood=4.0}\n" +
                "\n" +
                "Average Food Daily: 135.0\n" +
                "Average Food Monthly: 4050.0");
        Assert.assertEquals(zooOne.getReport(AnimalType.FLAMINGO), "Animal Type:FLAMINGO\n" +
                "Current number of: flamingos in Zoo One 2\n" +
                "Animals with theirs description: Elephant{name='ElephantOne', weight=3000.0, details='big elephant, he eats kinda much', quantityOfFoodNeededPerDay=150.0}\n" +
                "Elephant{name='ElephantTwo', weight=1000.0, details='small elephant, he eats kinda much', quantityOfFoodNeededPerDay=120.0}\n" +
                "Lion{name='LionOne', weight=450.0, details='big lion, from South Africa', quantityOfFood=20.0}\n" +
                "Lion{name='LionTwo', weight=250.0, details='small lion, from East Africa', quantityOfFood=5.0}\n" +
                "Tiger{name='TigetOne', weight=300.0, details='big tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Tiger{name='TigetOne', weight=100.0, details='small tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Flamingo{name='FlamingoOne', weight=40.3, details='breed X flamingo', quantityOfFood=3.0}\n" +
                "Flamingo{name='FlamingoTwo', weight=39.0, details='breed Z flaming', quantityOfFood=4.0}\n" +
                "\n" +
                "Average Food Daily: 3.5\n" +
                "Average Food Monthly: 105.0");
        Assert.assertEquals(zooOne.getReport(AnimalType.LION), "Animal Type:LION\n" +
                "Current number of: lions in Zoo One 2\n" +
                "Animals with theirs description: Elephant{name='ElephantOne', weight=3000.0, details='big elephant, he eats kinda much', quantityOfFoodNeededPerDay=150.0}\n" +
                "Elephant{name='ElephantTwo', weight=1000.0, details='small elephant, he eats kinda much', quantityOfFoodNeededPerDay=120.0}\n" +
                "Lion{name='LionOne', weight=450.0, details='big lion, from South Africa', quantityOfFood=20.0}\n" +
                "Lion{name='LionTwo', weight=250.0, details='small lion, from East Africa', quantityOfFood=5.0}\n" +
                "Tiger{name='TigetOne', weight=300.0, details='big tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Tiger{name='TigetOne', weight=100.0, details='small tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Flamingo{name='FlamingoOne', weight=40.3, details='breed X flamingo', quantityOfFood=3.0}\n" +
                "Flamingo{name='FlamingoTwo', weight=39.0, details='breed Z flaming', quantityOfFood=4.0}\n" +
                "\n" +
                "Average Food Daily: 12.5\n" +
                "Average Food Monthly: 375.0");
        Assert.assertEquals(zooOne.getReport(AnimalType.TIGER), "Animal Type:TIGER\n" +
                "Current number of: tigers in Zoo One 2\n" +
                "Animals with theirs description: Elephant{name='ElephantOne', weight=3000.0, details='big elephant, he eats kinda much', quantityOfFoodNeededPerDay=150.0}\n" +
                "Elephant{name='ElephantTwo', weight=1000.0, details='small elephant, he eats kinda much', quantityOfFoodNeededPerDay=120.0}\n" +
                "Lion{name='LionOne', weight=450.0, details='big lion, from South Africa', quantityOfFood=20.0}\n" +
                "Lion{name='LionTwo', weight=250.0, details='small lion, from East Africa', quantityOfFood=5.0}\n" +
                "Tiger{name='TigetOne', weight=300.0, details='big tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Tiger{name='TigetOne', weight=100.0, details='small tiger, from South Asia', quantityOfFood=58.0}\n" +
                "Flamingo{name='FlamingoOne', weight=40.3, details='breed X flamingo', quantityOfFood=3.0}\n" +
                "Flamingo{name='FlamingoTwo', weight=39.0, details='breed Z flaming', quantityOfFood=4.0}\n" +
                "\n" +
                "Average Food Daily: 58.0\n" +
                "Average Food Monthly: 1740.0");
    }

    @Test
    void testListe() {
        Assert.assertEquals(zooOne.getSpecificTypeOfAnimalForTest(AnimalType.ELEPHANT), Repository.listaElefantiTest);
        Assert.assertEquals(zooOne.getSpecificTypeOfAnimalForTest(AnimalType.TIGER), Repository.listaTigriiTest);
        Assert.assertEquals(zooOne.getSpecificTypeOfAnimalForTest(AnimalType.FLAMINGO), Repository.listaFlamingoTest);
        Assert.assertEquals(zooOne.getSpecificTypeOfAnimalForTest(AnimalType.LION), Repository.listaLeiTest);
        Assert.assertEquals(zooOne.getSpecificTypeOfAnimalForTest(AnimalType.testWrongData), List.of());
    }

}
