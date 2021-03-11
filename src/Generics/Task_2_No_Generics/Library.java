package Generics.Task_2_No_Generics;

import java.util.ArrayList;
import java.util.List;

public class Library {
   private List<LibraryMaterial> books = new ArrayList<>();

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
