package Generics.Task_2;

import java.util.List;

public class Library<T extends LibraryMaterial> {
   private List<LibraryMaterial> books;

   public void putBook(LibraryMaterial book) {
       books.add(book);
   }

    public List<LibraryMaterial> getBooks() {
        return books;
    }

    public void setBooks(List<LibraryMaterial> books) {
        this.books = books;
    }
}
