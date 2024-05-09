package web.model;

import java.util.Objects;

public class Car {
    private String firm;

    private String model;

    private int year;

    public Car() {

    }

    public Car(String firm, String model, int year) {
        this.firm = firm;
        this.model = model;
        this.year = year;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(firm, car.firm) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firm, model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
