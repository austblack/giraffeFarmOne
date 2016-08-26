package com.repo;

import com.objects.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ablackmo on 8/20/2016.
 */
public interface RecipeRepo extends MongoRepository<Recipe, String> {


    List<Recipe> findByLastName(String userId);


}
