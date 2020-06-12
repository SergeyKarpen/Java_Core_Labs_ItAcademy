package labs.itacademy.skarpen.Thread;

public class BooksInTheLibrary {

    private String nameBook;
    private int numberBook;
    private boolean readingInTheHall;
    private boolean inLibrary;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumberBook() {
        return numberBook;
    }

    public void setNumberBook(int numberBook) {
        this.numberBook = numberBook;
    }

    public boolean isReadingInTheHall() {
        return readingInTheHall;
    }

    public void setReadingInTheHall(boolean readingInTheHall) {
        this.readingInTheHall = readingInTheHall;
    }

    public boolean isInLibrary() {
        return inLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        this.inLibrary = inLibrary;
    }

    public BooksInTheLibrary(String nameBook, int numberBook, boolean readingInTheHall, boolean inLibrary) {
        this.nameBook = nameBook;
        this.numberBook = numberBook;
        this.readingInTheHall = readingInTheHall;
        this.inLibrary = inLibrary;
    }
}

