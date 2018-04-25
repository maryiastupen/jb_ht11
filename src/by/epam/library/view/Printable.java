package by.epam.library.view;

import java.util.List;

import by.epam.library.entity.PrintedEdition;

public interface Printable {
	void print(List<PrintedEdition> units);
}
