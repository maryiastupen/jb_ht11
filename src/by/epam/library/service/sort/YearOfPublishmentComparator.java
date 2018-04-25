package by.epam.library.service.sort;

import by.epam.library.entity.PrintedEdition;

import java.util.Comparator;

public class YearOfPublishmentComparator implements Comparator<PrintedEdition> {

    @Override
    public int compare(PrintedEdition printedEdition1, PrintedEdition printedEdition2) {
        if (printedEdition1.getYearOfPublishment() > printedEdition2.getYearOfPublishment()) {
            return 1;
        } else if (printedEdition1.getYearOfPublishment() < printedEdition2.getYearOfPublishment()) {
            return -1;
        } else {
            return 0;
        }
    }
}
