import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void  setSurname(String surname){
        this.surname = surname;
    }

    public String toString(){
        return name + " " +surname;
    }

    public boolean equals(Object anObject){

        if (this == anObject) {
            return true;
        }

        if (anObject == null || getClass() != anObject.getClass()) {
            return false;
        }

        Author author = (Author) anObject;
        return Objects.equals(name,author.name) && Objects.equals(surname,author.surname);
    }

    public int hashCode(){
       return Objects.hash(name,surname);
    }

}
