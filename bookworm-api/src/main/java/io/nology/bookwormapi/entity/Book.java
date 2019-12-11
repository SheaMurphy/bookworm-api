package io.nology.bookwormapi.entity;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="google_id")
    private String googleId;

    @Column(name="title")
    private String title;

    @Column(name="published_date")
    private String publishedDate;

    @Column(name="description")
    private String description;

    @Column(name="page_count")
    private String pageCount;

    @Column(name="image_small")
    private String imageSmall;

    @Column(name="image")
    private String image;

    public Book(int id, String googleId, String title, String publishedDate, String description, boolean favourite, String pageCount, String image_small, String image) {
        this.id = id;
        this.googleId = googleId;
        this.title = title;
        this.publishedDate = publishedDate;
        this.description = description;
        this.pageCount = pageCount;
        this.imageSmall = image_small;
        this.image = image;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String image_small) {
        this.imageSmall = image_small;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
