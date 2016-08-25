package com.objects;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;

/**
 * Created by ablackmo on 8/20/2016.
 */
@Document
public class Recipe {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Field
    private String title;
    @Field
    private String instructions;
    @Field
    private Map<String, List<String>> ingredients;
    @Field
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
