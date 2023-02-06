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

}
