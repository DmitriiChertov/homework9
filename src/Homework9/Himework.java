package Homework9;

public class Himework {
    public static void main(String[] args) {
        Author author1 = new Author("Анджей", "Сапковский");
        Author author2 = new Author("Виктор", "Пелевин");
        Author author3 = new Author("Анджей", "Сапковский");
        Book book1 = new Book("Ведьмак", author1, 2010);
        Book book2 = new Book("Жизнь насекомых",author2, 2003);
        Book book3 = new Book("Ведьмак", author3, 2018);
        book1.setAge(2018);
        System.out.println("Год издания Ведьмака изменён на " + book1.getAge() + ";");
        System.out.println(book1.getAuthor() + book1.toString() + "Hash Code: " + book1.hashCode() + ";");
        System.out.println(book2.getAuthor() + book2.toString() + "Hash Code: " + book2.hashCode()+ ";");
        System.out.println(book3.getAuthor() + book3.toString() + "Hash Code: " + book3.hashCode()+ ";");
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
    }
}
