package sda;

import java.util.Objects;

public class Book {
  private int id;
  private String name;
  private String author;

  public Book(int id, String name, String author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book)) return false;
    Book book = (Book) o;
    return id == book.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
