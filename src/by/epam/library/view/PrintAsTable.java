package by.epam.library.view;

import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.entity.Magazine;
import by.epam.library.entity.PrintedEdition;


public class PrintAsTable implements Printable{

	@Override
	public void print(List<PrintedEdition> units) {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("%10s %10s %20s %10s %10s %10s", "TITLE", "PRICE", "YEAR OF PUBLISHMENT", "AUTHOR", "COVER TYPE", "GENRE");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");


		for (PrintedEdition unit : units) {
			if (unit instanceof Book) {
				System.out.format("%10s %10s %20s %10s %10s %10s",
						(unit.getTitle()), unit.getPrice(), unit.getYearOfPublishment(), ((Book) unit).getAuthor(), ((Book) unit).getCoverType(), "-");
			}
			if (unit instanceof Magazine) {
				System.out.format("%10s %10s %20s %10s %10s %10s",
						(unit.getTitle()), unit.getPrice(), unit.getYearOfPublishment(), "-", "-", ((Magazine) unit).getGenre());
			}

			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------");
		
	}

}
