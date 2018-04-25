package by.epam.library.view;

import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.entity.Magazine;
import by.epam.library.entity.PrintedEdition;

public class PrintAsList implements Printable {

    @Override
    public void print(List<PrintedEdition> units) {
        for (PrintedEdition unit : units) {
            System.out.printf("Printed edition with %d id: Price is %f, title is %s, year of publishment is %d, ", unit.hashCode(), unit.getPrice(), unit.getTitle(), unit.getYearOfPublishment());

            if (unit instanceof Book) {
                System.out.printf("author is %s, cover type is %s", ((Book) unit).getAuthor(), ((Book) unit).getCoverType());
            }
            if (unit instanceof Magazine) {
                System.out.printf("genre is %s", ((Magazine) unit).getGenre());
            }
            System.out.println("\n");
        }

    }

}
