package com.example.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    int productId;
    String BookName;
    String AuthorName;
    String genre;
    int price;
    int quantityAvailable;
    String BookDescription;
    String publisher;
    int pageCount;
    String language;
    String ISBN;
    String publicationDate;
    public Book() {

    }

    public Book(int productId, String bookName, String authorName, String genre, int price, int quantityAvailable,
            String bookDescription, String publisher, int pageCount, String language, String iSBN,
            String publicationDate) {
        this.productId = productId;
        BookName = bookName;
        AuthorName = authorName;
        this.genre = genre;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        BookDescription = bookDescription;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.language = language;
        ISBN = iSBN;
        this.publicationDate = publicationDate;
    }

    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getBookDescription() {
        return BookDescription;
    }

    public void setBookDescription(String bookDescription) {
        BookDescription = bookDescription;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }


}
