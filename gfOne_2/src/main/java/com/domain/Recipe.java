package com.domain;




import java.util.List;
import java.util.Map;

/**
 * Created by ablackmo on 8/20/2016.
 */public class Recipe {

     private int test;

    private long id;

    private String title;
    private String instructions;
    private Map<String, List<String>> ingredients;
    private String userName;

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setIngredients(Map<String, List<String>> ingredients) {
        this.ingredients = ingredients;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {

        return title;
    }

    public String getInstructions() {
        return instructions;
    }

    public Map<String, List<String>> getIngredients() {
        return ingredients;
    }

    public String getUserName() {
        return userName;
    }

    public long getId() {
        return id;
    }
}
