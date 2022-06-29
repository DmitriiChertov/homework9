package Homework9;

public class Book {
    private String name;
    private Author author;
    private int age;

    public Book(String name, Author author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }


    public String getName() {
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
    public String toString() {
        return this.author + "Название книги:  " + this.name + "; " + " Год издания: " + this.age + "; ";
    }

    @Override
    public boolean equals(Object obj) {
        Book ob = (Book) obj;
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.name.equals(ob.getName()) && this.author.equals(getAuthor()) && age == ob.getAge()) {
            return true;
        } else {
            return false;
        }
    }
}
