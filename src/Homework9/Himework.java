package Homework9;

public class Himework {
    public static void main(String[] args) {
        Author author1 = new Author("Анджей", "Сапковский");
        Author author2 = new Author("Виктор", "Пелевин");
        Book book1 = new Book("Ведьмак", author1, 2010);
        Book book2 = new Book("Жизнь насекомых",author2, 2003);
        System.out.println(book1.getName() + " == " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + " == " + book1.getAge());
        System.out.println(book2.getName() + " == " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname() + " == " + book2.getAge());
        book1.setAge(2018);
        System.out.println(" Год издания Ведьмака изменён на - " + book1.getAge());
    }
}
