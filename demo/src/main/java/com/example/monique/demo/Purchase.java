package com.example.monique.demo;


import javax.persistence.*;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String item;

    private String category;

    private double price;

    private String notice;

    @ManyToOne
    private User user;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }

    public void setPrice(double price)  {
        this.price = price;
    }

    public String getNotice() { return notice; }

    public void setNotice(String notice) { this.notice = notice; }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
