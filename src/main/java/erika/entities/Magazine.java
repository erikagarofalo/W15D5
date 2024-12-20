package ageria.entities;

import ageria.enums.Periodicity;

public class Magazine extends CatalogElement {

    private Periodicity periodicity;

    public Magazine(int isbn, String title, int publishedDate, int pages, Periodicity periodicity) {
        super(isbn, title, publishedDate, pages);
        this.periodicity = periodicity;
    }

    @Override
    public String toString() {
        return "Magazine: " +
                "periodicity: " + periodicity;
    }


}
