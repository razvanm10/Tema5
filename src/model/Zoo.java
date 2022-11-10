package model;

import animal_type.AnimalType;

import javax.management.InvalidAttributeValueException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {

    private String name;

    private List<Animal> animals;


    public Zoo(String name, List<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }


    public List<Animal> getSpecificTypeOfAnimal(AnimalType type) throws InvalidAttributeValueException {
        switch (type) {
            case LION -> {
                return this.animals.stream()
                        .filter(animal -> animal instanceof Lion)
                        .collect(Collectors.toList());
            }
            case FLAMINGO -> {
                return this.animals.stream()
                        .filter(animal -> animal instanceof Flamingo)
                        .collect(Collectors.toList());
            }
            case ELEPHANT -> {
                return this.animals.stream()
                        .filter(animal -> animal instanceof Elephant)
                        .collect(Collectors.toList());
            }
            case TIGER -> {
                return this.animals.stream()
                        .filter(animal -> animal instanceof Tiger)
                        .collect(Collectors.toList());
            }
            default -> throw new InvalidAttributeValueException("Invalid Animal Type");
        }
    }

    public List<Animal> getSpecificTypeOfAnimalForTest(AnimalType type) {
        try {
            return this.getSpecificTypeOfAnimal(type);
        } catch (InvalidAttributeValueException e) {
            return List.of();
        }
    }

    private String getAnimalsAndTheirDetailsAsString() {
        StringBuilder builder = new StringBuilder();
        this.animals.forEach(el -> builder.append(el.toString()).append("\n"));
        return builder.toString();
    }

    private Double averageFoodNeededForAnAnimalTypeDaily(AnimalType type) {
        try {
            return this.getSpecificTypeOfAnimal(type).stream()
                    .mapToDouble(Animal::getAverageFoodQuantityDaily)
                    .average()
                    .orElse(0.0);
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }
    private Double averageFoodNeededForAnAnimalTypeMonthly(AnimalType type) {
        try {
            return this.getSpecificTypeOfAnimal(type)
                    .stream()
                    .mapToDouble(Animal::getAverageFoodQuantityDaily)
                    .average()
                    .orElse(0.0) * 30;
        } catch (InvalidAttributeValueException e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }

    public Map<String, Double> getQuantityOfNeededFood(AnimalType type) {
        return Map.of(
                "daily", this.averageFoodNeededForAnAnimalTypeDaily(type),
                "monthly", this.averageFoodNeededForAnAnimalTypeMonthly(type)
        );
    }

    public String getReport(AnimalType animalType) {
        try {
            return
                    ("Animal Type:" +  animalType.toString() + "\n" +
                            "Current number of: " + animalType.toString().toLowerCase()  + "s" + " in " + this.name + " " + this.getSpecificTypeOfAnimal(animalType).size() + "\n" +
                    "Animals with theirs description: " + this.getAnimalsAndTheirDetailsAsString() + "\n" +
                    "Average Food Daily: " + this.averageFoodNeededForAnAnimalTypeDaily(animalType) + "\n" +
                    "Average Food Monthly: " + this.averageFoodNeededForAnAnimalTypeMonthly(animalType)).trim();
        } catch (InvalidAttributeValueException e) {
            return e.getMessage();
        }


    }

}
