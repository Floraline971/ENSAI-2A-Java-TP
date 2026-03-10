package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Library lib = new Library("agora");
        lib.loadBooksFromCSV("books.csv");

        Magazine m1 = new Magazine()
        Magazine m2 = new Magazine()

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing);
    }
}