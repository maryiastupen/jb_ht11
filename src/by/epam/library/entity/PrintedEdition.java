package by.epam.library.entity;

import java.util.Objects;

public class PrintedEdition {
    private double price;
    private String title;
    private int yearOfPublishment;

    public PrintedEdition(double price, String title, int yearOfPublishment) {
        this.price = price;
        this.title = title;
        this.yearOfPublishment = yearOfPublishment;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishment() {
        return yearOfPublishment;
    }

    public void setYearOfPublishment(int yearOfPublishment) {
        this.yearOfPublishment = yearOfPublishment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintedEdition that = (PrintedEdition) o;
        return Double.compare(that.getPrice(), getPrice()) == 0 &&
                getYearOfPublishment() == that.getYearOfPublishment() &&
                Objects.equals(getTitle(), that.getTitle());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPrice(), getTitle(), getYearOfPublishment());
    }
}
