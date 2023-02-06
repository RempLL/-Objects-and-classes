import java.util.Objects;

public class Book {
    private String title;
    private int yearPublications;
    private Author author;

    public Book(String title,int yearPublications,Author author){
        this.title = title;
        this.yearPublications = yearPublications;
        this.author = author;
    }

    public String getTitle(){
        return  this.title;
    }

    public int getYearPublications(){
        return  this.yearPublications;
    }

    public Author author(){
        return this.author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setYearPublications(int yearPublications){
        this.yearPublications = yearPublications;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public String toString(){
        return "Название: " + title + " Дата публицации: " + yearPublications + " Автор: " + author;
    }

    public boolean equals(Object anObject){

        if (this == anObject) {
            return true;
        }

        if (anObject == null || getClass() != anObject.getClass()) {
            return false;
        }

        Book book = (Book) anObject;
        return Objects.equals(title,book.title) && yearPublications == book.yearPublications
                && Objects.equals(author,book.author);
    }

    public int hashCode(){
        return Objects.hash(title,yearPublications, author);
    }

}
