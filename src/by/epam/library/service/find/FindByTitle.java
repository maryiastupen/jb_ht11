package by.epam.library.service.find;

import java.util.ArrayList;
import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.entity.PrintedEdition;

public class FindByTitle implements Findable{
	private String title;
	
	public FindByTitle(String title) {
		this.title = title;
	}

	@Override
	public List<PrintedEdition> find(List<PrintedEdition> units) {
		List<PrintedEdition> resultUnits = new ArrayList<PrintedEdition>();

		for(int i = 0; i < units.size(); i++) {
			PrintedEdition obj = units.get(i);
			if (title == obj.getTitle()) {
				resultUnits.add(obj);
			}
		}
		return resultUnits;
	}

}
