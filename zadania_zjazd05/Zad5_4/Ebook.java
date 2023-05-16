package Zad5_4;

public class Ebook extends Book {
    private int fileSize;
    private String format;

    public Ebook(String title, String author, int pageCount, int fileSize, String format) {
        super(title, author, pageCount);
        this.fileSize = fileSize;
        this.format = format;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
