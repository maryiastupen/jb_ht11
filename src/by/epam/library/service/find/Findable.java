package by.epam.library.service.find;

import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.entity.PrintedEdition;

public interface Findable {
	List<PrintedEdition> find(List<PrintedEdition> units);
}
