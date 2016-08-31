package com.repo;

import com.domain.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by ablackmo on 8/20/2016.
 */
public interface RecipeRepo extends MongoRepository<Recipe, String> {


   // List<Recipe> findByLastName(String userId);
    List<Recipe> findAllRecipes();


}
