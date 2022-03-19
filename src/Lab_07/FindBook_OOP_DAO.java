package Lab_07;

public class FindBook_OOP_DAO {
    private String ISBN;
    private String title;
    private String authorName;
    private int year;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FindBook_OOP_DAO(){}

    public FindBook_OOP_DAO(String ISBN, String title, String authorName, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "FindBook_OOP{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year +
                '}';
    }
}
