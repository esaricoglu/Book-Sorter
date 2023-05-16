package bookSorter;

public class Book implements Comparable<Book>{
    private String name;
    private int numberOfPage;
    private String authorName;
    private String date;

    public Book(String name, int numberOfPage, String authorName, String date) {
        this.name = name;
        this.numberOfPage = numberOfPage;
        this.authorName = authorName;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
}
