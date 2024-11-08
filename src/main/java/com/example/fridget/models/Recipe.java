package com.example.fridget.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Recipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Ingredients> ingredients;

    private String name;
    
    private String description;

    private int prepTime;

    private int cookTime;

    private int totalTime;

    public Recipe(int id, List<Ingredients> ingredients, String name, String description, int prepTime, int cookTime, int totalTime) {
        this.id = id;
        this.ingredients = ingredients;
        this.name = name;
        this.description = description;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.totalTime = totalTime;
    }
//Need a list of steps for preping and cooking
    //Not sure how to handle this

    //This should be a list/table
    //private String cuisine;

    //Add later
    //private String photoUrl;


    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public Recipe() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", prepTime=" + prepTime +
                ", cookTime=" + cookTime +
                ", totalTime=" + totalTime +
                ", ingredients=" + ingredients +
                '}';
    }
}
