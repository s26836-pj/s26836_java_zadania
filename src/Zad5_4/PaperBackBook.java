package Zad5_4;

class PaperbackBook extends Book {
    private int publicationYear;

    public PaperbackBook(String title, String author, int pageCount, int publicationYear) {
        super(title, author, pageCount);
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

