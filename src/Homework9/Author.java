package Homework9;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        Author ob = (Author) obj;
        if (this.name == ob.getName() && (this.surname == ob.getSurname()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }

    @Override
    public String toString() {
        return "Имя автора: " + this.name + " " + this.surname + "; ";
    }
}
