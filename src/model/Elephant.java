package model;

import java.util.Objects;

public class Elephant implements Animal {

    private String name;

    private Double weight;

    private String details;

    private Double quantityOfFoodNeededPerDay;

    public Elephant(String name, Double weight, String details, Double quantityOfFoodNeededPerDay) {
        this.name = name;
        this.weight = weight;
        this.details = details;
        this.quantityOfFoodNeededPerDay = quantityOfFoodNeededPerDay;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getWeight() {
        return null;
    }

    @Override
    public String getDetails() {
        return null;
    }

    @Override
    public Double getAverageFoodQuantityDaily() {
        return this.quantityOfFoodNeededPerDay;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", details='" + details + '\'' +
                ", quantityOfFoodNeededPerDay=" + quantityOfFoodNeededPerDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elephant elephant = (Elephant) o;
        return Objects.equals(name, elephant.name) && Objects.equals(weight, elephant.weight) && Objects.equals(details, elephant.details) && Objects.equals(quantityOfFoodNeededPerDay, elephant.quantityOfFoodNeededPerDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, details, quantityOfFoodNeededPerDay);
    }
}
