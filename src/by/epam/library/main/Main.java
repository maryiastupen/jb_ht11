package by.epam.library.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.entity.Library;
import by.epam.library.entity.Magazine;
import by.epam.library.entity.PrintedEdition;
import by.epam.library.service.LibraryService;
import by.epam.library.service.find.FindByAuthor;
import by.epam.library.service.find.FindByPrice;
import by.epam.library.service.find.Findable;
import by.epam.library.service.sort.PriceComparator;
import by.epam.library.service.sort.YearOfPublishmentComparator;
import by.epam.library.view.PrintAsList;
import by.epam.library.view.PrintAsTable;
import by.epam.library.view.Printable;
import by.epam.library.view.ViewAction;

public class Main {

    public static void main(String[] args) {

        Library myLibrary = new Library();
        myLibrary.add(new Book("Java", 300, 1997, "soft", "Shildt"));
        myLibrary.add(new Book("C++", 250, 2008, "semi-rigid", "Kite"));
        myLibrary.add(new Book("PHP", 480, 1996, "semi-rigid", "Shildt"));
        myLibrary.add(new Magazine(100, "Erudit", 2018, "scientific"));

        Findable matcher = new FindByAuthor("Shildt");

        LibraryService libService = new LibraryService();
        List<PrintedEdition> foundedBooks = libService.find(myLibrary, matcher);

        Comparator<PrintedEdition> priceComparator = new PriceComparator();
        Comparator<PrintedEdition> yearOfPublishmentComparator = new YearOfPublishmentComparator();

        Collections.sort(foundedBooks, priceComparator);
        ViewAction.print(new PrintAsList(), foundedBooks);

        Collections.sort(foundedBooks, yearOfPublishmentComparator);
        ViewAction.print(new PrintAsList(), foundedBooks);

    }

}
