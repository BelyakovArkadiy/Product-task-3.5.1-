package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode ;

@Data
@EqualsAndHashCode

public class Book extends Product {
 private String author;

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public Book() {

 }

 public Book(int id, String name, int price) {
  super(id, name, price);
 }
}
