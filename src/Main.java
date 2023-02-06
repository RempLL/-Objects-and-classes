public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр","Пушкин");
        Author bunin = new Author("Иван","Бунин");
        Book natalie = new Book("Натали",1942,bunin);
        Book prorok = new Book("Пророк", 1829,pushkin);

        System.out.println(pushkin.getName()+" "+pushkin.getSurname());

        System.out.println(bunin.getName()+" "+bunin.getSurname());

        System.out.println(natalie.getTitle()+" "+natalie.getYearPublications()+" "
                +natalie.author().getName()+" "+natalie.author().getSurname());

        System.out.println(prorok.getTitle()+" "+prorok.getYearPublications()+" "
                +prorok.author().getName()+" "+prorok.author().getSurname());

        prorok.setYearPublications(1828);
        System.out.println(prorok.getYearPublications());
    }
}