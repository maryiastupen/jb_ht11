package by.epam.library.service.find;

import by.epam.library.entity.Book;
import by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;
import java.util.List;

public class FindByAuthor implements Findable {

    private String author;

    public FindByAuthor(String author) {
        this.author = author;
    }

    @Override
    public List<PrintedEdition> find(List<PrintedEdition> units) {
        List<PrintedEdition> resultList = new ArrayList<>();

        for (PrintedEdition unit : units) {
            if (unit instanceof Book) {
                if (((Book) unit).getAuthor().equals(author)) {
                    resultList.add((Book) unit);
                }
            }

        }
        return resultList;
    }
}
