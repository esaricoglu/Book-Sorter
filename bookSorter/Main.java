package bookSorter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Book b1 = new Book("A", 200, "Aziz Nesin", "27/09/1967");
        Book b2 = new Book("B", 150, "Yaşar Kemal", "12/06/1970");
        Book b3 = new Book("C", 100, "Sabahattin Ali", "03/11/2001");
        Book b4 = new Book("D", 300, "George Orwell", "21/02/2015");
        Book b5 = new Book("E", 250, "Ahmet Ümit", "16/05/1995");

        Set<Book> bookSortedByName = new TreeSet<>();

        bookSortedByName.add(b1);
        bookSortedByName.add(b2);
        bookSortedByName.add(b3);
        bookSortedByName.add(b4);
        bookSortedByName.add(b5);

        for (Book b : bookSortedByName) {
            System.out.println(b.getName());
        }

        Set<Book> bookSortedByPageNumber = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPage() - o2.getNumberOfPage();
            }
        });

        bookSortedByPageNumber.add(b1);
        bookSortedByPageNumber.add(b2);
        bookSortedByPageNumber.add(b3);
        bookSortedByPageNumber.add(b4);
        bookSortedByPageNumber.add(b5);

        for (Book b : bookSortedByPageNumber) {
            System.out.println(b.getNumberOfPage());
        }
    }
}
