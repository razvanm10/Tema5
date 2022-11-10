package model;

import java.util.Objects;

public class Tiger implements Animal {

    private String name;

    private Double weight;

    private String details;

    private Double quantityOfFood;

    public Tiger(String name, Double weight, String details, Double quantityOfFood) {
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
        return "Tiger{" +
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
        Tiger tiger = (Tiger) o;
        return Objects.equals(name, tiger.name) && Objects.equals(weight, tiger.weight) && Objects.equals(details, tiger.details) && Objects.equals(quantityOfFood, tiger.quantityOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, details, quantityOfFood);
    }
}
