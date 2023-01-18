interface LoanItem {
    double calculatePrice();
}

class LibraryItem {
    private String type;
    private String ID;

    public LibraryItem(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public String getID() {
        return ID;
    }
}

class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String ID, String author, String title, int numPages) {
        super(type, ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public double calculatePrice() {
        return numPages * 0.01;
    }
}

class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String ID, String band, String title, int numTracks) {
        super(type, ID); // calling super class constructor
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    public String getBand() {
        return band;
    }

    public String getTitle() {
        return title;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public double calculatePrice() {
        return numTracks * 0.05;
    }
}
