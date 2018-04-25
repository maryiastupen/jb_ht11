package by.epam.library.entity;

import java.util.Objects;

public class Magazine extends PrintedEdition{
	private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Magazine(double price, String title, int yearOfPublishment, String genre) {
		super(price, title, yearOfPublishment);
		this.genre = genre;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(getGenre(), magazine.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGenre());
    }
}
