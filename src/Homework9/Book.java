package Homework9;

public class Book {
    private String name;
    private Author author;
    private int age;

    public Book(String name, Author author ,int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    public String getName()  {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)  return true;
        Book ob = (Book) obj;
        if ((this.name == ob.getName() && this.age == ob.getAge()) && (this.author.equals(ob.getAuthor())))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age;
    }
    @Override
    public String toString() {
        return "Название книги:  " + this.name + "; " + " Год издания: " + this.age + "; ";
    }
}
