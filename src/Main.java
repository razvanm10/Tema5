import animal_type.AnimalType;
import cerinta.Cerinta;

import javax.management.InvalidAttributeValueException;

import static repository.Repository.zooOne;

public class Main {
    public static void main(String[] args) {
        Cerinta cerinta = new Cerinta();
        try {
            zooOne.getSpecificTypeOfAnimal(AnimalType.ELEPHANT).forEach(System.out::println);
            zooOne.getSpecificTypeOfAnimal(AnimalType.FLAMINGO).forEach(System.out::println);
            zooOne.getSpecificTypeOfAnimal(AnimalType.TIGER).forEach(System.out::println);
            zooOne.getSpecificTypeOfAnimal(AnimalType.LION).forEach(System.out::println);
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("___________________________________");

        System.out.println(zooOne.getReport(AnimalType.ELEPHANT));
        System.out.println("___________________________________");
        System.out.println(zooOne.getReport(AnimalType.FLAMINGO));
        System.out.println("___________________________________");

        System.out.println(zooOne.getReport(AnimalType.LION));
        System.out.println("___________________________________");

        System.out.println(zooOne.getReport(AnimalType.TIGER));

    }
}