package model;

import java.util.Objects;

public class Flamingo implements Animal {
    private String name;

    private Double weight;

    private String details;

    private Double quantityOfFood;

    public Flamingo(String name, Double weight, String details, Double quantityOfFood) {
        this.name = name;
        this.weight = weight;
        this.details = details;
        this.quantityOfFood = quantityOfFood;
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
        return this.quantityOfFood;
    }


    @Override
    public String toString() {
        return "Flamingo{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", details='" + details + '\'' +
                ", quantityOfFood=" + quantityOfFood +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flamingo flamingo = (Flamingo) o;
        return Objects.equals(name, flamingo.name) && Objects.equals(weight, flamingo.weight) && Objects.equals(details, flamingo.details) && Objects.equals(quantityOfFood, flamingo.quantityOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, details, quantityOfFood);
    }
}
