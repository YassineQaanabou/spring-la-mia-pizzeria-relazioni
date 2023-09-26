package org.learning.java.springlamiapizzeriacrud.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "offers")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "pizza_id", nullable = false)
    private Pizza pizza;
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;

    public Integer getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getTitle() {
        return title;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
