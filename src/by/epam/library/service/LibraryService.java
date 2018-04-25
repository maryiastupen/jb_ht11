package by.epam.library.service;

import java.util.Comparator;
import java.util.List;

import by.epam.library.entity.Library;
import by.epam.library.entity.PrintedEdition;
import by.epam.library.service.find.Findable;

public class LibraryService {
	
	public List<PrintedEdition> find(Library library, Findable findMatcher){
		List<PrintedEdition> units = library.getUnits();
		List<PrintedEdition> hasFined = null;
		hasFined = findMatcher.find(units);
		return hasFined;
	}
}
