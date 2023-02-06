public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр","Пушкин");
        Author pushkin2 = new Author("Александр","Пушкин");
        Author bunin = new Author("Иван","Бунин");
        Book natalie = new Book("Натали",1942,bunin);
        Book prorok = new Book("Пророк", 1829,pushkin);
        Book natalie2 = new Book("Натали",1942,bunin);

        prorok.setYearPublications(1828);

        System.out.println(pushkin);

        System.out.println(natalie);

        System.out.println(pushkin.equals(pushkin2));

        System.out.println(natalie.equals(natalie2));

        System.out.println(natalie.hashCode());

        System.out.println(pushkin.hashCode());
        System.out.println(pushkin2.hashCode());
    }
}