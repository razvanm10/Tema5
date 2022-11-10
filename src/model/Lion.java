package model;

import java.util.Objects;

public class Lion implements Animal{

    private String name;

    private Double weight;

    private String details;

    private Double quantityOfFood;

    public Lion(String name, Double weight, String details, Double quantityOfFood) {
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
        return quantityOfFood;
    }

    @Override
    public String toString() {
        return "Lion{" +
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
        Lion lion = (Lion) o;
        return Objects.equals(name, lion.name) && Objects.equals(weight, lion.weight) && Objects.equals(details, lion.details) && Objects.equals(quantityOfFood, lion.quantityOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, details, quantityOfFood);
    }
}
