package by.epam.library.entity;

import java.util.Objects;

public class Book extends PrintedEdition{
	private String coverType;
	private String author;
	
	public Book(String title, double price, int yearOfPublishment, String coverType, String author) {
		super(price, title, yearOfPublishment);
		this.coverType = coverType;
		this.author = author;
	}

	public String getCoverType() {
		return coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Book book = (Book) o;
		return Objects.equals(getCoverType(), book.getCoverType()) &&
				Objects.equals(getAuthor(), book.getAuthor());
	}

	@Override
	public int hashCode() {

		return Objects.hash(super.hashCode(), getCoverType(), getAuthor());
	}
}
