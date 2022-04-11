package Lab_12;

public class BookModel implements Comparable<BookModel>{
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

    public BookModel(){}

    public BookModel(String ISBN, String title, String authorName, int year) {
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

    @Override
    public int compareTo(BookModel o) {
        // duyệt chuỗi và tính tổng kiểu decimal cua tưng ký tự  (phải chuyển về kiểu số nguyên)

        int total1 = 0;
        int total2 = 0;

        for (int i = 0; i < o.getTitle().length(); ++i) {
            total1 += (int)o.getTitle().charAt(i);
        }

        for (int i = 0; i < this.getTitle().length(); ++i) {
            total2 += (int)this.getTitle().charAt(i);
        }

        // so  sánh dua theo tổng trên
        if (total1 == total2) {
             return 0;
        }
        else if (total1 > total2) {
          return 1;
        } else {
            return -1;
        }
    }

}
