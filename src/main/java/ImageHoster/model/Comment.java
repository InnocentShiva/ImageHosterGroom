package ImageHoster.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


public class Comment {

    private int id;

    private String text;

    private LocalDate createdDate;

    //The 'images' table is mapped to 'users' table with Many:One mapping
    //One image can have only one user (owner) but one user can have multiple images
    //FetchType is EAGER
    @ManyToOne
    //Below annotation indicates that the name of the column in 'images' table referring the primary key in 'users' table will be 'user_id'
    @JoinColumn(name="user_id")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    //The 'images' table is mapped to 'users' table with Many:One mapping
    //One image can have only one user (owner) but one user can have multiple images
    //FetchType is EAGER
    @ManyToOne
    //Below annotation indicates that the name of the column in 'images' table referring the primary key in 'users' table will be 'user_id'
    @JoinColumn(name="image_id")
    private Image image;






}
